package collection_and_map.cases.LoginService;

import java.util.Objects;

public class LoginServiceOfStringArray {

    private final String[] accountList = new String[]{"alpha", "beta", "omega"};
    private final String[] passwordList = new String[]{"1", "2", "3"};

    public String login(String account, String password) {
        for (int i = 0; i < accountList.length; i++) {
            if (Objects.equals(accountList[i], account) && Objects.equals(passwordList[i], password)) {
                return "登陆成功";
            }
        }
        return "账号或密码错误";
    }
}
