package thread;

public class TestRunningMan {

    public static void main(String[] args) {

        RunningManOfExtendThread r1 = new RunningManOfExtendThread("alpha");
        RunningManOfExtendThread r2 = new RunningManOfExtendThread("beta");
        RunningManOfExtendThread r3 = new RunningManOfExtendThread("omega");


        /**
         * public class Demo extends Thread {}
         *
         * 适用于单继承时
         */

        // r1.start();
        // r2.start();
        // r3.start();

        /**
         * public class abstract Demo implements Runnable {}
         *
         * 适用于多层级继承时
         */

        Thread t1 = new Thread(r1);
        Thread t2 = new Thread(r2);
        Thread t3 = new Thread(r3);
        t1.start();
        t2.start();
        t3.start();
    }
}
