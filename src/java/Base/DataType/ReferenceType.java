package src.java.Base.DataType;


/** 引用类型 */
public class ReferenceType {

    public static void main(String[] args) {

        ReferenceType referenceType = new ReferenceType();
        referenceType.test();

        String foo = "bar";
        System.out.println("=>(ReferenceType.java:18) foo + referenceType: " + foo + referenceType);
    }


    public String concatStringList(String[] args) {

        /**
         * 字符串拼接
         *
         * 实际调用 StringBuilder类 的 append() 方法来执行拼接操作
         */

        StringBuilder sb = new StringBuilder();

        // 在循环中拼接字符串
        for (int i = 0; i < args.length; i++) {
            sb.append("Number: ").append(i).append(", ");
        }

        // 移除最后的逗号和空格
        sb.setLength(sb.length() - 2);

        // 输出结果
        String result = sb.toString();
        System.out.println("=>(ReferenceType.java:38) result: " + result);

        return result;
    }

    public void test() {

        String foo = "bar";
        int age = 18;
        boolean gender = true;

        System.out.println("=>(ReferenceType.java:40) foo + age: " + foo + age);
        System.out.println("=>(ReferenceType.java:42) foo + gender: " + foo + gender);
    }

    @Override
    public String toString() {
        return "ReferenceType.toString()";
    }


    public void concatVsPlus() {

        /**
         * String.concat()          // 性能更好
         *
         *  - 仅可以用于字符串之间的拼接，不能与其他数据类型进行拼接
         *
         *  - 使用 StringBuilder类 创建一个新字符串对象，再使用 append(nextString) 追加拼接
         */


        /**
         * +                        // 效率相对较慢，但可以使用多类型
         *  - 都是字符串之间拼接: 使用 StringBuilder类 创建一个新字符串对象，再使用 append(nextString) 追加拼接
         *
         *  - 都是数字之间相加: 数据相加运算
         *
         *  - 字符串和其他类型
         *
         *      - 字符串 + 原始类型: 字符串 + 原始类型
         *
         *      - 字符串 + 引用类型: 字符串 + (引用类型的实例的 toString())
         */
    }
}
