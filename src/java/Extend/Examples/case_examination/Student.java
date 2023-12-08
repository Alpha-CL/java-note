package src.java.Extend.Examples.case_examination;

import java.util.ArrayList;
import java.util.Scanner;

public class Student {

    String username;
    String password;

    Student(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public String getUsername() {
        return this.username;
    }

    public String getPassword() {
        return this.password;
    }

    public String[] exam(ArrayList<Question> paper) {

        String[] answers = new String[paper.size()];
        Scanner input = new Scanner(System.in);

        for (int i = 0; i < paper.size(); i++) {
            Question question = paper.get(i);
            System.out.println(question.getHeading() + "\n" + question.getOptions() + "\n" + "请输入您认为正确的选项: ") ;
            answers[i] = input.nextLine();
        }

        return answers;
    }
}
