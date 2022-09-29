package reflect.case_ioc_of_annotation;

import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import static java.lang.annotation.ElementType.*;
import static java.lang.annotation.RetentionPolicy.RUNTIME;


@Target({CONSTRUCTOR, METHOD})
@Retention(RUNTIME)
public @interface CustomAnnotation {

    String[] value() default {"alpha", "18", "male"};
}
