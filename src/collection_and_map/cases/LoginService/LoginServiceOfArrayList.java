package src.collection_and_map.cases.LoginService;

import java.util.ArrayList;
import java.util.Objects;

public class LoginServiceOfArrayList {

    private ArrayList<String> userList = new ArrayList<String>();

    {
        userList.add("alpha-1");
        userList.add("beta-2");
        userList.add("omega-3");
    }

    public String login(String account, String password) {

        for (String s : userList) {
            String[] user = s.split("-");
            if (Objects.equals(user[0], account) && Objects.equals(user[1], password)) {
                return "登陆成功";
            }
        }

        return "账号或密码错误";
    }

}
