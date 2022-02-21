package file_flow;

public class TestMethods {

    /**
     * 递归
     *
     *
     */

    public void testOne() {

        this.testTwo();
        System.out.println("testOne");
    }

    public void testTwo() {

        this.testThree();
        System.out.println("testTwo");
    }

    public void testThree() {

        System.out.println("testThree");
    }

    public static void main(String[] args) {

        TestMethods tm = new TestMethods();
        tm.testOne();
    }
}
