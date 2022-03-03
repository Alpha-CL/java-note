package reflect.CustomAnnotation;

/** @interface: 定义注解类型 **/
public @interface TestAnnotation {


    /**
     * 注解属性
     *
     *
     *
     */
    // public static final String prop = "hello world";
    String prop = "hello world";


    /**
     * 注解方法 必须有返回值
     *
     *      基本数据类型        // byte, int, short, long, flout, double, char, boolean
     *      字符串数据类型       // String
     *      枚举数据类型        // enum
     *      注解数据类型        // @annotation
     *      数组数据类型        // <?>[]
     */
    // public abstract String customMethod();
    String customMethod();


    /**
     * 如何使用自定义注解
     *
     * 自定义注解需要 "java 中 元注解" 描述
     */



}
