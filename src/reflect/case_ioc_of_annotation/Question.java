package src.reflect.case_ioc_of_annotation;

public class Question {

    private String title;
    private String answer;

    @CustomAnnotation({"Do you marry me ?", "A. yes i do.\tB. sorry, you are a good man."})
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
