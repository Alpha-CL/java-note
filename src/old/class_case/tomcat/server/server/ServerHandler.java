package src.old.class_case.tomcat.server.server;

import java.io.*;
import java.net.Socket;
import java.util.HashMap;

public class ServerHandler extends Thread {

    private final Socket socket;

    public ServerHandler(Socket socket) {
        this.socket = socket;
    }

    // 1. 启动该线程
    public void run() {

        this._receiveRequest();
    }

    // 2. 接收读取路由地址及参数
    private void _receiveRequest() {

        try {

            InputStream inputStream = socket.getInputStream();                              // 字节流
            InputStreamReader inputStreamReader = new InputStreamReader(inputStream);       // 字节流转化为字符流
            BufferedReader bufferedReader = new BufferedReader(inputStreamReader);          // 整行读取的字节流

            String routerAddr = bufferedReader.readLine();
            this._parseRouterAddr(routerAddr);

        } catch (IOException e) {

            e.printStackTrace();
        }
    }

    // 3. 解析路由及参数
    private void _parseRouterAddr(String routerAddr) {

//        System.out.println("routerAddr: " + routerAddr);

        String addr = null;
        HashMap<String, String> paramsMap = new HashMap<String, String>();

        int questionMarkIndex = routerAddr.indexOf("?");

        // 判断是否携带参数
        if (questionMarkIndex != -1) {

            addr = routerAddr.substring(0, questionMarkIndex);

            String paramsString = routerAddr.substring(questionMarkIndex + 1);
            String[] paramsCell = paramsString.split("&");
            for (String params : paramsCell) {
                String[] KV = params.split("=");
                paramsMap.put(KV[0], KV[1]);
            }

        } else {

            addr = routerAddr;
        }

        HttpServletRequest request = new HttpServletRequest(addr, paramsMap);
        HttpServletResponse response = new HttpServletResponse();

        // 4. 根据路由匹配相应的 Controller
        ServletController.findController(request, response);
        // 5. 将响应信息写回给浏览器
        this._responseToBrowser(response);
    }

    // 5. 将响应信息写回给浏览器
    private void _responseToBrowser(HttpServletResponse response) {

        try {

            PrintWriter out = new PrintWriter(socket.getOutputStream());
            out.println(response.getResponseContent());
            out.flush();

        } catch (IOException e) {

            e.printStackTrace();
        }
    }
}