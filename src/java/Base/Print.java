package src.java.Base;

import java.util.logging.*;

public class Print {

    public static void main(String[] args) {

        Print print = new Print();

        print.systemOutPrint();
        print.systemOutPrintln();
        print.systemOutPrintf();
        print.loggerPrint();
    }

    public String message = "message";

    public void systemOutPrint() {

        /** 不会自动换行 */
        System.out.print("System.out.print:" + this.message);
    }

    public void systemOutPrintln() {

        /** 会自动换行 */
        System.out.println("System.out.println" + this.message);
    }

    public void systemOutPrintf() {

        String name = "name";
        int age = 18;

        /** 可以使用占位符（如 %s 和 %d）将变量的值插入到格式化字符串中 */
        System.out.printf("Name: %s, Age: %d", name, age);
    }

    public void loggerPrint() {

        Logger logger = Logger.getLogger("MyLogger");

        /**
         * Java平台内置的日志记录工具。
         * 日志可以按照不同级别（如 INFO、WARNING、ERROR 等）进行记录，并可以配置输出方式和日志处理器
         */
        logger.log(Level.INFO, "java.util.logging.Logger");
    }
}