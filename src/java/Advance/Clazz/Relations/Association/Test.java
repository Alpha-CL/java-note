package src.java.Advance.Clazz.Relations.Association;


/**
 * 关联关系( Association )
 *
 * 关联关系是一种"has-a"关系，其中一个类包含对另一个类的引用。
 * 关联关系可以是单向的或双向的，表示两个类之间的关联。
 * 关联关系可以是一对一、一对多或多对多的关系。
 */

public class Test {

    /**
     * 定义了一个祖父类Grandfather和一个父类Father，它们都有一个name属性和一个getName()方法用于获取名称
     * 定义了一个子类Son和一个兄弟类Brother，它们都包含一个对父类的引用
     * 在子类Son和兄弟类Brother的构造函数中，我们接收一个父类对象作为参数，并将其赋值给类内部的父类引用
     * 然后，我们在子类和兄弟类中提供了一个getFather()方法，用于获取父类对象
     */

    /*
    示例展示了关联关系中子类、兄弟类、父类和祖父类的定义和使用
    子类和兄弟类都包含对父类的引用，通过这种关联关系，它们可以访问和使用父类的属性和方法
    同时，祖父类对象也可以直接访问其自身的属性和方法
    */

    public static void main(String[] args) {

        Grandfather grandfather = new Grandfather("John");
        Father father = new Father("David");

        Son son = new Son(father);
        Brother brother = new Brother(father);

        System.out.println("Son's father: " + son.getFather().getName()); // 输出：Son's father: David
        System.out.println("Brother's father: " + brother.getFather().getName()); // 输出：Brother's father: David
        System.out.println("Grandfather's name: " + grandfather.getName()); // 输出：Grandfather's name: John
    }
}
