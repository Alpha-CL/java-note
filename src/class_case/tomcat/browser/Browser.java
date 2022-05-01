package class_case.tomcat.browser;

import class_case.tomcat.server.server.HtmlElement;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.HashMap;
import java.util.Scanner;

public class Browser {

    private final Scanner input = new Scanner(System.in);

    private HashMap<String, HtmlElement> paramsMap = null;

    {
        paramsMap = new HashMap<String, HtmlElement>();
    }

    private Socket socket = null;

    private String ip;
    private int port;
    private String params;

    // 1. 打开浏览器
    public void openBrowser() {

        // ip:port?key=val
        System.out.println("请输入链接地址: ");

        String url = input.nextLine();

        this._parseURL(url);
    }

    // 2. 解析 url
    private void _parseURL(String url) {

        int colonIndex = url.indexOf(":");
        int slashIndex = url.indexOf("/");

        ip = url.substring(0, colonIndex);
        port = Integer.parseInt(url.substring(colonIndex + 1, slashIndex));
        params = url.substring(slashIndex + 1);

        this._createSocketAndSendRequest(ip, port, params);
    }

    // 3. 创建 Socket, 并传递参数
    private void _createSocketAndSendRequest(String ip, int port, String params) {

        try {

            socket = new Socket(ip, port);
            PrintWriter out = new PrintWriter(socket.getOutputStream());
            out.println(params);
            out.flush();

            this._receiveResponseContent();

        } catch (IOException e) {

            e.printStackTrace();
        }
    }

    // 4. 接受服务器的响应信息
    private void _receiveResponseContent() {

        try {

            assert false;
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            String responseContent = bufferedReader.readLine();

            this._parseResponseContentAndShow(responseContent);


        } catch (IOException e) {

            e.printStackTrace();
        }
    }

    // 5. 解析并展示响应内容到控制台
    private void _parseResponseContentAndShow(String responseContent) {

        // System.out.println(responseContent);

        responseContent = responseContent.replace("<br/>", "\r\n");

        while (true) {

            int lessThanIndex = responseContent.indexOf("<");
            int greaterThenIndex = responseContent.indexOf("/>");

            if (lessThanIndex != -1 && greaterThenIndex != -1 && lessThanIndex < greaterThenIndex) {

                String htmlElement = responseContent.substring(lessThanIndex, greaterThenIndex + 2);

                if (htmlElement.contains("input")) {

                    if (htmlElement.contains("account")) {
                        System.out.println("请输入账号: ");
                    } else if (htmlElement.contains("password")) {
                        System.out.println("请输入密码: ");
                    }

                    String value = input.nextLine();

                    if (htmlElement.contains("account")) {
                        this._addHtmlElement(htmlElement, value, "account");
                    } else if (htmlElement.contains("password")) {
                        this._addHtmlElement(htmlElement, value, "password");
                    }

                }

                if (htmlElement.contains("form")) {

                    this._addHtmlElement(htmlElement, null, "form");

                    HtmlElement form = paramsMap.get("form");
                    if (form != null && form.getAction().trim().length() > 0) {
                        this._sendNewRequest(form.getAction(), paramsMap);
                    }
                }

                responseContent = responseContent.substring(greaterThenIndex + 1);

            } else {

                // if (!responseContent.contains("</")) {
                //     System.out.println(responseContent);
                // }
                break;
            }
        }
    }

    // 6. 解析到 form 后重新请求对应的路径及传递参数
    private void _sendNewRequest(String routerAddr, HashMap<String, HtmlElement> paramsMap) {

//        System.out.println(routerAddr);
//        System.out.println(paramsMap);

        if (routerAddr != null) {

            StringBuilder url = new StringBuilder(ip);
            url.append(":").append(port);
            url.append("/").append(routerAddr);

            if (routerAddr.equals("login")) {

                if (paramsMap.get("account") != null && paramsMap.get("password") != null) {

                    HtmlElement accountInputElement = paramsMap.get("account");
                    HtmlElement passwordInputElement = paramsMap.get("password");

                    url.append("?");
                    url.append("account=").append(accountInputElement.getValue());
                    url.append("&");
                    url.append("password=").append(passwordInputElement.getValue());
                }
            }

            System.out.println("url: " + url);
            this._parseURL(url.toString());

//            this._parseURL("localhost:9999/login?account=alpha&password=111");
        }
    }

    private void _addHtmlElement(String htmlElement, String val, String paramsMapKey) {

        int elementBeginIndex = htmlElement.indexOf(" ");
        int elementEndIndex = htmlElement.indexOf("/>");

        int typeBeginIndex = htmlElement.indexOf("<");
        int typeEndIndex = htmlElement.indexOf(" ");
        String typeTemp = htmlElement.substring(typeBeginIndex + 1, typeEndIndex);

        String htmlContent = htmlElement.substring(elementBeginIndex, elementEndIndex);
        String[] htmlContentFragments = htmlContent.split(" ");

        String type = null;
        String key = null;
        String value = null;
        String action = null;
        String method = null;

        for (int i = 0; i < htmlContentFragments.length; i++) {

            String fragment = htmlContentFragments[i];

            if (fragment.contains("=")) {

                String[] KV = fragment.split("=");
                String kvKey = KV[0].replace("\"", "");
                String kvVal = KV[1].replace("\"", "").length() > 0 ? KV[1].replace("\"", "") : "null";

                if (kvKey.trim().equals("type")) {
                    type = kvVal;
                } else if (kvKey.trim().equals("key")) {
                    key = kvVal;
                } else if (kvKey.trim().equals("action")) {
                    action = kvVal;
                } else if (kvKey.trim().equals("method")) {
                    method = kvVal;
                } else if (kvKey.trim().equals("value")) {
                    value = val.trim().length() > 0 ? val : kvVal;
                }
            }
        }

        HtmlElement element = new HtmlElement(type, key, value, action, method);

        if (typeTemp.trim().length() > 0) {
            element.setType(typeTemp);
        }

        if (paramsMapKey.trim().length() > 0) {
            paramsMap.put(paramsMapKey, element);
        } else {
            paramsMap.put(key, element);
        }
    }
}