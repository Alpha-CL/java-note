package collection_and_map.cases.Examination;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Random;

public class ExamMachine {

    HashSet<Question> questionsList;

    private HashMap<String, String> userList = new HashMap();

    {

        this.userList.put("alpha", "1");
        this.userList.put("beta", "2");
        this.userList.put("omega", "3");

        questionsList = new HashSet<Question>();

        questionsList.add((new Question("1.以下选项哪个是Java基本数据类型?", new String[]{"String", "Integer", "Boolean", "Math"}, "C")));
        questionsList.add((new Question("2.以下选项哪个不是Java基本数据类型?", new String[]{"String", "int", "Boolean", "Double"}, "A")));
        questionsList.add((new Question("3.以下选项哪个是Java引用数据类型?", new String[]{"String", "Int", "Boolean", "Char"}, "A")));
        questionsList.add((new Question("4.以下选项哪个不是Java引用数据类型?", new String[]{"String", "Integer", "Boolean", "Math"}, "C")));
        questionsList.add((new Question("5.以下选项哪个是java.util包中的类?", new String[]{"String", "Integer", "Scanner", "Math"}, "B")));
        questionsList.add((new Question("6.以下选项哪个不是String类中的方法?", new String[]{"compareTo", "append", "substring", "concat"}, "B")));
        questionsList.add((new Question("7.以下选项哪个是String类中方法?", new String[]{"append", "delete", "insert", "concat"}, "D")));
        questionsList.add((new Question("8.以下选项哪个不是接口中属性的修饰符?", new String[]{"public", "static", "final", "abstract"}, "D")));
        questionsList.add((new Question("9.以下选项哪个不是Set集合的方法?", new String[]{"set", "add", "remove", "iterator"}, "A")));
        questionsList.add((new Question("10.以下选项哪个不是Set集合的方法?", new String[]{"set", "add", "remove", "iterator"}, "A")));
    }

    ExamMachine() {


    }

    public ArrayList<Question> getPaper() {

        System.out.println("考试机正在随机的生成试卷, 请耐心等待...");

        try {
            Thread.sleep(2000L);
        } catch (Exception var4) {
            var4.printStackTrace();
        }

        HashSet<Question> paper = new HashSet<Question>();

        ArrayList<Question> questions = new ArrayList<Question>(this.questionsList);

        while (paper.size() != 5) {
            int i = new Random().nextInt(this.questionsList.size());
            paper.add(questions.get(i));
        }

        return new ArrayList<Question>(paper);
    }


    public String login(String username, String password) {

        String realPassword = this.userList.get(username);
        return realPassword != null && realPassword.equals(password) ? "登陆成功" : "账号或密码错误";
    }


}
