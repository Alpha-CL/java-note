package src.java.Thread.case_deadlock;

public class Test {

    public static void main(String[] args) {

        Chopstick c1 = new Chopstick(1);
        Chopstick c2 = new Chopstick(2);
        Chopstick c3 = new Chopstick(3);
        Chopstick c4 = new Chopstick(4);


        /**
         * 如何避免死锁
         *
         * 1. 使线程之间存在时间差( sleep(time); )
         * 2. 避免使用公共对象
         */

        Philosopher p1 = new Philosopher("哲学家a",c2,c1,0);
        Philosopher p2 = new Philosopher("哲学家b",c3,c2,3000);
        Philosopher p3 = new Philosopher("哲学家c",c4,c3,0);
        Philosopher p4 = new Philosopher("哲学家d",c1,c4,3000);

        p1.start();
        p2.start();
        p3.start();
        p4.start();
    }
}
