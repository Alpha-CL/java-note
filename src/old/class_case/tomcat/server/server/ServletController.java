package src.old.class_case.tomcat.server.server;

import java.io.FileReader;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Properties;

public class ServletController {

    private static final HashMap<String, String> controllerNameMap = new HashMap<String, String>();
    private static final HashMap<String, HttpServlet> controllerInstanceMap = new HashMap<String, HttpServlet>();

    static {

        try {
            Properties properties = new Properties();
            properties.load(new FileReader("src/src.old.class_case/tomcat/web.properties"));
            Enumeration<?> enumeration = properties.propertyNames();

            System.out.println("\n/** controllerNameMap start */");
            while (enumeration.hasMoreElements()) {
                String routerAddr = (String) enumeration.nextElement();
                String controllerName = properties.getProperty(routerAddr);
                controllerNameMap.put(routerAddr, controllerName);
                System.out.println("{ " + routerAddr + ": " + controllerName + " }");
            }
            System.out.println("/** controllerNameMap end */\n");

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // 4. 根据路由匹配相应的 Controller
    public static void findController(HttpServletRequest request, HttpServletResponse response) {

        String routerAddr;

        if (request.getRouterAddr().contains("?")) {
            routerAddr = request.getRouterAddr().substring(0, request.getRouterAddr().indexOf("?"));
        } else {
            routerAddr = request.getRouterAddr();
        }

        // System.out.println("routerAddr: " + routerAddr);

        try {

            HttpServlet controllerInstance = controllerInstanceMap.get(routerAddr);

            if (controllerInstance == null) {

                String controllerName = controllerNameMap.get(routerAddr);

                if (controllerNameMap.get(routerAddr) != null) {

                    Class<?> controller = Class.forName(controllerName);
                    controllerInstance = (HttpServlet) controller.newInstance();
                    controllerInstanceMap.put(routerAddr, controllerInstance);
                }
            }

//            System.out.println(controllerInstanceMap);
//            System.out.println(controllerInstance);

            assert controllerInstance != null;
            Class<? extends HttpServlet> controller = controllerInstance.getClass();
            Method service = controller.getMethod("service", HttpServletRequest.class, HttpServletResponse.class);
            service.invoke(controllerInstance, request, response);

        } catch (IllegalAccessException | InstantiationException | InvocationTargetException e) {

            e.printStackTrace();

        } catch (ClassNotFoundException e) {

            response.write("请求的 " + routerAddr + " Controller不存在");

        } catch (NoSuchMethodException e) {

            response.write("405 没有可以执行的方法");
        }
    }
}


