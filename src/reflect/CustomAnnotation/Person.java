package reflect.CustomAnnotation;

public class Person {

    @CustomAnnotation(prop = "alpha")
    public String name;
    private int age;

    @CustomAnnotation(method = 18)
    public int getAge() {
        return age;
    }
}
