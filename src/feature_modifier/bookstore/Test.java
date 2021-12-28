package feature_modifier.bookstore;

import java.util.Scanner;

public class Test {

    public static void main(String[] args) {

        BookStore bs = new BookStore();

        Scanner input = new Scanner(System.in);

        System.out.print("请输入图书金额: ");
        float price = input.nextFloat();

        System.out.print("请输入您的会员信息: ");
        int identity = input.nextInt();

        bs.buyBook(price, identity);
    }
}