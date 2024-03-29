package src.java.Base.CatchExceptions;


/**
 * 测试 自定义 抛出错误
 */
public class TestThrows {

    // throws NullPointerException: 抛出异常
    public TestThrows() throws NullPointerException {

    }

    // throws NullPointerException: 抛出异常
    public String testException() throws NullPointerException, StringIndexOutOfBoundsException, Exception {

        String str = "abc";
        str.length();
        str.charAt(10);

        return "最终的返回值";
    }

    public static void testMyException() throws MyException {
        System.out.println("测试自定义异常的方法执行啦");
        if (3 > 2) {//若满足某个条件
            throw new MyException("说明一下异常的具体问题");
        }
    }

    public static void main(String[] args) {

        TestThrows testThrows = new TestThrows();

        try {

            testMyException();

        } catch (Exception e) {

            e.printStackTrace();
        }
    }

}
