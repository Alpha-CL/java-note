package class_case.emulate_bc_mode.browser;

import class_case.emulate_bc_mode.server.server.HtmlElement;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.*;

public class Browser {

    private final Scanner input = new Scanner(System.in);

    private Socket socket = null;
    private HashMap<String, HtmlElement> paramsMap = null;

    private String ip;
    private int port;

    {
        paramsMap = new HashMap<String, HtmlElement>();
    }

    public void openBrowser() {
        System.out.println("# url: ");
        String url = input.nextLine();
        this.parseURL(url);
    }

    private void parseURL(String url) {

        int colonIndex = url.indexOf(":");
        int slashIndex = url.indexOf("/");

        ip = url.substring(0, colonIndex);
        port = Integer.parseInt(url.substring(colonIndex + 1, slashIndex));
        String contentAndParams = url.substring(slashIndex + 1);
        this.createSocketAndSendRequest(ip, port, contentAndParams);
    }

    private void createSocketAndSendRequest(String ip, int port, String contentAndParams) {
        try {

            socket = new Socket(ip, port);
            PrintWriter out = new PrintWriter(socket.getOutputStream());
            out.println(contentAndParams);
            out.flush();

            this.receiveResponseContent();

        } catch (IOException e) {

            e.printStackTrace();
        }
    }

    private void receiveResponseContent() {

        try {

            BufferedReader reader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            String responseContent = reader.readLine();

            this.parseResponseContentAndShow(responseContent);

        } catch (IOException e) {

            e.printStackTrace();
        }
    }

    private void addHtmlElement(String htmlElement, String val, String paramsMapKey) {

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

        // System.out.println(paramsMap.get(key));
    }

    private void parseResponseContentAndShow(String responseContent) {

        String content = null;

        Scanner input = new Scanner(System.in);
        responseContent = responseContent.replace("<br/>", "\r\n");

        while (true) {

            int beginCharIndex = responseContent.indexOf("<");
            int endCharIndex = responseContent.indexOf("/>");

            if (beginCharIndex != -1 && endCharIndex != -1 && beginCharIndex < endCharIndex) {

                System.out.println(responseContent.substring(0, beginCharIndex));

                String htmlElement = responseContent.substring(beginCharIndex, endCharIndex + 2);

                if (htmlElement.contains("input")) {

                    String value = input.nextLine();
                    addHtmlElement(htmlElement, value, "");

                } else if (htmlElement.contains("form")) {

                    // System.out.println(htmlElement);
                    addHtmlElement(htmlElement, null, "form");

                    HtmlElement form = paramsMap.get("form");
                    if (form.getAction().trim().length() > 0) {
                        this.sendNewRequest(form.getAction(), paramsMap);
                    }
                }

                responseContent = responseContent.substring(endCharIndex + 1);

            } else {

                if (!responseContent.contains("</")) {
                    System.out.println(responseContent);
                }
                break;
            }
        }

//        System.out.println(responseContent);


//        for (Map.Entry<String, HtmlElement> entry : paramsMap.entrySet()) {
//            System.out.println("{ key: " + entry.getKey() + ", value: " + entry.getValue() + " },");
//        }
    }

    public void sendNewRequest(String api, HashMap<String, HtmlElement> paramsMap) {

        System.out.println(api);

        if (api != null) {
            StringBuilder url = new StringBuilder(ip);
            url.append(":");
            url.append(port);
            url.append("/");
            url.append(api);
            if (paramsMap != null) {
                url.append("?");
                Iterator<String> it = paramsMap.keySet().iterator();
                while (it.hasNext()) {
//                    System.out.println(it.next());
                    String paramProp = it.next().toString();
                    if (paramsMap.get(paramProp) != null && !paramProp.equals("form")) {
                        HtmlElement element = paramsMap.get(paramProp);
//                        System.out.println(element.getKey());
                        if (!Objects.equals(element.getKey(), "null") && !Objects.equals(element.getValue(), "null")) {
                            url.append(element.getKey()).append("=").append(element.getValue()).append("&");
                        }
                    }
                }
//                System.out.println(url.length());
                url.delete(url.length() - 1, url.length());
            }
            // System.out.println(url);
            this.parseURL(url.toString());
        }
    }
}
