package thread.case_producter;


public class Test {

    public static void main(String[] args) {

        Store store = new Store();

        /**
         * 当两个消费者同时访问同一个仓库, 并且仓库仅剩一个物品时, 两个消费者抢夺资源产生 索引越界
         *
         *
         * 解决方法:
         *      当仓库被线程访问时, 锁定该仓库, 仅当该访问结束后才解锁该仓库
         *      ( 同一时间仓库的链接唯一 )
         */

        /**
         * synchronized
         *
         * 1. 修饰符锁
         * 2. 方法锁
         */

        Producer p1 = new Producer(store);
        Consumer c1 = new Consumer(store);
        Consumer c2 = new Consumer(store);

        /**
         * .setPriority();          // 设置线程的优先级别
         * .getPriority();          // 获取线程的优先级别
         *
         */
        p1.setPriority(10);

        p1.start();

        c1.start();
        c2.start();

    }
}
