package reflect;

import java.lang.reflect.Field;

public class TestClassField {

    public static void main(String[] args) {

        try {

            Class cls = Class.forName("reflect.Person");

            /** 获取单个公共属性 **/
            Field singlePublicProp = cls.getField("name");              // 获取指定属性

            int propModifier = singlePublicProp.getModifiers();                // 获取该属性的 修饰符
            System.out.println("[propModifier]: " + propModifier);

            System.out.println("\n");
            Class propType = singlePublicProp.getType();                       // 获取该属性的 类型
            System.out.println("[propType]: " + propType);

            System.out.println("\n");
            String propName = cls.getName();                                   // 获取该属性的 名称
            System.out.println("[propName]: " + propName);

            Person p1 = new Person();
            try {

                /** 属性赋值
                 *
                 * 1) 属性名已知
                 * 2) 公有属性( public )
                 */
                singlePublicProp.set(p1, "alpha");

                /** 属性取值 **/
                System.out.println("\n");
                String name = (String) singlePublicProp.get(p1);
                System.out.println("[singlePropName]: " + name);

            } catch (IllegalAccessException e) {
                e.printStackTrace();
            }

            /**
             * 获取指定类的所有属性
             *
             * 仅获取公有的属性( public )
             * 包含继承的父类的公共属性
             */
            System.out.println("\n");
            Field[] allPublicProps = cls.getFields();
            System.out.println("[get public prop in " + cls  + " and extends father-class]");
            for (Field p : allPublicProps) {
                System.out.println(p.getName());
            }
            System.out.println("[get public prop in " + cls + " and extends father-class]");

            /** 获取单个私有属性 **/
            System.out.println("\n");
            Field singlePrivateProp = cls.getDeclaredField("male");
            System.out.println("[singlePrivateProp]: " + singlePrivateProp.getName());

            /** 若设置私有属性, 则必须设置该属性 **/
            System.out.println("\n");
            singlePrivateProp.setAccessible(true);
            try {
                singlePrivateProp.set(p1, "female");
                System.out.println("[singlePrivateProp]: " + (String) singlePrivateProp.get(p1));
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            }

            /**
             * 获取指定类的所有属性
             *
             * 仅可获取当前类中的属性( pubic, private )
             */
            System.out.println("\n");
            Field[] allProps = cls.getDeclaredFields();
            System.out.println("[get all prop in " + cls + "]");
            for (Field p : allProps) {
                System.out.println(p.getName());
            }
            System.out.println("[get all prop in " + cls + "]");

        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (NoSuchFieldException e) {
            e.printStackTrace();
        }
    }
}
