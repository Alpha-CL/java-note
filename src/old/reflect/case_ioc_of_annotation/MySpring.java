package src.old.reflect.case_ioc_of_annotation;

import java.lang.annotation.Annotation;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;


public class MySpring {

    public Object getBean(String className) {

        Object obj = null;

        try {

            Class<?> cls = Class.forName(className);


            // 1. 利用类直接创建 实例
            obj = cls.newInstance();

            // 2. 先获取构造器后, 利用构造器 创建 实例
            Constructor<?> constructor = cls.getConstructor();
            obj = constructor.newInstance();


            Annotation annotation = constructor.getAnnotation(CustomAnnotation.class);
            Class<? extends Annotation> annotationClass = annotation.getClass();
            Method method = annotationClass.getDeclaredMethod("value");

            String[] params = (String[]) method.invoke(annotation);

            // for (String param : params) {
            //     System.out.println(param);
            // }

            Field[] fields = cls.getDeclaredFields();

            // for (Field field : fields) {
            //     System.out.println(field.getName());
            // }

            for (int i = 0; i < fields.length; i++) {

                Field field = fields[i];
                String fieldName = field.getName();

                // System.out.println(field);
                // System.out.println(fieldName);

                StringBuilder methodName = new StringBuilder("set");
                methodName.append(fieldName.substring(0, 1).toUpperCase());
                methodName.append(fieldName.substring(1));

                // System.out.println(methodName);

                Class<?> fieldType = field.getType();
                Method setMethod = cls.getMethod(methodName.toString(), field.getType());

                setMethod.invoke(obj, fieldType.getConstructor(String.class).newInstance(params[i]));
            }

        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | NoSuchMethodException | InvocationTargetException e) {

            e.printStackTrace();
        }

        return obj;
    }
}
