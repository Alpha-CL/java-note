package src.feature_modifier.feature_modifier_static;

public class TestStatic {

    public static void main(String[] args) {

        Person p1 = new Person();
        p1.name = "alpha";
        p1.age = 18;

        Person p2 = new Person();
        p2.name = "beta";
        p2.age = 17;

        System.out.println("My name is " + p1.name + ", I am " + p1.age + " years old.");
        System.out.println("My name is " + p2.name + ", I am " + p2.age + " years old.");

    }
}
