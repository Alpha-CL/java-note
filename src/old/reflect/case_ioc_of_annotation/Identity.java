package src.old.reflect.case_ioc_of_annotation;

public class Identity {

    private String username;
    private String password;
    private Float balance;

    @CustomAnnotation({"alpha", "1234456", "1314"})
    public Identity() {
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Float getBalance() {
        return balance;
    }

    public void setBalance(Float balance) {
        this.balance = balance;
    }
}
