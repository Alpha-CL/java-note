package src.old.class_case.runtime;

public class TestRunTime {


    public static void main(String[] args) {

        Runtime rt = Runtime.getRuntime();

        long max = rt.maxMemory();          // max: 目前可使用内存的最大值
        long total = rt.totalMemory();      // total: 目前使用的内存总数
        long free = rt.freeMemory();        // free: 目前使用内存中空闲的部分

        System.out.println("+ ------------------------------------------------------ +");
        System.out.println("| [ max: " + max/1024/1024 + " mb ]; [ total: " + total/1024/1024 + " mb ]; [ free: "  + free/1024/1024 + " mb ]; |");
        System.out.println("+ ------------------------------------------------------ +");

    }
}
