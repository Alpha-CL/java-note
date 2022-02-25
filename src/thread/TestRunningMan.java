package thread;

public class TestRunningMan {

    public static void main(String[] args) {

        RunningManOfExtendThread r1 = new RunningManOfExtendThread("alpha");
        RunningManOfExtendThread r2 = new RunningManOfExtendThread("beta");
        RunningManOfExtendThread r3 = new RunningManOfExtendThread("omega");


        /**
         * Test RunningManOfExtendThread
         *
         * 适用于单继承
         */
        // r1.start();
        // r2.start();
        // r3.start();


        /**
         * test RunningManOfImplementsRunnable
         *
         * 适用于 多实现
         */
        Thread t1 = new Thread(r1);
        Thread t2 = new Thread(r2);
        Thread t3 = new Thread(r3);
        t1.start();
        t2.start();
        t3.start();
    }
}
