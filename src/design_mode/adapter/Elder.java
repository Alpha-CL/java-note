package src.design_mode.adapter;

public class Elder extends User {

    Elder() {
    }

    Elder(String name) {
        this.name = name;
    }

    @Override
    public void getNumber() {
        System.out.println("[Elder].getNumber");
    }

    @Override
    public void handleOrder() {
        System.out.println("[Elder].handleOrder");
    }

    @Override
    public void isOver() {
        System.out.println("[Elder].isOver");
    }
}
