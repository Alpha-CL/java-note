package src.java.Advance.Clazz.Relations.Composition;


/**
 * 组合关系( Composition )
 *
 * 合关系是一种特殊的聚合关系，其中一个类包含对另一个类的引用，且两者之间是强依赖关系。
 * 合关系表示"整体-部分"的关系，整体对象包含部分对象，部分对象不能独立存在。
 * 合关系中，整体对象的生命周期与部分对象的生命周期紧密相关。
 */

public class Test {

    /**
     * 定义了一个祖父类Grandfather和一个父类Father，它们都有一个name属性和一个getName()方法用于获取名称
     * 定义了一个子类Son和一个兄弟类Brother，它们都包含一个对父类的引用
     * 在子类Son和兄弟类Brother的构造函数中，我们创建了一个新的父类Father对象，并将父类名称作为参数传递给构造函数。
     * 这样，子类和兄弟类就包含了一个特定的父类对象，表示它们与父类之间的组合关
     */

    /*
   示例展示了组合关系的使用。子类和兄弟类包含一个父类对象作为其成员变量，表示它们与父类对象之间存在强依赖关系
   子类和兄弟类的创建和生命周期与父类对象紧密相关，它们不能独立存在
   通过成员变量的引用，子类和兄弟类可以访问父类的功能。
    */
    public static void main(String[] args) {

        Grandfather grandfather = new Grandfather("John");
        Son son = new Son("David");
        Brother brother = new Brother("David");

        System.out.println("Son's father: " + son.getFather().getName()); // 输出：Son's father: David
        System.out.println("Brother's father: " + brother.getFather().getName()); // 输出：Brother's father: David
        System.out.println("Grandfather's name: " + grandfather.getName()); // 输出：Grandfather's name: John
    }
}
