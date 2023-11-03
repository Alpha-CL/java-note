package src.java.Advance.Clazz.Base;

public class ConstructorMethod {

    private String name;
    private int age;
    private int gender;

    public static void main(String[] args) {

        ConstructorMethod constructorMethod1 = new ConstructorMethod();

        ConstructorMethod constructorMethod2 = new ConstructorMethod("alpha", 18, 1);

        System.out.println("=>(ConstructorMethod.java:14) constructorMethod2: " + constructorMethod2.name);
        System.out.println("=>(ConstructorMethod.java:14) constructorMethod2: " + constructorMethod2.age);
        System.out.println("=>(ConstructorMethod.java:14) constructorMethod2: " + constructorMethod2.gender);
    }

    /**
     * new 创建实例时调用
     *
     * 构造方法的名称必须与类名相同
     * 构造方法没有返回类型，包括 void类型
     * 构造方法可以有多个参数，也可以没有参数
     * 如果没有定义任何构造方法，Java编译器会自动为类生成一个默认的无参构造方法
     * 如果定义了一个或多个构造方法，则必须在创建对象时调用其中一个构造方法来初始化对象
     * 如果一个类定义了带参数的构造方法，那么Java编译器不会再为该类生成默认的无参构造方法，因此在创建对象时必须调用带参数的构造方法
     */

    public ConstructorMethod() {
        System.out.println("=>(ConstructorMethod.java:22) ConstructorMethod: " + "无参构造方法");
    }

    public ConstructorMethod(String name, int age, int gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public int getGender() {
        return gender;
    }
}
