package src.java.Extend.Clazz.Relations.Dependency;


/**
 * 依赖关系( Dependency )
 *
 * 依赖关系是一种"uses-a"关系，其中一个类在某种程度上依赖于另一个类。
 * 依赖关系表示类之间的一种使用关系，一个类使用另一个类的功能，但没有直接的拥有关系。
 * 依赖关系是一种短暂的关系，一个类的改变可能会影响到依赖它的类。
 */

public class Test {

    /**
     * 定义了一个祖父类Grandfather和一个父类Father，它们都有一个name属性和一个getName()方法用于获取名称
     * 定义了一个子类Son和一个兄弟类Brother，它们都包含一个对父类的引用
     * 在主类Main的main方法中，我们创建了一个祖父类Grandfather对象、一个父类Father对象，
     * 并分别创建了一个子类Son对象和一个兄弟类Brother对象，并将父类对象作为参数传递给它们的构造函数
     */

    /*
    示例展示了依赖关系的使用。子类和兄弟类依赖于父类对象，它们使用父类对象的功能，但没有直接的拥有关系
    子类和兄弟类的构造函数接受一个父类对象作为参数，表示它们依赖于父类对象的存在
    它们可以通过父类对象来访问父类的功能
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
