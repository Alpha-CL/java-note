package src.java.Thread;

/**
 * 必须实现 Runnable 接口
 **/
public abstract class RunningManOfImplementsRunnable implements Runnable {

    String name;

    RunningManOfImplementsRunnable() {
    }

    RunningManOfImplementsRunnable(String name) {
        this.name = name;
    }

    /**
     * overwrite: 必须重写 run(); 方法
     * 通过 Thread 实例, 并传入 实现了 Runnable 接口的类
     * 再通过 Thread 实例调用  start(); 方法开启该线程
     **/
    public void run() {

        for (int i = 0; i <= 100; i++) {

            if (i == 100) {

                System.out.println("[ " + this.name + " end ]");

            } else {

                System.out.println(this.name + " running " + i + " m.");
            }
        }
    }
}
