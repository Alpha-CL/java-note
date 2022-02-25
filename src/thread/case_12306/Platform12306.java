package thread.case_12306;

import java.util.Vector;

public class Platform12306 {

    public Platform12306() {
    }

    private static final Platform12306 sys = new Platform12306();

    public static Platform12306 getInstance() {

        return sys;
    }

    private final Vector<Ticket> tickets = new Vector<Ticket>();

    {
        for (int i = 10; i < 100; i++) {
            tickets.add(new Ticket("北京" + i, "深圳" + i, (i % 5 + 5) * 25F));
        }
    }

    public Ticket getTicket() {

        try {

            return tickets.remove(0);

        } catch (Exception e) {

            return null;
        }

    }
}