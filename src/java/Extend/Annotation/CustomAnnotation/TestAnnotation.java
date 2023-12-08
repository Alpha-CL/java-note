package src.java.Extend.Annotation.CustomAnnotation;

public class TestAnnotation {

    @CustomAnnotation(prop = "prop")
    public String testProp;

    @CustomAnnotation(method = 520)
    public int testMethod() {
        return 1314;
    }

}