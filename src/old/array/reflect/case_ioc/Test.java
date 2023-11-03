package src.old.array.reflect.case_ioc;

import src.old.collection_and_map.cases.Examination.Question;
import src.old.reflect.case_ioc.MySpring;
import src.old.reflect.case_ioc.Person;

public class Test {

    public static void main(String[] args) {

        MySpring spring = new MySpring();
        Person person = (Person) spring.getBean("src.old.array.src.old.reflect.case_ico.Person");
        System.out.println(person);

        Question question = (Question) spring.getBean("src.old.array.src.old.reflect.case_ico.Question");
        System.out.println(question);
    }
}
