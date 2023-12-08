package src.java.Extend.ClazzReflect;

import java.util.ArrayList;

public class TestArrayListClass {

    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<String>();

        Class cls = ArrayList.class;
        Class scls = cls.getSuperclass();

        // 获取当前集合对应的 class
        System.out.println("\n");
        System.out.println("[ " + cls + " ] has class");
        while (scls != null) {
            System.out.println(scls.getName());
            scls = scls.getSuperclass();
        }

        // 获取当前集合对应的所有父接口
        System.out.println("\n");
        System.out.println("[ " + cls + " ] has interface");
        Class[] clsList = cls.getInterfaces();
        for (Class c : clsList) {
            System.out.println(c.getName());
        }

        // 获取当前类的修饰符
        System.out.println("\n");
        int clsModifiers = cls.getModifiers();
        System.out.println(clsModifiers);
    }
}
