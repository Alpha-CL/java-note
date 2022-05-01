package class_case.tomcat.server.server;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {

    /**
     *
     */

    public void start() {

        int port = Integer.parseInt(ServerFileReader.getValue("port"));

        System.out.println("==================");
        System.out.println("Server start");
        System.out.println("IP: localhost:" + port);
        System.out.println("==================");

        try {

            ServerSocket server = new ServerSocket(port);

            while (true) {

                Socket socket = server.accept();
                new ServerHandler(socket).start();
            }

        } catch (IOException e) {

            e.printStackTrace();
        }
    }

}
