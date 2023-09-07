package src.collection_and_map.cases.Examination;

import java.util.Objects;

public class Question {

    private final String[] answerMap = new String[]{"A", "B", "C", "D"};

    private final String heading;         // 题目
    private final String[] options;       // 选项
    private final String answer;          // 答案

    Question(String heading, String[] options, String answer) {

        this.heading = heading;
        this.options = options;
        this.answer = answer;
    }

    /**
     * 重写 equals & hashCode, 为了比较 Question
     *
     *
     *
     */

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Question antherQuestion) {
            return Objects.equals(antherQuestion.heading, this.heading);
        }
        return false;
    }

    public int hashCode() {
        return 0;
    }

    public String getHeading() {
        return this.heading;
    }

    public String getOptions() {

        StringBuilder stringBuilder = new StringBuilder("");

        for (int i = 0; i < this.options.length; i++) {

            stringBuilder
                    .append(this.answerMap[i])
                    .append(".")
                    .append(this.options[i])
                    .append("\t");
        }

        return stringBuilder.toString();
    }

    public String getAnswer() {
        return this.answer;
    }
}