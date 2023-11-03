package src.old.reflect.CustomAnnotation;

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class ParseParamsInAnnotation {

    public static void main(String[] args) {

        try {

            /**
             * 解析注解携带的参数            // 利用反射
             *
             *
             *  1. 获取指定注解对应的类
             *  2. 根据类, 获取类中 注解 对应的 成员
             *  3.
             *      - 根据成员获取 注解对象
             *      - 执行注解方法, 获取传递的参数
             */


            /** 常规获取 **/
            // 1. 获取指定注解对应的类
            Class<Person> cls1 = Person.class;
            // 2. 根据类, 获取类中 注解 对应的 成员
            Field name = cls1.getDeclaredField("name");

            CustomAnnotation customAnnotation = name.getAnnotation(CustomAnnotation.class); // 获取 成员 对应的 注解类

            String propParam = customAnnotation.prop();                                     // 调用 注解方法, 获取 注解参数
            System.out.println("[prop params of name]: " + propParam);


            /** 利用反射获取 **/
            // 1. 获取指定注解对应的类
            Class<Person> cls2 = Person.class;
            // 2. 根据类, 获取类中 注解 对应的 成员
            Method getAge = cls2.getDeclaredMethod("getAge");

            Annotation annotation = getAge.getAnnotation(CustomAnnotation.class);      // 跟酒 成员, 获取对应的 注解对象
            Class<? extends Annotation> annotationClass = annotation.getClass();       // 根据 注解对象, 获取对应的 类
            Method testMethod = annotationClass.getMethod("method");             // 根据 类, 获取对应的 注解方法

            int methodParam = (int) testMethod.invoke(annotation);                      // 调用 注解方法, 获取 注解参数
            System.out.println("[method params of getAge]: " + methodParam);


        } catch (NoSuchFieldException | NoSuchMethodException | IllegalAccessException | InvocationTargetException e) {

            e.printStackTrace();
        }

    }
}
