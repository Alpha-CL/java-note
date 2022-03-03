package reflect.case_ioc;

import reflect.case_ioc_of_annotation.CustomAnnotation;

public class Question {

    private String title;
    private String answer;

    @CustomAnnotation({"1+1=?A.2B.3C.4D.5","A"})
    public Question() {
    }

    public Question(String title, String answer) {
        this.title = title;
        this.answer = answer;
    }

    public String toString() {
        return "{" + title + "," + answer + "}";
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }
}
