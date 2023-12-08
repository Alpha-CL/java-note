package src.java.Thread.case_12306;

public class Window extends Thread {

    private final String windowName;

    public Window(String windowName) {
        this.windowName = windowName;
    }

    @Override
    public void run() {
        this.sellTicket();
    }

    public void sellTicket() {

        while (true) {

            Platform12306 sys = Platform12306.getInstance();
            Ticket ticket = sys.getTicket();

            if (ticket == null) {
                System.out.println("对不起 [ " + windowName + " ] 窗口的车票 已售完");
                break;
            }

            System.out.println(windowName + " 售出一张 " + ticket);
        }
    }
}
