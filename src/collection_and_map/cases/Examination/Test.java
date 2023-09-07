package src.collection_and_map.cases.Examination;

import java.util.ArrayList;
import java.util.Scanner;

public class Test {

    public static void main(String[] args) {

        ExamMachine machine = new ExamMachine();

        Scanner input = new Scanner(System.in);

        System.out.println("请输入用户名");
        String username = input.nextLine();

        System.out.println("请输入密码");
        String password = input.nextLine();

        Student student = new Student(username, password);
        String isLogin = machine.login(student.getUsername(), student.getPassword());

        if (isLogin.equals("登陆成功")) {

            ArrayList<Question> paper = machine.getPaper();

            System.out.println("登陆成功");

            String[] answers = student.exam(paper);

            Teacher teacher = new Teacher();

            int score = teacher.checkPaper(paper, answers);
            System.out.println(student.getUsername() + "最终的成绩为: " + score);

        } else {
            System.out.println("请输入正确的账号或密码");
        }

    }
}
