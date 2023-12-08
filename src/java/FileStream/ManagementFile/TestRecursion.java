package src.java.FileStream.ManagementFile;

public class TestRecursion {

    /**
     * 递归
     *
     *
     * 压栈: 未找到出口之前不断的向栈中添加放方法( 直到栈内存溢出 )
     * 出栈: 找到出口后, 倒序执行压入栈的方法( first in, last out )
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

        TestRecursion tm = new TestRecursion();
        tm.testOne();
    }
}
