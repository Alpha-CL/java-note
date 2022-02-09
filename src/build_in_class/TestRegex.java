package build_in_class;

import java.util.Scanner;

public class TestRegex {

    public static void main(String[] args) {

        /**
         * regex
         *
         *
         * 1. 字符串格式教研
         * 2. 字符串 拆分 & 替换
         * 3. 字符串 查找
         */

        Scanner input = new Scanner(System.in);
        System.out.print("please input a string.");
        String str = input.nextLine();

        String reg1 = "abc";                // a,b,c 其中一个
        String reg2 = "^abc";               // 必须以 abc 开头
        String reg3 = "[a-zA-Z]";           //
        String reg4 = "[a-z&&0-9]";         //
        String reg5 = "[a-z&&[^bc]]";       //
        String reg6 = "[a-z&&[^m-p]]";      //

        /**
         * 范围
         *
         *
         * .            // 任意一个字符
         * /d           // [0-9]: 任意 0 至 9 的数字
         * /D           // [^0-9]: 非 0 至 9 的非数字
         * /s           // space: 空格
         * /S           // ^space: 非空格
         * /v           //
         * /V           //
         * /w           // [0-9a-zA-Z]: 任意一个单词
         * /W           // [^0-9a-zA-Z]: 非任意单词
         * ...
         *
         */

        /**
         * 频率
         *
         *
         * ?            // {0,1}: 零次或一次
         * *            // 任意次数
         * +            // {1,}: 至少出现一次
         * {n}          // 出现 n 次
         * {n,}         // 至少出现 n 次
         * {m, n}       // 出现 m 至 n 次
         */

        /**
         * 条件关系
         *
         *
         * |        // 或者
         * &&       // 并且
         */

        String str1 = "1,2+3/4";
        // String[] resArr1 =  str1.split(",|\\+|/");
        String[] resArr1 = str1.split("[,+/]");
        StringBuilder res1 = new StringBuilder();
        for (String s : resArr1) {
            res1.append(s);
        }
        System.out.println(res1);

        boolean isMatch1 = str.matches(reg1);
        boolean isMatch2 = str.matches(reg2);
        boolean isMatch3 = str.matches(reg3);
        boolean isMatch4 = str.matches(reg4);
        boolean isMatch5 = str.matches(reg5);
        boolean isMatch6 = str.matches(reg6);

        System.out.println("[abc]: " + isMatch1);
        System.out.println("[^abc]: " + isMatch2);
        System.out.println("[a-zA-Z]: " + isMatch3);
        System.out.println("[a-z&&0-9]: " + isMatch4);
        System.out.println("[a-z&&[^bc]: " + isMatch5);
        System.out.println("[a-z&&[^m-p]]: " + isMatch6);
    }
}