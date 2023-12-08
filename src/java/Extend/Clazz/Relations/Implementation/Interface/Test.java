package src.java.Extend.Clazz.Relations.Implementation.Interface;


/**
 * 实现关系( Implementation )
 *
 * 实现关系是一种 "implements"关系，其中一个类实现了一个接口
 * 接口定义了一组方法的契约，实现类必须提供这些方法的具体实现
 * 实现关系允许类实现多个接口
 */

public class Test {

    /**
     * 定义了一个接口 TalkAble，其中声明了一个talk()方法的契约
     * 定义了一个祖父类Grandfather，它实现了接口 TalkAble 并提供了 talk() 方法的具体实现
     * 定义了一个父类Father和两个子类Son和Brother，它们都实现了接口 TalkAble 并分别提供了 talk() 方法的具体实现
     */

    public static void main(String[] args) {

        Son son = new Son();
        son.talk(); // 输出：I am the son.
        son.sayHi();

        Father father = new Father();
        father.talk(); // 输出：I am the father.
        father.sayHi();

        Mother mother = new Mother();
        mother.talk(); // 输出：I am the mother.
        mother.sayHi();
    }
}
