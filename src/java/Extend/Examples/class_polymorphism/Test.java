package src.java.Extend.Examples.class_polymorphism;

public class Test {

    public static void main(String[] args) {

        Father f = new Son();

        f.eat();
        f.sleep();

        Son s = (Son) f;
        s.playGame();
    }
}
