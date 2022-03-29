package class_case.emulate_bc_mode.server.server;

import java.util.HashMap;

public class Request {

    private String content;
    private HashMap<String, String> paramsMap;

    public Request() {
    }

    public Request(String content, HashMap<String, String> paramsMap) {
        this.content = content;
        this.paramsMap = paramsMap;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public HashMap<String, String> getParamsMap() {
        return paramsMap;
    }

    public void setParamsMap(HashMap<String, String> paramsMap) {
        this.paramsMap = paramsMap;
    }
}