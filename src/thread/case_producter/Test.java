package thread.case_producter;


public class Test {

    public static void main(String[] args) {

        Store store = new Store();

        /**
         * 两个消费者同时访问同一个仓库, 当仓库仅剩一个物品时, 两个消费者抢夺资源产生问题
         *
         * 解决方法:
         *      当仓库被线程访问时, 锁定该仓库, 仅当该访问结束后才解锁该仓库
         *      ( 同一时间仓库的链接唯一 )
         */

        /**
         * synchronized
         *
         *
         * 1.
         *
         *
         * 2.
         *
         */

        Producer p1 = new Producer(store);
        Consumer c1 = new Consumer(store);
        Consumer c2 = new Consumer(store);

        p1.start();
        c1.start();
        c2.start();
    }
}
