package thread.case_12306;

public class Test {

    public static void main(String[] args) {


        Window w1 = new Window("北京-北站");
        Window w2 = new Window("北京-西站");
        Window w3 = new Window("北京-南站");

        w1.start();
        w2.start();
        w3.start();
    }
}
