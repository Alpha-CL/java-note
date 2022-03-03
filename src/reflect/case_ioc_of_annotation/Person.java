package reflect.case_ioc_of_annotation;

import java.time.Period;

public class Person {

    private String name;
    private Integer age;
    private String sex;

    @CustomAnnotation({"beta", "17", "female"})
    public Person() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }
}