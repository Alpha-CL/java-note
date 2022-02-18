package error;

public class TestTryCatch {

    public static void main(String[] args) {


        /**
         *
         *
         *
         *
         */

        System.out.println("程序开始执行");

        try {

            System.out.println("try start");

            String str = null;

            str.length();       // NullPointerException
            str.charAt(10);     // StringIndexOutOfBoundsException

            System.out.println("try end");                  // 若 try 代码正常执行完, 则不会执行 catch 代码块

        } catch (NullPointerException e) {                  // 有且仅当捕获到错误时才执行 catch 代码块

            System.out.println("catch_01: " + e);

        } catch (StringIndexOutOfBoundsException e) {       // 有且仅当捕获到错误时才执行 catch 代码块

            System.out.println("catch_02: " + e);

        } catch (Exception e) {                             // 允许有多个 catch

            System.out.println("catch_03: " + e);

        } finally {                                         // finally 是 可选的, 唯一的
                                                            // 若有则必须执行

            System.out.println("无论 try 代码块中是否有报错, finally 都会执行");
        }

        System.out.println("程序执行结束");
    }
}
