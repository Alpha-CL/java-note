package class_case.emulate_bc_mode.server.controller;
import class_case.emulate_bc_mode.server.server.HttpServlet;
import class_case.emulate_bc_mode.server.server.HttpServletRequest;
import class_case.emulate_bc_mode.server.server.HttpServletResponse;


public class IndexController extends HttpServlet {

    @Override
    public void service(HttpServletRequest request, HttpServletResponse response) {
        response.sendRedirect("index.view");
    }
}
