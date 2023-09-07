package src.collection_and_map.set.HashSet;

public class Person {

    String name;
    int testNum;

    Person(String name, int num) {

        this.name = name;
        this.testNum = num;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Person antherPerson) {
            if (this.name.equals(antherPerson.name) && this.testNum == antherPerson.testNum) {
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
        builder.append(",");
        builder.append(this.testNum);
        builder.append(" }");

        return builder.toString();
    }

    public String getName() {
        return this.name;
    }

    public int getNum() {
        return this.testNum;
    }
}
