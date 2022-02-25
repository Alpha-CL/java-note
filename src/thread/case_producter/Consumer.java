package thread.case_producter;

public class Consumer extends Thread {

    private Store store;

    public Consumer(Store store) {
        this.store = store;
    }

    public void run() {

        while (true) {
            store.get();
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }
}
