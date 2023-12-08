package src.java.Base.DataType;

public class TypeConversion {

    public static void main(String[] args) {

        TypeConversion typeConversion = new TypeConversion();

        typeConversion.implicitTypeConversion();
        typeConversion.explicitTypeConversion();
    }

    /** 类型转换: 转换为二进制后再进行计算 */

    /**
     * 隐式类型转换( 自动类型转换 )             // 小空间 -> 大空间
     *
     * 隐式类型转换是指将一个较小范围的数据类型自动转换为较大范围的数据类型
     * 而不会造成数据丢失或溢出。例如，将一个 int 赋值给 long，或将一个 float 赋值给 double
     */
    public void implicitTypeConversion() {

        /**
         * byte → short → char -> int → long → float → double
         *
         * char 可以隐式转换为 int
         * 所有整数类型可以隐式转换为浮点数类型
         */
        byte byteNum = 88;
        short byteNumToShortNum = (short) byteNum;                      // byte  -> short
        char shortNumToCharNum = (char) byteNumToShortNum;              // short -> char
        int charNumToIntNum = (int) shortNumToCharNum;                  // char  -> int
        long intNumToLongNum = (long) charNumToIntNum;                  // int   -> long
        float longNumToFloatNum = (float) intNumToLongNum;              // long  -> float
        double longNumToDoubleNum = (double) longNumToFloatNum;         // float -> double

        System.out.println("=>(TypeConversion.java:26) longNumToDoubleNum: " + longNumToDoubleNum);


        char characterNum = 'A';
        int characterNumToIntNum = (int) characterNum;

        System.out.println("=>(TypeConversion.java:32) characterNumToIntNum: " + characterNumToIntNum);
    }

    /**
     * 显式类型转换( 强制类型转换 )             // 大空间 -> 小空间
     * 可能会丢失精度
     * <p>
     * 显式类型转换是指通过强制转换运算符将一个较大范围的数据类型转换为较小范围的数据类型
     * 显式类型转换可能会导致数据丢失或溢出。例如，将一个 double 强制转换为 int，或将一个 long 强制转换为 short
     */
    public void explicitTypeConversion() {

        /** 强制类型转换需要在目标类型前加上括号，并将要转换的变量放在括号内 */

        /**
         * int 转 byte 类型
         */
        int num = 9999;
        byte numToByte = (byte) num;
        System.out.println("=>(TypeConversion.java:53) numToByte: " + numToByte);


        /**
         * 浮点型小数 转 整数类型 会丢失其 小数部分的精度
         */
        float floatNum = 22.22F;
        int floatNumToInt = (int) floatNum;
        System.out.println("=>(TypeConversion.java:61) floatNumToInt: " + floatNumToInt);


        /**
         * char 转 int 类型
         */
        char characterNum = 'A';
        int charNumToInt = (int) characterNum;
        System.out.println("=>(TypeConversion.java:69) charNumToInt: " + charNumToInt);


        /**
         * 布尔值 转 整数类型                   // 常规用法
         */
        boolean intBoolean = false;
        int booleanToInt = intBoolean ? 1 : 0;
        System.out.println("=>(TypeConversion.java:77) booleanToInt: " + booleanToInt);
    }
}
