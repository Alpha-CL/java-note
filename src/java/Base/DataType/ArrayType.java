package src.java.Base.DataType;

public class ArrayType {

    public static void main(String[] args) {

        ArrayType arrayType = new ArrayType();

        arrayType.defineArray();
        arrayType.getArrayItemByIndex();
        arrayType.loop();
        arrayType.dynamicCreateArray();
    }

    public int[] intArrayDemo = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};

    /** 定义/创建 数组 */
    public void defineArray() {


        /**
         * 初始化 int类型 的数组变量
         */
        int[] intArrayVariable;


        /**
         * 静态创建: 一个 int 类型的数组
         *
         * - 初始化 默认值为 {1, 2, 3}
         * - 初始化长度为 3
         */
        int[] intArrayByInitialValue = new int[]{1, 2, 3};
        int[] simplifyIntArrayByInitialValue = {1, 2, 3};               // 简化写法


        /**
         * 动态创建: 一个指定长度的 int类型 的数组
         */
        int arrayTypeLen = 10;
        int[] intArrayByLength = new int[arrayTypeLen];
    }

    /** 获取数组子项 */
    public void getArrayItemByIndex() {

        int firstItem = intArrayDemo[0];
        System.out.println("=>(ArrayType.java:40) firstItem: " + firstItem);

        try {

            int intArrayDemoLength = intArrayDemo.length;
            System.out.println("=>(ArrayType.java:46) intArrayDemoLength: " + intArrayDemoLength);

            /** 数组索引不得超出数组的范围 [0, intArrayDemoLength - 1] */
            int Item = intArrayDemo[20];

        } catch (Exception e) {

            System.out.println("=>(ArrayType.java:47) e: " + e);
        }
    }

    public void loop() {

        /** 普通 for 循环 */
        // for (int i = 0; i < ArrayType.intArrayDemo.length - 1; i++) {
        //     int item = intArrayDemo[i];
        //     System.out.println("=>(ArrayType.java:66) item: " + item);
        // }

        /** 增强 for 循环 */
        for (int item : this.intArrayDemo) {
            System.out.println("=>(ArrayType.java:69) item: " + item);
        }
    }

    /** 动态创建 */
    public void dynamicCreateArray() {

        /** 基础类型 */
        byte[] byteArrayDemo = new byte[10];
        System.out.println("=>(ArrayType.java:76) byteArrayDemo: " + byteArrayDemo[0]);         // 0
        int[] intArrayDemo = new int[10];
        System.out.println("=>(ArrayType.java:78) intArrayDemo: " + intArrayDemo[0]);           // 0
        short[] shortArrayDemo = new short[10];
        System.out.println("=>(ArrayType.java:80) shortArrayDemo: " + shortArrayDemo[0]);       // 0
        long[] longArrayDemo = new long[10];
        System.out.println("=>(ArrayType.java:82) longArrayDemo: " + longArrayDemo[0]);         // 0
        float[] floatArrayDemo = new float[10];
        System.out.println("=>(ArrayType.java:84) floatArrayDemo: " + floatArrayDemo[0]);       // 0.0
        double[] doubleArrayDemo = new double[10];
        System.out.println("=>(ArrayType.java:86) doubleArrayDemo: " + doubleArrayDemo[0]);     // 0.0
        boolean[] booleanArrayDemo = new boolean[10];
        System.out.println("=>(ArrayType.java:88) booleanArrayDemo: " + booleanArrayDemo[0]);   // 0 对应 false
        char[] charArrayDemo = new char[10];
        System.out.println("=>(ArrayType.java:90) charArrayDemo: " + charArrayDemo[0]);         // 0 对应的 Unicode编码

        /** 引用类型，默认值都为 null */
        String[] stringArrayDemo = new String[10];
        System.out.println("=>(ArrayType.java:96) stringArrayDemo: " + stringArrayDemo[0]);
    }
}
