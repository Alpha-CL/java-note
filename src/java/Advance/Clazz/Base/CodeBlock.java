package src.java.Advance.Clazz.Base;


/**
- 实例初始化块

实例初始化块是定义在类中的代码块，没有使用任何关键字进行修饰
实例初始化块在创建对象时执行，每次创建对象都会执行一次
实例初始化块在构造方法之前执行，用于初始化实例变量


- 静态初始化块

静态初始化块是使用static关键字修饰的代码块
静态初始化块在类加载时执行，只执行一次
静态初始化块在实例初始化块之前执行，用于初始化静态变量
*/

public class CodeBlock {

    static int gender;
    private String name;
    private int age;

    /**
     * 没有修饰符，没有参数，没有返回值      // 主要用于初始化
     *
     *
     * 每次调用构造方法，则系统会自动调用 代码块
     * 代码块 和 静态代码块 都可以有多个，并且按照顺序执行
     */

    static { /** 静态代码块 */
        CodeBlock.gender = 1;
        System.out.println("=>(CodeBlock.java:6) Static CodeBlock: ");
    }

    { /** 代码块 */
        this.name = "alpha";
        this.age = 18;
        System.out.println("=>(CodeBlock.java:10) CodeBlock: ");
    }

    public CodeBlock() {
    }

    public CodeBlock(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}
