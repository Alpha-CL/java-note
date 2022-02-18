package collection_and_map.cases.LoginService;

import java.util.Scanner;

public class Test {

    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);

        System.out.print("请输入账号");
        String account = input.nextLine();

        System.out.print("请输入密码");
        String password = input.nextLine();


        LoginServiceOfStringArray loginOfStringArray = new LoginServiceOfStringArray();
        String isLogin1 = loginOfStringArray.login(account, password);
        System.out.println("loginOfStringArray: " + isLogin1);


        LoginServiceOfArrayList loginOfArrayList = new LoginServiceOfArrayList();
        String isLogin2 = loginOfArrayList.login(account, password);
        System.out.println("loginOfArrayList: " + isLogin2);


        LoginServiceOfHashSet loginOfHashSet = new LoginServiceOfHashSet();
        String isLogin3 = loginOfHashSet.login(account, password);
        System.out.println("loginOfArrayList: " + isLogin3);


        LoginServiceOfHashMap loginOfHashMap = new LoginServiceOfHashMap();
        String isLogin4 = loginOfHashMap.login(account, password);
        System.out.println("loginOfArrayList: " + isLogin4);

    }
}
