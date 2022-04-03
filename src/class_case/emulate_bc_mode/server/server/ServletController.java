package class_case.emulate_bc_mode.server.server;

import java.io.FileReader;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Properties;


public class ServletController {

    /**
     * 为何单独抽离出来处理
     *
     * 1. 请求 url 读取对应类的缓存机制
     * 2. 统一规则, 便于查找/使用 controller
     * 3. 将 controller 单例化, 降低内存消耗
     */

    private static final HashMap<String, String> controllerNameMap = new HashMap<String, String>();
    private static final HashMap<String, HttpServlet> controllerObjectMap = new HashMap<String, HttpServlet>();

    static {
        Properties properties = new Properties();
        try {
            properties.load(new FileReader("src/class_case/emulate_bc_mode/web.properties"));
            Enumeration<?> enumeration = properties.propertyNames();
            while (enumeration.hasMoreElements()) {
                String content = (String) enumeration.nextElement();
                String realControllerName = properties.getProperty(content);
                controllerNameMap.put(content, realControllerName);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void findController(HttpServletRequest request, HttpServletResponse response) {

        String content = request.getContent();

        try {

            HttpServlet controllerObject = controllerObjectMap.get(content);

            if (controllerObject == null) {

                String realControllerName = controllerNameMap.get(content);

                if (realControllerName != null) {

                    Class<?> cls = Class.forName(realControllerName);
                    controllerObject = (HttpServlet) cls.newInstance();
                    controllerObjectMap.put(content, controllerObject);
                }
            }

            assert controllerObject != null;

            Class<? extends HttpServlet> controllerClass = controllerObject.getClass();
            Method serviceMethod = controllerClass.getMethod("service", HttpServletRequest.class, HttpServletResponse.class);

            serviceMethod.invoke(controllerObject, request, response);

        } catch (IllegalAccessException | InstantiationException | InvocationTargetException e) {

            e.printStackTrace();

        } catch (ClassNotFoundException e) {

            response.write("请求的 " + content + " Controller不存在");

        } catch (NoSuchMethodException e) {

            response.write("405 没有可以执行的方法");
        }
    }
}