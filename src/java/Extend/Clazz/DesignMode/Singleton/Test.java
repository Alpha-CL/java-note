package src.java.Extend.Clazz.DesignMode.Singleton;

public class Test {

    public static void main(String[] args) {

        SingleTon s = new SingleTon();

        SingleTon s1 = s.getSingleTon();
        SingleTon s2 = s.getSingleTon();

        System.out.println(s1 == s2);
        System.out.println(s1.equals(s2));
    }
}
