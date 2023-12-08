package src.java.Extend.Clazz.DesignMode.Adapter;

public class Bank {

    public void conductBusiness(User user) {

        System.out.println("welcome [ " + user.getName() + " ] to the bank, what kind of business do you need? ");
        user.getNumber();
        user.handleOrder();
        user.isOver();
    }
}
