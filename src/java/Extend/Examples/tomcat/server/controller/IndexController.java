package src.java.Extend.Examples.tomcat.server.controller;

import src.java.Extend.Examples.tomcat.server.server.HttpServletRequest;
import src.java.Extend.Examples.tomcat.server.server.HttpServletResponse;
import src.java.Extend.Examples.tomcat.server.server.HttpServlet;

public class IndexController extends HttpServlet {

    @Override
    public void service(HttpServletRequest request, HttpServletResponse response) {

        System.out.println("Invoked IndexController");
//        response.write("Invoked IndexController");

        response.sendRedirect("index.view");
    }
}