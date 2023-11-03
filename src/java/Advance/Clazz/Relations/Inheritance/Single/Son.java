package src.java.Advance.Clazz.Relations.Inheritance.Single;

class Son extends Father {

    public String lastName = "jack";

    @Override
    public void sayHi() {
        String fullName = this.firstName + " " + this.lastName;
        System.out.println("I am the son, My name is " + fullName + " There are, " + this.assets + " assets.");
    }
}
