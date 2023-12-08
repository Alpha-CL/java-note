package src.java.Extend.Annotation.Examples.case_ioc;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Scanner;

public class MySpring {

    //设计一个方法  帮我控制对象的创建
    //      是否需要参数? String 类全名
    //      是否需要返回值?  对象Object

    public Object getBean(String className) {

        Object obj = null;

        Scanner input = new Scanner(System.in);
        System.out.println("请给" + className + "类的对象赋值");

        try {

            Class<?> cls = Class.forName(className);

            obj = cls.newInstance();

            // 获取当前类中所有属性
            Field[] fields = cls.getDeclaredFields();

            for (Field field : fields) {

                // 获取当前属性的名称
                String fieldName = field.getName();
                // 处理属性名称为第一个字母大写
                String firstLetter = fieldName.substring(0, 1).toUpperCase();
                String otherLetters = fieldName.substring(1);
                StringBuilder setMethodName = new StringBuilder("set");
                setMethodName.append(firstLetter);
                setMethodName.append(otherLetters);


                Class<?> fieldClass = field.getType();
                Method setMethod = cls.getMethod(setMethodName.toString(), fieldClass);

                System.out.println("请给" + fieldName + "属性提供值");
                String value = input.nextLine();

                // 调用指定方法, 并传递参数
                Constructor<?> ct = fieldClass.getConstructor(String.class);
                setMethod.invoke(obj, ct.newInstance(value));
            }

        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | NoSuchMethodException | InvocationTargetException e) {

            e.printStackTrace();
        }

        return obj;
    }
}
