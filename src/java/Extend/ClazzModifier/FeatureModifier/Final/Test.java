package src.java.Extend.ClazzModifier.FeatureModifier.Final;

final class feature_modifier {                              // 该类不能被继承( 通常用于工具类 )

    public static void main(String[] args) {

        // final === const
        //
        //      - 原始值: 不能改变
        //      - 引用值: 引用地址能改变

        final String name;                                  // 修饰属性: 定义时必须赋初始值( 属性会有默认值 null, 后续不能修改，会报错 )


        final int a = 520;                                  // 修饰变量-原始值: 属性必须赋初始值( 否则之后无法再给该属性赋值 )
        // a = 1314                                         // 原始值不能改变


        final int any_value;                                // 修饰变量-原始值: 先声明内存空间
        any_value = 100;                                    // 再赋值. 赋值后不能再改变


        final int[] arr = new int[]{1, 2, 3};               // 修饰变量-引用值: 引用值若开始赋值为某种类型后不能再更改类型,
        arr[0] = 520;                                       // 但可以改变引用类型中的子


        for (int v : arr) {
            System.out.println(v);
        }


    }

    public void final_params1 (final int param) {           // 修饰参数: 固定传入参数-原始值
        System.out.println(param);
    }


    public void final_params2 (final int[] param_arr) {     // 修饰参数: 固定传入参数-引用值
        for (int v : param_arr) {
            System.out.println(v);
        }
    }

    final void un_rewrite_method() {                        // 修饰方法: 不可以被子类重写
        System.out.println("子类无法重写该方法");
    }
}
