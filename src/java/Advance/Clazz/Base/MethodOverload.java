package src.java.Advance.Clazz.Base;

import java.util.Arrays;


/**
- 类作用域(Class Scope)

类作用域指的是在类的内部定义的变量、方法或块的可见性范围。
在类作用域中定义的变量称为成员变量（或字段），它们可以被类中的所有方法访问。
类作用域中定义的方法可以被类的其他方法调用。


- 方法作用域(Method Scope)

方法作用域指的是在方法内部定义的变量的可见性范围。
在方法作用域中定义的变量只能在该方法内部访问，超出该方法的范围就无法访问


- 块作用域(Block Scope)

块作用域指的是在代码块（如if语句块、for循环块、方法内部的局部代码块等）内部定义的变量的可见性范围。
在块作用域中定义的变量只能在该代码块内部访问，超出该块的范围就无法访问。
*/


/** 方法重载 */
public class MethodOverload {

    /**
     * 方法重新载 vs 方法重写
     *
     *
     * 方法重新载: 在一个类中定义多个同名方法
     * 方法重写: 指子类重新定义了父类中已经定义的方法         // @Override
     */

    public static void main(String[] args) {

        /**
         * 方法重载
         *
         *
         * 1. 方法名必须相同, 参数列表必须不同，即参数的类型、顺序或数量必须不同
         *
         * 2. 对比参数列表
         *      - a.类型
         *      - b.顺序
         *      - c.数量
         *
         * 3. 参数类型转换
         *      - a. 满足以上条件，若参数顺序相同, 并且参数大类型相同, 则可以将参数转换后再传递
         *
         *
         * 方法的返回类型可以相同也可以不同
         * 访问修饰符可以相同也可以不同
         * 方法的异常列表可以相同也可以不同
         */

        MethodOverload methodOverride = new MethodOverload();

        /**
         *
         * 传入的参数类型与方法定义的参数类型不匹配，Java 会尝试进行自动类型转换
         * 如果可以转换成功，则调用对应的方法，否则会编译报错
         *
         * Java 中只会进行一次自动类型转换
         */
        // methodOverride.test();
        methodOverride.test(1, 2, 3, 4);
        methodOverride.test(false, 1, 2, 3, 4);
        methodOverride.test(new int[]{1, 2, 3});
        methodOverride.test(1);
        methodOverride.test(false);
        methodOverride.test('A');
    }

    /**
     * 可选的动态剩余参数列表          // JDK1.5+
     */
    public void test(int... args) {
        /**
         * int...:  int类型的数组            // []
         * 可以一个都不传
         */
        System.out.println("=>(MethodRewrite.java:24) test: " + Arrays.toString(args));
    }

    /** 定义后该方法后，则不可以调用无参调用*/
    public void test(int[]... args) {
        /**
         * int[]...: int类型的二维数组         // [[]]
         * 必须传递一个
         */
        System.out.println("=>(MethodOverload.java:65) test: " + Arrays.deepToString(args));
    }

    public void test(boolean bool, int... args) {
        System.out.println("=>(MethodRewrite.java:24) test: " + Arrays.toString(args));
    }

    public int test(int num) {
        System.out.println("test(int num): " + num);
        return num;
    }

    public boolean test(boolean bool) {
        System.out.println("test(boolean bool): " + bool);
        return bool;
    }

    public char test(char character) {
        System.out.println("=>(test(char character): " + character);
        return character;
    }
}
