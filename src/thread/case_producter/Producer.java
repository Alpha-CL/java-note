package thread.case_producter;

public class Producer extends Thread {

    private Store store;

    public Producer(Store store) {
        this.store = store;
    }

    public void run() {

        while(true) {
            store.add();
            System.out.println("生产者 存入 一件货物");
            try {
                sleep(200);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
