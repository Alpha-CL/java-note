package class_case.emulate_bc_mode.server.server;

import java.io.FileReader;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Properties;


public class controllerManager {

    /**
     * 为何单独抽离出来处理
     *
     * 1. 请求 url 读取对应类的缓存机制
     * 2. 统一规则, 便于查找/使用 controller
     * 3. 将 controller 单例化, 降低内存消耗
     */

    private static final HashMap<String, String> controllerNameMap = new HashMap<String, String>();

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

    private void findController(Request request, Response response) {

        String content = request.getContent();

        Properties properties = new Properties();
        try {
            properties.load(new FileReader("src/class_case/emulate_bc_mode/web.properties"));
            String realControllerName = properties.getProperty(content);
            Class<?> cls = Class.forName(realControllerName);
            Object ins = cls.newInstance();
            Method method = cls.getMethod("test", Request.class, Response.class);
            method.invoke(ins, request, response);
        } catch (IOException | ClassNotFoundException | NoSuchMethodException | IllegalAccessException | InvocationTargetException | InstantiationException e) {
            e.printStackTrace();
        }
    }

}