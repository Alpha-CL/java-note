package reflect.CustomAnnotation;

public class Test {

    @TestAnnotation(prop = "prop")
    public String prop;

    @TestAnnotation(method="method")
    public String testMethod() {
        return "test method annotation";
    }
}