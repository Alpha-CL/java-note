package thread.TestJoin;

public class ThreadFirst extends Thread {

    public void run() {

        System.out.println("ThreadFirst start");

        ThreadSecond t2 = new ThreadSecond();

        t2.start();

        try {

            /**
             * .join();         // 不传递参数时
             *
             * 会等待插入的线程执行完后
             * 再执行当前线程
             *
             ** 无论何时, 被锁定的线程无法被其他操作执行, 仅能等待锁定结束后执行
             */

            // t2.join();

            /**
             * .join(limit);        // 传递参数后
             *
             * 仅在指定线程内等待其他线程执行
             * 指定时间结束后会立即执行当前线程
             *
             ** 无论何时, 被锁定的线程无法被其他操作执行, 仅能等待锁定结束后执行
             */

             t2.join(2000);

        } catch (InterruptedException e) {

            e.printStackTrace();
        }

        System.out.println("ThreadFirst end");
    }
}
