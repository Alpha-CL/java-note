package src.old.reflect;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class TestClassMethod {

    public static void main(String[] args) {

        try {

            Class<Person> cls = Person.class;
            Class<Animal> cls1 = Animal.class;
            Animal a1 = new Animal();
            Person clsInstance = new Person();


            // 获取无参数方法
            Method getName = cls.getMethod("getName");
            // 获取有参数方法
            Method getFullName = cls.getMethod("getName", String.class, String.class);

            int methodModifiers = getFullName.getModifiers();
            System.out.println("[methodModifiers]: " + methodModifiers);

            Class<?> methodReturnType = getFullName.getReturnType();
            System.out.println("[methodReturnType]: " + methodReturnType);

            String methodName = getFullName.getName();
            System.out.println("[methodName]: " + methodName);

            Class[] methodParamsType = getFullName.getParameterTypes();
            for (var m : methodParamsType) {
                System.out.println("[methodParamsType]: " + m);
            }

            Class[] methodExceptionTypes = getFullName.getExceptionTypes();
            for (var m : methodExceptionTypes) {
                System.out.println("[methodExceptionTypes]: " + m);
            }


            System.out.println("\n");


            /** 方法调用 **/
            String result = (String) getFullName.invoke(clsInstance, "alpha", "l");
            System.out.println("[getFullName return result]: " + result);


            System.out.println("\n");


            /** getMethod(); 获取当前类和父类中的指定公有方法 **/
            Method m1 = cls.getMethod("sleep");
            System.out.println("[Person extends Animal]");
            m1.invoke(clsInstance);


            System.out.println("\n");


            /** getMethods(); 获取当前类和父类中所有公有方法 **/
            Method[] ms1 = cls.getMethods();
            for (var m : ms1) {
                System.out.println("[publicMethod]: " + m);
            }


            System.out.println("\n");


            /** getDeclaredMethod(); 仅可调用当前类的指定方法 **/
            Method m2 = cls.getDeclaredMethod("mySleep");
            /** 调用私有方便需要设置修改权限 **/
            m2.setAccessible(true);
            m2.invoke(clsInstance);


            System.out.println("\n");


            /** getMethods(); 获取当前类和父类中所有方法 **/
            Method[] ms2 = cls.getDeclaredMethods();
            for (var m : ms2) {
                System.out.println("[getAllMethods]: " + m);
            }


        } catch (NoSuchMethodException | IllegalAccessException | InvocationTargetException e) {

            e.printStackTrace();
        }
    }
}
