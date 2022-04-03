package class_case.emulate_bc_mode.server.server;

import class_case.emulate_bc_mode.server.server.HttpServletRequest;
import class_case.emulate_bc_mode.server.server.HttpServletResponse;

public abstract class HttpServlet {

    public abstract void service(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse);
}
