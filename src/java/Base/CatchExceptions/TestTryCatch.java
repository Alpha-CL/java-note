package src.java.Base.CatchExceptions;


/**
 * 测试自定义捕获错误
 */
public class TestTryCatch {

    public static void main(String[] args) {


        System.out.println("程序开始执行");

        try {

            System.out.println("try start");

            String str = null;

            str.length();       // NullPointerException
            str.charAt(10);     // StringIndexOutOfBoundsException

            System.out.println("try end");                      // 若 try 代码正常执行完, 则不会执行 catch 代码块

        } catch (NullPointerException err) {                    // 有且仅当捕获到错误时才执行 catch 代码块

            System.out.println("catch_01: " + err);

        } catch (StringIndexOutOfBoundsException err) {         // 有且仅当捕获到错误时才执行 catch 代码块

            System.out.println("catch_02: " + err);

        } catch (Exception err) {                               // 允许有多个 catch

            System.out.println("catch_03: " + err);

        } finally {                                             // finally 是 可选的, 唯一的
                                                                // 若有则必须执行

            System.out.println("无论 try 代码块中是否有报错, finally 都会执行");
        }

        System.out.println("程序执行结束");
    }
}
