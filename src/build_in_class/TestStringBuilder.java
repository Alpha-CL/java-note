package build_in_class;

public class TestStringBuilder {

    public static void main(String[] args) {

        StringBuilder builder = new StringBuilder("123456");

        /**
         * constructor          // 支持多线程并发
         *
         *
         * new StringBuilder();                              // 无参数构造方法, 默认创建长度 16 空间的对象
         * new StringBuilder(space: int);                    // 有参数构造方法,
         * new StringBuilder(value: string, space: int);     // 有参数构造方法,
         *
         *
         ** 执行效率: StringBuilder.append(); > StringBuffer.append(); > String.concat(); > +
         */

        /**
         * 删除
         *
         *      - .delete(start, ?end);             // 删除 指定部分
         *      - .substring(start, ?end);          // 截取 指定部分
         *      - .deleteCharAtIndex(i: int);       // 删除指定索引的字符
         */


        /**
         * 查询第一次出现的位置
         *
         *
         * builder.indexOf();
         */

        int index = builder.indexOf("2");
        System.out.println(index);

        /**
         * 插入
         *
         *
         * builder.insert();
         */

        builder.insert(0, "insert");
        System.out.println(builder.toString());

        /**
         * 追加
         *
         *
         * builder.append();
         */

        builder.append("append");
        System.out.println(builder.toString());

        /**
         * 替换
         *
         *
         * builder.replace(start, end, value);
         */

        builder.replace(0,3, "aaa");
        System.out.println(builder.toString());

        /**
         * 反转
         *
         *
         * builder.reverse();
         */

        System.out.println(builder.reverse().toString());

        /**
         * 设置字符
         *
         *
         * builder.charAt();
         * builder.setCharAt();                 // 更改某个字符
         * builder.deleteCharAt();              // 删除某个字符
         */

        /**
         * 设置字符串的长度
         *
         *
         * 设置字符串的长度会影字符的显示
         * 重新更改字符串, 则长度会被影响
         */

        System.out.println(builder.length());
        builder.setLength(2);                       // 更改字符串长度
        System.out.println(builder.length());
        builder.append("111");
        System.out.println(builder.length());

        /**
         * 去除字符串中扩容无用的空间
         *
         *
         * 若手动设置了 setLength(len); 则仅会去除到该设置的长度空间
         */

        // builder.setLength(20);                   // 更改字符串长度

        System.out.println(builder.length());       // 20
        System.out.println(builder.capacity());     // 22
        builder.trimToSize();
        System.out.println(builder.length());       // 20
        System.out.println(builder.capacity());     // 20
    }
}