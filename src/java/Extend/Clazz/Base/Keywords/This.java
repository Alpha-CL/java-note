package src.java.Extend.Clazz.Base.Keywords;

public class This {

    public String name;
    public int age;
    public int gender;

    public static void main(String[] args) {
        This that = new This("alpha", 18, 1);
    }

    /**
     * 在实例方法中:  this表示当前对象，可以用来访问当前对象的成员变量和方法
     * 在构造方法中:  this表示当前对象，可以用来调用当前类的其他构造方法，或者调用当前对象的成员方法
     * 在方法中:     当方法的参数名和成员变量名相同时，可以使用this关键字来区分
     * 在内部类中:    this表示当前内部类对象，如果要访问外部类对象，可以使用外部类名.this来表示
     */

    public This() {
        System.out.println("=>(This.java:13) This: No parameter constructor " + this);
    }


    /**
     * this();      // 关键字用于调用当前类中的其他构造方法
     * super();     // 关键字用于调用父类中的构造方法
     *
     * this()和super()不能同时使用，因为它们都必须在构造方法的第一行，而且它们只能调用一次
     * 若没有显式地调用super()或者this()，则Java编译器会默认调用父类的无参构造方法
     *
     * this()和super()时，需要注意构造方法的调用顺序，因为它们会影响对象的初始化顺序
     * 若在构造方法中使用了this()或者super()，那么它们会优先执行，然后才会执行当前构造方法的代码
     */

    public This(String name, int age, int gender) {
        /**
         * 如果使用 this 调用另一个构造方法
         * 则必须在构造方法的第一行
         */
        this();     // 调用构造方法

        this.name = name;
        this.age = age;
        this.gender = gender;
    }
}
