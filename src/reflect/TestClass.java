package reflect;

import java.time.Period;

public class TestClass {

    public static void main(String[] args) {

        /** 获取 Class **/
        Class cls1;
        Class cls2;
        Class cls3;
        String cls4;

        try {

            cls1 = Class.forName("reflect.Person");
            cls4 = cls1.getSimpleName();

            System.out.println("Class.forName(String className): " + cls1);                         // 类全名
            System.out.println("Class.forName(String className).getSimpleName(): " + cls4);         // 类名

        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        cls2 = Person.class;

        System.out.println("[className].class: " + cls2);

        Person p1 = new Person();
        cls3 = p1.getClass();

        System.out.println("[classInstance].getClass(): " + cls3);

        /**
         * modifier
         *
         *      0:    default,
         *      1:    public,
         *      2:    private,
         *      4:    protected,
         *      8:    static,
         *      16:   final,
         *      32:   synchronized,
         *      64:   volatile,
         *      128:  transient,
         *      256:  native,
         *      512:  interface,
         *      1024: abstract
         */
        int modifier = cls2.getModifiers();
        System.out.println("getModifiers: " + modifier);
    }
}