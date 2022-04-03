package class_case.emulate_bc_mode.server.server;

import java.io.*;
import java.net.Socket;
import java.util.HashMap;

public class ServerHandler extends Thread {

    private final Socket socket;

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

        HttpServletRequest request = new HttpServletRequest(content, paramsMap);
        HttpServletResponse response = new HttpServletResponse();

        ServletController.findController(request, response);

        this.responseToBrowser(response);
    }

    private void responseToBrowser(HttpServletResponse response) {

        try {

            PrintWriter out = new PrintWriter(socket.getOutputStream());
            out.println(response.getResponseContent());
            out.flush();

        } catch (IOException e) {

            e.printStackTrace();
        }
    }
}









