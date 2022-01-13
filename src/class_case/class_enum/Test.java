package class_case.class_enum;

import java.util.Scanner;

public class Test {

    public static void main(String[] args) {

        Day d1 = Day.monday;
        EnumDay d2 = EnumDay.monday;

        // 获取所有天
        EnumDay[] ds = EnumDay.values();
        // for(EnumDay d:ds) {
        //     System.out.println(d.name() + " - " + d.ordinal());
        // }

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the day of the week");
        String key = input.nextLine();
        EnumDay day = EnumDay.valueOf(key);
        switch(day) {
            case monday:
                System.out.println("结果: 您输入的是星期一");
                break;
            case tuesday:
                System.out.println("结果: 您输入的是星期二");
                break;
            case wednesday:
                System.out.println("结果: 您输入的是星期三");
                break;
            case thursday:
                System.out.println("结果: 您输入的是星期四");
                break;
            case friday:
                System.out.println("结果: 您输入的是星期五");
                break;
            case saturday:
                System.out.println("结果: 您输入的是星期六");
                break;
            case sunday:
                System.out.println("结果: 您输入的是星期天");
                break;
            default:
                System.out.println("结果: 请输入正确的星期英文");
        }
    }
}