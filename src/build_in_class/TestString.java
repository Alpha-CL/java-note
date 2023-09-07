package src.build_in_class;

public class TestString {

    public static void main(String[] args) {


        /**
         * String
         *
         *
         * 1) 属于 java.lang, 默认继承 Object
         * 2) 实现三个接口 Serializable, CharSequence, Comparable
         * 3) 多种创建方式( 重载 )
         * 4) String 类的不可变性
         * 5) 常用方法
         */


        /** create methods **/

        String str1 = "hello world";                                // 子面量创建
        String str2 = new String();                                 // 无参构造方法创建空对象
        String str3 = new String("just do it");             // 有参创建方法创建对象
        String str4 = new String(new byte[]{55, 22, 33});           // 数组中每个子项转换为对应的 char 后, 再拼接为 string
        String str5 = new String(new char[]{'A', 'B', 'C'});        // 直接将 char 拼接为 string

        System.out.println(str1);
        System.out.println(str2);
        System.out.println(str3);
        System.out.println(str4);
        System.out.println(str5);


        /** common methods **/

        String str11 = "abc";
        String str12 = "abd";
        String str13 = "abe";

        // 通常 equals & hashCode 会一起重写
        boolean isEqual = str11.equals(str12);                          // Object.equals: 默认比较地址
        boolean isEqualIgnoreCase = str11.equalsIgnoreCase(str12);      // 忽略大小写比较
        // String.equals( override ): 比较字符串内容
        str11.hashCode();                               // Object.hashCode:
        // String.hashCode( override ): 重写后, 将字符串中每个 char 拆开后 乘以 31 后相加


        /**
         * .compareTo(target: string): boolean;         // override
         *
         *
         * 1) 根据长度较短的字符串作为比较的基础, 将相对索引位置的char 转换为 (Unicode编码) 后相减, 若不等于 0, 则直接返回结果
         * 2) 若两个长度不想等, 并且相对较短的比较后都为 0, 则用 长度较长的长度 减去 较短的长度 并返回
         */

        int compareToRes1 = str11.compareTo(str12);
        int compareToRes2 = str11.compareTo(str13);
        int compareToIngoreCase1 = str11.compareToIgnoreCase(str13);
        System.out.println(compareToRes1);
        System.out.println(compareToRes2);


        /**
         * .toString();          // override
         *
         * Object.toString: class@hashCode;
         * String.toString: string;
         */

        /**
         * .charAt(index: int): str[index] -> value;
         *
         *
         * 返回指定索引对应的字符的( char 值对应的 值 )
         */

        /**
         * .codePointAt(index: int) str[index] -> number:
         *
         *
         * 返回指定索引对应的字符的( char 值对应的 code 码 )
         */

        /**
         * .length(): int;
         *
         *
         * 返回字符串的长度
         */

        /**
         * 字符串拼接            // 执行效率: StringBuffer > concat > +
         *
         *
         * str1 + str2                          // 每次都会频繁创建新对象后将两个字符串拼接
         * str1.concat(str2): string;           // Object 内部会频繁的创建新的 数组 拼接
         * str1.stringBuffer(str2): string;     // 当长度不够时会自动扩容一定的长度
         *
         *
         ** 字符串有不可变得特性
         *      - static: 长度不可变
         *      - final: 引用地址不可变
         *      - private: 无法在String 外部改变 string 内容
         */

        /**
         * str.contain(target: string): boolean;
         *
         *
         * 判断 str 中是否包含 target
         */

        /**
         * 判断是否以指定字符串 开头/结尾
         *
         *
         * str.startWith(prefix: string): boolean;
         * str.endsWith(suffix: string): boolean;;
         */

        /**
         * string -> src.array          // 将字符串转换为指定类型的数组
         *
         *
         * getBytes(): byte[];
         * toCharArray(): char[];
         */

        /**
         * str.indexOf(target: char | string, start: int): int | -1;
         *
         *
         * 判断 str 中指定字符串出现的索引位置
         */

        /**
         * str.isEmpty(): boolean;
         *
         *
         * 判断字符串是否为空字符串( length = 0)
         */

        /**
         * 替换
         *
         *
         * str.replace(key, value);                         // 替换字符串中指定单个字符串
         * str.replace(key, oldValue, newValue);            // 替换字符串中指定单个字符串
         *
         * str.replaceAll();                                // 替换字符串中所有指定字符串
         *
         * str.replaceFirst(key, value);                    // 替换字符串中第一次出现的指定字符串
         */

        /**
         * str.matches(regex);
         *
         *
         * 判断当前表达式是否与 正则匹配
         */

        /**
         * str.split(regex, ?limit);
         *
         *
         * @limit: 是否贪婪匹配( -1, 0, 1);
         */

        /**
         * str.substring(start: int, ?end: int);
         *
         *
         * 截取字符串中指定长度的字符
         */

        /**
         * 转换大小写
         *
         *
         * str.toUpperCase();
         * str.toLowerCase();
         */

        /**
         * 去除空格
         *
         *
         * str.trim();
         * str.leftTrim();
         * str.rightTrim();
         */

        /**
         * 拼接
         *
         *
         * StringBuilder();
         * StringBuffer();
         */
    }
}