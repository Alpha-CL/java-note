package class_load_order;

public class Test {

    public static void main(String[] args) {

        /**
         * class 加载顺序
         *
         *
         * 1) 加载
         *
         *  1.1 先加载父类
         *  - 产生自己的静态空间( 属性, 方法, 代码块, 执行块 )
         *  - 执行静态块
         *
         *  1.2 再加载子类
         *  - 产生自己的静态空间( 属性, 方法, 代码块, 执行块 )
         *  - 执行静态块
         *
         *
         * 2) 开辟对象所修的内存空间
         *
         *  2.1 加载父类的非静态方法( 属性, 方法, 代码块, 执行块 )
         *      - 2.1.1 执行代码块
         *      - 2.1.2 执行父类构造方法
         *
         *  2.2 加载子类的非静态方法( 属性, 方法, 代码块, 执行块 )
         *      - 2.1.1 执行代码块
         *      - 2.1.2 执行子类构造方法
         */

        Son s = new Son();
    }
}
