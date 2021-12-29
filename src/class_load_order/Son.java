package class_load_order;

public class Son extends Father {

    // 默认属性
    public String prop = "Son public prop";

    // 静态属性
    public static String staticProp = "Son public static prop";

    // 默认代码块
    {
        this.sonDefaultMethod();
        System.out.println("Son default block code, defaultProp: " + this.prop);
    }

    // 静态代码块
    static {
        Son.sonStaticMethod();
        System.out.println("Son static block code, staticProp: " + Son.staticProp);
    }

    // 默认构造方法
    public  Son() {
        System.out.println("Son Construct method");
    }

    // 默认方法
    public void sonDefaultMethod() {
        System.out.println("Son default method");
    }

    // 静态方法
    public static void sonStaticMethod() {
        System.out.println("Son static method");
    }
}
