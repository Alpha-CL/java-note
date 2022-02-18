package collection_and_map.cases.LoginService;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Objects;

public class LoginServiceOfHashSet {

    private final HashSet<String> userList = new HashSet<String>();

    {
        userList.add("alpha-1");
        userList.add("beta-2");
        userList.add("omega-3");
    }

    public String login(String account, String password) {

        Iterator<String> it = userList.iterator();

        while (it.hasNext()) {
            String[] user = it.next().split("-");
            if (Objects.equals(user[0], account) && Objects.equals(user[1], password)) {
                return "登陆成功";
            }
        }

        return "账号或密码错误";
    }

}
