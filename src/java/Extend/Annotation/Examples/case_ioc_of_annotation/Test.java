package src.java.Extend.Annotation.Examples.case_ioc_of_annotation;

public class Test {

    public static void main(String[] args) {


        MySpring ms = new MySpring();


        Person person = (Person) ms.getBean("src.java.Extend.reflect.case_ioc_of_annotation.Person");
        @SuppressWarnings("all")
        StringBuilder personInfo = new StringBuilder("My name is ");
        personInfo.append(person.getName()).append(", ");
        personInfo.append("I am ").append(person.getAge()).append(" years old.");
        System.out.println(personInfo);


        Identity identity = (Identity) ms.getBean("src.java.Extend.reflect.case_ioc_of_annotation.Identity");
        @SuppressWarnings("all")
        StringBuilder identityInfo = new StringBuilder("");
        identityInfo.append("username: ").append(identity.getUsername()).append("; ");
        identityInfo.append("password: ").append(identity.getUsername()).append("; ");
        identityInfo.append("balance: ").append(identity.getBalance()).append(";");
        System.out.println(identityInfo);


        Question question = (Question) ms.getBean("src.java.Extend.reflect.case_ioc_of_annotation.Question");
        @SuppressWarnings("all")
        StringBuilder questionInfo = new StringBuilder("");
        questionInfo.append(question.getTitle()).append("\n");
        questionInfo.append(question.getAnswer());
        System.out.println(questionInfo);
    }
}
