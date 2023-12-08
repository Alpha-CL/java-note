package src.java.Extend.ClazzReflect;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

public class CaseUpdatePrivateMember {

    public static void main(String[] args) {

        /**
         * 反射机制可以修改类中私有属性的值
         *
         * 但不建议修改, 这样并不安全, 也违背了定义该属性的时候的逻辑
         */

        try {

            Class clazz = null;
            clazz = Class.forName("src.java.Extend.ClazzReflect.Person");
            Person person = new Person();

            Field[] allFields = clazz.getDeclaredFields();

            for (Field p : allFields) {

                // System.out.println("[allProps]: " + p.getName());

                if (p.getName().equals("male")) {

                    System.out.println("[male]: " + p.getName());
                    System.out.println("[male.Modifiers]: " + p.getModifiers());

                    if (p.getModifiers() != Modifier.PUBLIC){

                        p.setAccessible(true);
                        p.set(person, "female");
                        System.out.println("[Person.male]: " + (String) p.get(person));
                    }
                }
            }

        } catch (ClassNotFoundException | IllegalAccessException e) {

            e.printStackTrace();
        }
    }
}
