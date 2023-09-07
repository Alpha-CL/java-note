package src.reflect;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class TestClassConstructor {

    public static void main(String[] args) {

        Class<Person> cls = Person.class;

        try {

            /** 获取实例 **/
            Constructor<Person> ct1 = cls.getConstructor();                                 // 获取无参数构造方法
            Constructor<Person> ct2 = cls.getConstructor(String.class, int.class);          // 获取指定参数类型的构造方法


            /** 创建实例 **/
            ct1.newInstance();
            ct2.newInstance("alpha", 18);


            /** 获取所有公有的公有 构造方法 **/
            Constructor[] cts = cls.getConstructors();
            for( Constructor c: cts) System.out.println(c);


            /** 获取实例 **/
            Constructor<Person> ct3 = cls.getDeclaredConstructor();
            Constructor<Person> ct4 = cls.getDeclaredConstructor(String.class, int.class);


            /** 创建实例 **/
            ct3.newInstance();
            ct4.newInstance("alpha", 18);


        } catch (NoSuchMethodException | InstantiationException | IllegalAccessException | InvocationTargetException e) {

            e.printStackTrace();
        }
    }
}
