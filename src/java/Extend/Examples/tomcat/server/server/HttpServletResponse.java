package src.java.Extend.Examples.tomcat.server.server;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class HttpServletResponse {

    private final StringBuilder responseContent = new StringBuilder();

    public void write(String str) {
        this.responseContent.append(str);
    }

    public String getResponseContent() {
        return responseContent.toString();
    }

    public void sendRedirect(String path) {

        String BASE_PATH = "src/src.java.Extend.class_case/tomcat/server/file/";

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
