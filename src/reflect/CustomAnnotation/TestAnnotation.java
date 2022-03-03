package reflect.CustomAnnotation;

import java.lang.annotation.*;

import static java.lang.annotation.ElementType.*;
import static java.lang.annotation.RetentionPolicy.RUNTIME;


/**
 * 元注解                         // 自定义注解需要 "元注解" 描述后才可以使用
 *
 *
 * @Target(ElementType[])        // 指定该注解可以用于何处
 *
 * @Retention(RetentionPolicy)   // 指定当前注解存储在何处
 *
 *      - 源代码文件 --> 编译 --> 字节码文件 --> 加载 --> 内存执行
 *        SOURCE                CLASS                 RUNTIME
 *
 * @Inherited                    // 允许被继承
 *
 *
 * @Documented                   // 允许被文档记录
 */

// @Target({ElementType.FIELD, ElementType.METHOD, ElementType.TYPE})
@Target({FIELD, METHOD, TYPE})
@Retention(RUNTIME)
@Inherited
@Documented
public @interface TestAnnotation {


    /**
     * @interface:
     * 定义注解类型
     */


    /**
     * 注解属性
     *
     *
     *
     */
    // public static final String prop = "hello world";
    String prop() default "prop default value";


    /**
     * 注解方法 必须有返回值
     *
     *      基本数据类型        // byte, int, short, long, flout, double, char, boolean
     *      字符串数据类型       // String
     *      枚举数据类型        // enum
     *      注解数据类型        // @annotation
     *      数组数据类型        // <?>[]
     */
    // public abstract String method();
    String method() default "method default value";


    /**
     * value
     *
     *
     * 仅当 当前注解 有且仅有一个方法时, 则可以使用 value
     * 则使用该注解时候, 则可以直接传递值
     *
     * eg: TestAnnotation(method = "foo")
     *     TestAnnotation(value = "foo") => TestAnnotation("foo")
     */
    // String value();


    /**
     * 如何使用
     *
     *
     * 1.
     *
     *
     *
     * 2. 使用自定义注解, 必须书写自定义注解名( java 内置注解, 则可以直接使用 )
     *
     *
     *
     */
}
