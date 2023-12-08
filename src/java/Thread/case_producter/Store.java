package src.java.Thread.case_producter;

import java.util.ArrayList;

public class Store {

    private final ArrayList<String> list = new ArrayList<String>();

    public synchronized void add() {
        if (list.size() < 10) {
            list.add("a");
        } else {
            // return;
            try {

                this.notifyAll();

                /**
                 * Object.wait();
                 *
                 * 当前对象对应的线程 Thread.wait();
                 */
                this.wait();

            } catch (InterruptedException e) {

                e.printStackTrace();
            }
        }
    }

    public synchronized void get() {

        if (list.size() > 0) {

            list.remove(0);

        } else {

            try {
                this.notifyAll();
                this.wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }
    }

}
