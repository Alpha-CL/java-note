package src.collection_and_map.cases.Examination;

import java.util.ArrayList;

public class Teacher {


    public Teacher() {
    }

    public int checkPaper(ArrayList<Question> paper, String[] answers) {

        System.out.println("老师正在批卷子，请耐心等待最终成绩...");

        try {
            Thread.sleep(2000L);
        } catch (InterruptedException var6) {
            var6.printStackTrace();
        }

        int score = 0;

        for(int i = 0; i < paper.size(); ++i) {
            Question question = (Question)paper.get(i);
            if (question.getAnswer().equalsIgnoreCase(answers[i])) {
                score += 100 / paper.size();
            }
        }

        return score;
    }
}
