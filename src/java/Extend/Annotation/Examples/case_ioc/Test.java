package src.java.Extend.Annotation.Examples.case_ioc;

import src.java.Extend.Examples.case_examination.Question;

public class Test {

    public static void main(String[] args) {

        MySpring spring = new MySpring();
        Person person = (Person) spring.getBean("src.java.Advance.array.src.java.Extend.reflect.case_ico.Person");
        System.out.println(person);

        Question question = (Question) spring.getBean("src.java.Advance.array.src.java.Extend.reflect.case_ico.Question");
        System.out.println(question);
    }
}
