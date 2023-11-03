package src.old.class_case.tomcat.server.server;

import java.util.HashMap;

public class HttpServletRequest {

    private String routerAddr;
    private HashMap<String, String> params;

    public HttpServletRequest() {
    }

    public HttpServletRequest(String routerAddr, HashMap<String, String> params) {
        this.routerAddr = routerAddr;
        this.params = params;
    }

    public String getRouterAddr() {
        return routerAddr;
    }

    public void setRouterAddr(String routerAddr) {
        this.routerAddr = routerAddr;
    }

    public HashMap<String, String> getParams() {
        return params;
    }

    public void setParams(HashMap<String, String> params) {
        this.params = params;
    }

    public String getParameter(String key){

        if (this.params.size() > 0) {
            return this.params.get(key);
        }

        return  "";
    }
}