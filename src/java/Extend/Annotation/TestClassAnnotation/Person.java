package src.java.Extend.Annotation.TestClassAnnotation;

import java.io.FileReader;
import java.io.IOException;
import java.util.*;

public class Person extends Animal implements TestInterface {


    @SuppressWarnings({"unused", "serial"})
    private static final long serialVersionUID = -4588698195338178907L;


    /**
     * @Deprecated                      // 表示该方法已废弃
     *
     *
     * since: 指定已注解的API元素已被弃用的版本。
     * forRemoval: 表示在将来的既定版本中会被删除，应该迁移 API
     */

    @Deprecated(since = "1.2", forRemoval = true)
    public void testDeprecated() {
        System.out.println("test deprecated");
    }


    /**
     * @Override                        // 方法重写
     *
     *
     * 方法名                           // 必须一致
     * 参数( 数量, 类型, 顺序 )          // 必须一致
     * 返回值                           // 子类返回值类型 小于等于 父类
     *
     * 修饰符                           // 子类修饰符 大于等于 父类
     * 抛出异常( 数量, 类型 )            // 子类 小于等于 父类
     *
     *
     ** 继承自父类的方法也算做接口实现
     */

    @Override
    public void eat() {
        System.out.println("[override animal eat();]");
    }


    /**
     * @Overload
     *
     *
     * 方法名                          // 必须一致
     * 参数( 数量, 类型, 顺序 )         // 不同
     */

     // 方法重载
     public String eat(String foot) {
         System.out.println("[reload animal eat();]");
         return "eat " + foot;
     }


    /**
     * @SuppressWarnings(info)
     *
     *
     *      - unused:       变量定义后未被使用
     *      - serial:       类实现了序列化接口, 不添加序列化 ID 号
     *      - rawtypes:     集合没有定义泛型
     *      - deprecation:  去除已过时成员的警告
     *      - unchecked:    不检测泛型( 类似于 ignore )             // 其他不建议使用( 规范编码可以避免其他编码时报错 )
     *
     *      - all           包含所有
     */
    public void testSuppressWarnings(){

        @SuppressWarnings("unused")
        String str = "test suppress warnings";

        @SuppressWarnings("rawtypes")
        ArrayList list = new ArrayList();

        // @SuppressWarnings({"deprecation", "unused"})
        @SuppressWarnings("all")
        Date date = new Date(2020, Calendar.FEBRUARY, 1);

        /**
         * Properties       // map集合
         *
         *
         * 仅可读取 .properties 的文件
         *
         * key=value
         * key=value
         * key=value
         */
        try {

            Properties pro = new Properties();
            pro.load(new FileReader("src/src.java.Extend.reflect/TestClassAnnotation/db.properties"));

            // @SuppressWarnings("unchecked")
            Enumeration<?> en = pro.propertyNames();
            while (en.hasMoreElements()) {
                String key = (String) en.nextElement();
                String value = pro.getProperty(key);
                System.out.println(key + ":" + value);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
