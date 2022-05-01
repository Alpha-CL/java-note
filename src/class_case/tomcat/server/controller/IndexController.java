package class_case.tomcat.server.controller;

import class_case.tomcat.server.server.HttpServletRequest;
import class_case.tomcat.server.server.HttpServletResponse;
import class_case.tomcat.server.server.HttpServlet;

public class IndexController extends HttpServlet {

    @Override
    public void service(HttpServletRequest request, HttpServletResponse response) {

        System.out.println("Invoked IndexController");
//        response.write("Invoked IndexController");

        response.sendRedirect("index.view");
    }
}