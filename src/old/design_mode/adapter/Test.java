package src.old.design_mode.adapter;

public class Test {

    public static void main(String[] args) {

        Bank bank = new Bank();

        User u = new Elder("Elder");
        System.out.println(u.getName());
        bank.conductBusiness(u);
    }
}
