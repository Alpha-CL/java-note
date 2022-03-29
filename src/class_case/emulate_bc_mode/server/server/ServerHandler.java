package class_case.emulate_bc_mode.server.server;

import java.io.*;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.net.Socket;
import java.util.HashMap;
import java.util.Properties;

public class ServerHandler extends Thread {

    private Socket socket;

    public ServerHandler(Socket socket) {
        this.socket = socket;
    }

    public void run() {
        this.receiveRequest();
    }

    private void receiveRequest() {

        InputStream inputStream = null;

        try {

            inputStream = socket.getInputStream();
            InputStreamReader inputStreamReader = new InputStreamReader(inputStream);
            BufferedReader bufferedReader = new BufferedReader(inputStreamReader);

            String contentAndParams = bufferedReader.readLine();
            this.parseContentAndParams(contentAndParams);

        } catch (IOException e) {

            e.printStackTrace();
        }
    }

    private void parseContentAndParams(String contentAndParams) {

        String content = null;
        HashMap<String, String> paramsMap = null;
        int questionMarkIndex = contentAndParams.indexOf("?");

        if (questionMarkIndex != -1) {
            content = contentAndParams.substring(0, questionMarkIndex);
            paramsMap = new HashMap<String, String>();

            String params = contentAndParams.substring(questionMarkIndex + 1);
            String[] paramsArr = params.split("&");

            for (String param : paramsArr) {
                String[] keyAndValue = param.split("=");
                paramsMap.put(keyAndValue[0], keyAndValue[1]);
            }

        } else {

            content = contentAndParams;
        }

        Request request = new Request(content, paramsMap);
        Response response = new Response();
        this.findController(request, response);
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

    private void responseToBrowser() {

    }
}









