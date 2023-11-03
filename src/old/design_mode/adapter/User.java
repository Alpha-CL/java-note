package src.old.design_mode.adapter;

public abstract class User {

    protected String name;

    public String getName() {
        return this.name;
    }

    // 多态 利用抽象类约束子类必须实现的功能
    public abstract void getNumber();
    public abstract void handleOrder();
    public abstract void isOver();
}
