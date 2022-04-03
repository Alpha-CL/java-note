package class_case.emulate_bc_mode.server.server;

import java.io.*;

public class HttpServletResponse {

    private final StringBuilder responseContent = new StringBuilder();

    public void write(String str) {
        this.responseContent.append(str);
    }

    public String getResponseContent() {
        return responseContent.toString();
    }

    public void sendRedirect(String path) {

        String BASE_PATH = "src/class_case/emulate_bc_mode/";

        try {

            File file = new File(BASE_PATH + path);
            BufferedReader reader = new BufferedReader(new FileReader(file));
            String lineContent = reader.readLine();

            while (lineContent != null) {
                this.responseContent.append(lineContent);
                lineContent = reader.readLine();
            }

        } catch (IOException e) {

            e.printStackTrace();
        }
    }
}
