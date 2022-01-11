package design_mode.adapter;

public class YoungPeople extends User {

    YoungPeople() {
    }

    YoungPeople(String name) {
        this.name = name;
    }

    @Override
    public void getNumber() {
        System.out.println("[Young people].getNumber");
    }

    @Override
    public void handleOrder() {
        System.out.println("[Young people].handleOrder");
    }

    @Override
    public void isOver() {
        System.out.println("[Young people].isOver");

    }
}
