package reflect.case_ioc;

public class Test {

    public static void main(String[] args) {

        MySpring spring = new MySpring();
        Person person = (Person) spring.getBean("reflect.case_ico.Person");
        System.out.println(person);

        Question question = (Question) spring.getBean("reflect.case_ico.Question");
        System.out.println(question);
    }
}
