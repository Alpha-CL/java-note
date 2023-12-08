package src.java.Extend.Examples.case_examination;

import java.util.HashMap;

public class LoginService {

    private final HashMap<String, Integer> userList = new HashMap<String, Integer>();

    {
        userList.put("alpha", 1);
        userList.put("beta", 2);
        userList.put("omega", 3);
    }

    public String login(String name, String password) {
        Integer realPassword = userList.get(name);
        if (realPassword != null && realPassword.equals(Integer.parseInt(password))) {
            return "登陆成功";
        }
        return "账号或密码错误";
    }
}
