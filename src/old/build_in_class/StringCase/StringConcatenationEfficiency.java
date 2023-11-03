package src.old.build_in_class.StringCase;

public class StringConcatenationEfficiency {

    public static void main(String[] args) {

        /**
         * 字符串拼接效率对比
         *
         *
         ** 字符串有不可改变的特性
         */

        /** 每次拼接都会创建新的String对象 **/
        String str = "1";
        long start1 = System.currentTimeMillis();
        for (int i = 0; i < 20000; i++) {
            str += i;
        }
        long end1 = System.currentTimeMillis();
        System.out.println("str1 + str2: " + (end1 - start1) + "ms");


        /** 每次拼接在同一个String对象内部 char[] 添加 **/
        long start2 = System.currentTimeMillis();
        for (int i = 0; i < 20000; i++) {
            str = str.concat(new String(String.valueOf(i)));
        }
        long end2 = System.currentTimeMillis();
        System.out.println("str1.concat(str2): " + (end2 - start2) + "ms");

        /** 当发现空间不够时会成倍增加空间( 多线程并发 ) **/
        StringBuilder builder = new StringBuilder("abcdefg");
        long start3 = System.currentTimeMillis();
        for (int i = 0; i < 200000; i++) {
            builder.append(i);
        }
        long end3 = System.currentTimeMillis();
        System.out.println("StringBuilder.append(str): " + (end3 - start3) + "ms");

        /** 当发现空间不够时会成倍增加空间( 单线程 ) **/
        StringBuffer buffer = new StringBuffer("abcdefg");
        long start4 = System.currentTimeMillis();
        for (int i = 0; i < 200000; i++) {
            buffer.append(i);
        }
        long end4 = System.currentTimeMillis();
        System.out.println("StringBuffer.append(str): " + (end4 - start4) + "ms");
    }
}
