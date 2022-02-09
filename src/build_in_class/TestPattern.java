package build_in_class;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TestPattern {

    /** 字符串匹配 **/

    public static void main(String[] args) {

        // Scanner input = new Scanner(System.in);
        // System.out.print("please input a string.");
        // String str = input.nextLine();

        String str = "123456abc112233bdq190022def";

        Pattern pattern = Pattern.compile("\\d{6}[a-zA-Z]{3}");            // 1. 创建指定规则的正则对象
        Matcher matcher = pattern.matcher(str);                            // 2. 创建 匹配器
        while (matcher.find()) {                                           // 3. 开始匹配
            System.out.println(matcher.group());                           // 4. 输出匹配结果
        }
    }
}
