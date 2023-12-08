package src.java.Extend.ClazzModifier.FeatureModifier.Private;

public class BookStore {

    private static final int BOOKSTORE_ADMIN = 0;
    private static final int BOOKSTORE_VIP = 1;
    private static final int BOOKSTORE_CUSTOMER = 2;

    // 购买图书
    public void buyBook(float price, int identity) {

        switch (identity) {
            // 管理员
            case BookStore.BOOKSTORE_ADMIN -> System.out.println("尊敬的书店 [管理员], 您购买的图书应付款: " + price * 0.5);
            // VIP
            case BookStore.BOOKSTORE_VIP -> System.out.println("尊敬的书店 [VIP客户], 您购买的图书应付款: " + price * 0.8);
            // 普通用户
            case BookStore.BOOKSTORE_CUSTOMER -> System.out.println("尊敬的书店 [普通用户], 您购买的图书应付款: " + price);
            default -> System.out.println("系统查不到您的身份, 抱歉");
        }
    }
}