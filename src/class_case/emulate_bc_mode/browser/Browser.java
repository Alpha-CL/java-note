package class_case.emulate_bc_mode.browser;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

public class Browser {

    private Scanner input = new Scanner(System.in);

    public void openBrowser() {
        System.out.println("# url: ");
        String url = input.nextLine();
        this.parseURL(url);
    }

    private void parseURL(String url) {
        int colonIndex = url.indexOf(":");
        int slashIndex = url.indexOf("/");
        String ip = url.substring(0, colonIndex);
        int port = Integer.parseInt(url.substring(colonIndex + 1, slashIndex));
        String contentAndParams = url.substring(slashIndex + 1);
        this.createSocketAndSendRequest(ip, port, contentAndParams);
    }

    private void createSocketAndSendRequest(String ip, int port, String contentAndParams) {
        try {
            Socket socket = new Socket(ip, port);
            PrintWriter out = new PrintWriter(socket.getOutputStream());
            out.println(contentAndParams);
            out.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}