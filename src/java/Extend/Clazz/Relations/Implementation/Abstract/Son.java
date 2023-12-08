package src.java.Extend.Clazz.Relations.Implementation.Abstract;

public class Son extends Father implements Mother {

    public String lastName = "Alpha";

    @Override
    public String fullName() {
        return this.firstName + " " + this.lastName;
    }

    @Override
    public void sayHi() {
        String fullName = this.fullName();
        System.out.println("=>(Son.java:14) sayHi: my name is " + fullName);
    }

    @Override
    public void playGame() {
        System.out.println("=>(Son.java:20) playGame: inherit GrandFather");
    }
}
