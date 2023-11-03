package src.old.class_case.tomcat.server.controller;

import src.old.class_case.tomcat.server.server.HttpServletRequest;
import src.old.class_case.tomcat.server.server.HttpServletResponse;
import src.old.class_case.tomcat.server.server.HttpServlet;

public class LoginController extends HttpServlet {

    @Override
    public void service(HttpServletRequest request, HttpServletResponse response) {

        System.out.println("Invoked LoginController");

        String account = request.getParameter("account");
        String password = request.getParameter("password");

        System.out.println("{ account: " + account + ", password: " + password + " }" );
    }
}