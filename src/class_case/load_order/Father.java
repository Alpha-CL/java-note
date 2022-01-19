package class_case.load_order;

public class Father {


    // 默认属性
    public String prop = "[ Father public prop ]";

    // 静态属性
    public static String staticProp = "[ Father public static prop]";

    // 默认代码块
    {
        this.fatherDefaultMethod();
        System.out.println("[ Father default block code ], defaultProp: " + this.prop);
    }

    // 静态代码块
    static {
        Father.fatherStaticMethod();
        System.out.println("[ Father static block code ], staticProp: " + Father.staticProp);
    }


    // 默认构造方法
    public Father() {
        System.out.println("[ Father Construct method ]");
    }

    // 默认方法
    public void fatherDefaultMethod() {
        System.out.println("[ Father default method ]");
    }

    // 静态方法
    public static void fatherStaticMethod() {
        System.out.println("[ Father static method ]");
    }
}
