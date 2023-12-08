package src.java.Extend.Examples.class_polymorphism;

public class Son extends Father {

    @Override
    public void eat() {
        System.out.println("* Son.eat: 爱吃肉 *");
    }

    public void playGame() {
        System.out.println("* Son.playGame: 爱打游戏 *");
    }
}
