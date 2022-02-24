package thread;

/** 必须继承 Thread 父类 **/
public class RunningMan extends Thread {

    String name;

    RunningMan() {}

    RunningMan(String name) {
        this.name = name;
    }

    /** overwrite: 必须重写 run(); 方法, 再通过当前类的实例的 start(); 方法 **/
    public void run() {

        for(int i = 0; i <= 100; i++) {

            if(i == 100) {

                System.out.println("[ " + this.name + " end ]");

            } else {

                System.out.println(this.name + " running " + i + " m.");
            }
        }

    }

}