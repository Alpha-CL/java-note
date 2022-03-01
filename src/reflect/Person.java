package reflect;

public class Person extends Animal {

    public String name;
    public int age;
    private final String  male = "male";

    Person() {
    }

    Person(String name, int age, boolean male) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return this.name;
    }
}