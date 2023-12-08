package src.java.Extend.Clazz.DesignMode.Adapter;

public class LocalTycoon extends User {

    LocalTycoon() {
    }

    LocalTycoon(String name) {
        this.name = name;
    }

    @Override
    public void getNumber() {
        System.out.println("[Local tycoon].getNumber");
    }

    @Override
    public void handleOrder() {
        System.out.println("[Local tycoon].handleOrder");
    }

    @Override
    public void isOver() {
        System.out.println("[Local tycoon].isOver");

    }
}
