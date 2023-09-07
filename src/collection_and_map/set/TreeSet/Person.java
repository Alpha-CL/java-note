package src.collection_and_map.set.TreeSet;

public class Person implements Comparable<Person> {

    String name;
    int age;
    int index;

    Person(String name, int age, int index) {
        this.name = name;
        this.age = age;
        this.index = index;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Person antherPerson) {
            if (this.name.equals(antherPerson.name) && this.age == antherPerson.age) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {

        return this.name.hashCode();
    }

    public String toString() {

        StringBuilder builder = new StringBuilder("{ ");
        builder.append(this.name);
        builder.append(", ");
        builder.append(this.age);
        builder.append(", ");
        builder.append(this.index);
        builder.append(" }");

        return builder.toString();
    }

    public int compareTo(Person o) {
        int value = this.name.compareTo(o.name);
        if (value != 0) {
            return value;
        }
        return this.age - o.age;
    }
}
