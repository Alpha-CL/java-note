package reflect;

import java.util.ArrayList;

public class TestArrayListClass {

    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<String>();

        Class cls = ArrayList.class;
        Class scls = cls.getSuperclass();

        // while(scls != null) {
        //     System.out.println(scls.getName());
        //     scls = scls.getSuperclass();
        // }

        Class[] clsList = cls.getInterfaces();
        for (Class c : clsList) {
            System.out.println(c.getName());
        }

    }
}
