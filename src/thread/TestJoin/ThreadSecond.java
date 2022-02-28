package thread.TestJoin;

public class ThreadSecond extends Thread {

    public void run() {

        System.out.println("ThreadSecond start");

        ThreadThree t3 = new ThreadThree(this);
        t3.start();

         try {

             Thread.sleep(5000);
             System.out.println("t2 sleep 5000ms");

         } catch (InterruptedException e) {

             e.printStackTrace();
         }

        System.out.println("ThreadSecond end");

    }
}
