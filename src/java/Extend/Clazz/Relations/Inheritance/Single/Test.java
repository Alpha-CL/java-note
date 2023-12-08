package src.java.Extend.Clazz.Relations.Inheritance.Single;

/**
 * 继承关系( Inheritance )
 *
 *
 * 继承关系是一种 "is-a" 关系，其中一个类( 称为子类或派生类 )继承另一个类( 称为父类或基类 )的 成员( 属性和方法 )
 * 子类可以使用父类的 成员( 属性和方法 )，并且可以通过重写方法来改变其行为
 * Java中使用关键字 extends 表示 单继承关系。
 */

public class Test {

    public static void main(String[] args) {

        /**
         * 儿子 继承了 爷爷 的 姓
         * 儿子 继承了 父亲 的 资产
         * 儿子 有自己的 名
         * 儿子 重写了继承自父类的 sayHi 方法
         */

        Son son = new Son();
        son.sayHi();
    }
}
