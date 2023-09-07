package src.reflect;

public class Person extends Animal {

    public String name;
    public int age;
    private final String male = "male";

    Person() {
    }

    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return this.name;
    }

    public String getName(String firstName, String lastName) throws Exception {
        return firstName + "-" + lastName;
    }

    private void mySleep() {
        System.out.println("Person.mySleep();");
    }


}