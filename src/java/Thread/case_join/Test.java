package src.java.Thread.case_join;

public class Test {

    public static void main(String[] args) {

         ThreadFirst t1 = new ThreadFirst();
         ThreadSecond t2 = new ThreadSecond();

         t1.start();
        // t2.start();

//        System.out.println("ThreadFirst start");
//
//        ThreadSecond t2 = new ThreadSecond();
//
//        t2.start();
//
//        try {
//            t2.join();
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
//
//        System.out.println("ThreadFirst end");

    }
}
