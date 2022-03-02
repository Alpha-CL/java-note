package reflect;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class TestConstructorInClass {

    public static void main(String[] args) {

        Class<Person> cls = Person.class;

        try {


            Constructor<Person> ct1 = cls.getConstructor();
            Constructor<Person> ct2 = cls.getConstructor(String.class, int.class);


            ct1.newInstance();
            ct2.newInstance("alpha", 18);


            Constructor[] cts = cls.getConstructors();
            for( Constructor c: cts) {
                System.out.println(c);
            }



            Constructor<Person> ct3 = cls.getDeclaredConstructor();
            Constructor<Person> ct4 = cls.getDeclaredConstructor(String.class, int.class);


            ct3.newInstance();
            ct4.newInstance("alpha", 18);





        } catch (NoSuchMethodException | InstantiationException | IllegalAccessException | InvocationTargetException e) {

            e.printStackTrace();
        }
    }
}
