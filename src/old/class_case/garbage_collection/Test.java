package src.old.class_case.garbage_collection;

public class Test {

    public static void main(String[] args) {

        TestGC gc = new TestGC();               // 创建 class

        try {
            Thread.sleep(2000);          // 延迟执行
            System.out.println("[delay 2s]");
        } catch (Exception ignored) {
        }

        gc = null;                              // 将 class 设置为 null

        System.gc();                            // 垃圾回收 class
    }
}
