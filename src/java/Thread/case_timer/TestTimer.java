package src.java.Thread.case_timer;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

public class TestTimer {


    private ArrayList<String> userList = new ArrayList<String>();

    {
        userList.add("alpha");
        userList.add("beta");
        userList.add("omega");
    }

    public void test() {

        Timer timer = new Timer();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm");

        try {
            Date firstTime = sdf.parse("2020-03-01 11:11:11");
            timer.schedule(new TimerTask() {
                @Override
                public void run() {
                    for (String s : userList) {
                        System.out.println("send message to " + s);
                    }
                }
            }, firstTime, 3000);

        } catch (ParseException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {

        TestTimer tt = new TestTimer();
        tt.test();
    }
}
