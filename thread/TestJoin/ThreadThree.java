package thread.TestJoin;

public class ThreadThree extends Thread {

    private final ThreadSecond t2;

    public ThreadThree(ThreadSecond t2) {
        this.t2 = t2;
    }

    public void run() {

        System.out.println("Thread-three start");

        synchronized (t2) {

            System.out.println("t2 is lock");

            try {

                Thread.sleep(80000);

            } catch (InterruptedException e) {

                e.printStackTrace();
            }

            System.out.println("t2 is free");
        }


        System.out.println("Thread-three end");
    }
}
