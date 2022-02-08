package build_in_class;

public class TestStringBuilder {

    public static void main(String[] args) {


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
         *
         */

        /**
         * 插入
         *
         *
         * .insert();
         */

        /**
         * 追加
         *
         *
         * .append();
         */

    }
}
