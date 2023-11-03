package src.old.build_in_class;

public class TestEquals {

    public static void main(String[] args) {

        /**
         * == vs equals
         *
         ** ==: 比较的是两者的值
         *
         ** equals
         *      - Object.equals                 // 来自继承
         *      - @override equals              // 重写: 多种情况要根据源码分析到底比较的是
         *                                              （ 原始值, 引用地址, 还是其他 ）
         */

        new TestEquals().equals(null);
        Integer i1 = 1000;                          // 10自动包装成Integer对象
        Integer i2 = 1000;
        Integer i3 = new Integer(1000);
        Integer i4 = new Integer(1000);
        System.out.println(i1 == i2);               // true-->false
        System.out.println(i1 == i3);               // false
        System.out.println(i3 == i4);               // false
        System.out.println(i1.equals(i2));          // true
        System.out.println(i1.equals(i3));          // true
        System.out.println(i3.equals(i4));          // true


        // String类  "abc"对象  常量区
        String s1 = "abc";
        String s2 = "abc";
        String s3 = new String("abc");
        String s4 = new String("abc");
        System.out.println(s1 == s2);               // true
        System.out.println(s1 == s3);               // false
        System.out.println(s3 == s4);               // false
        System.out.println(s1.equals(s2));          // true   String类将继承自Object中的equals方法重写啦
        System.out.println(s1.equals(s3));          // true   将原有比较==的方式改为比较字符值
        System.out.println(s3.equals(s4));          // true
    }
}
