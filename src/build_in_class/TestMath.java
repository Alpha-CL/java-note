package src.build_in_class;

public class TestMath {

    public static void main(String[] args) {

        // 向上取整
        System.out.println(Math.ceil(1.5));                 // 2.0

        // 向下取整
        System.out.println(Math.floor(1.5));                // 1.0

        // 返回临近的整数, 若两边临近成都一样, 则返回偶数
        System.out.println(Math.rint(1.5));                 // 2.0

        // 返回四舍五入的整数
        System.out.println(Math.round(1.5));                // 2
    }
}