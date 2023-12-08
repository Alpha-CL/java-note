package src.java.Thread.case_producter;

public class Consumer extends Thread {

    private final Store store;

    public Consumer(Store store) {
        
        this.store = store;
    }

    public void run() {

        while (true) {

            store.get();
            System.out.println("[ 消费者 ]: 取出 一件货物");
            
            try {

                Thread.sleep(500);

            } catch (InterruptedException e) {

                e.printStackTrace();
            }
        }

    }
}
