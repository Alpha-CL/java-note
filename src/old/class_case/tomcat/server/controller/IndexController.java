package src.old.class_case.tomcat.server.controller;

import src.old.class_case.tomcat.server.server.HttpServletRequest;
import src.old.class_case.tomcat.server.server.HttpServletResponse;
import src.old.class_case.tomcat.server.server.HttpServlet;

public class IndexController extends HttpServlet {

    @Override
    public void service(HttpServletRequest request, HttpServletResponse response) {

        System.out.println("Invoked IndexController");
//        response.write("Invoked IndexController");

        response.sendRedirect("index.view");
    }
}