package src.class_case.class_inner_class;

public class ClassWrap {

    private String name = "[ ClassWrap variable ]";

    public void classMethod1() {
        System.out.println("ClassWrap Method");
    }

    public void classMethod2() {

        final String name = "innerClassMethodClass";

        class innerClassMethodClass {

            /**
             * 局部内部类 === 局部临时变量      // 执行完该方法后, 回收内部类
             *
             *      - 只能使用 final/abstract 修饰符( 无法使用 public protected private static )
             *
             *      局部内部类使用局部变量必须是不可变得( final 修饰符 ), 否则无法使用
             *      ( 类模版加载时候, 若使用变量, 则构建完类, 变量发生改变, 此时是不允许的 )
             *
             ** 编译后生成文件名: [WrapClass]$[number][innerMethod]     // 若重名则使用数字累加
             */

            public void testInnerClassMethod () {
                System.out.println(name + " in ClassWrap.classMethod2");        // 仅能使用不可不变的变量
            }
        }
    }

    /**
     * 内部成员类
     *
     *      内部类调用外部类的成员 [WrapClass].this.[wrapClassMember]
     *
     *
     ** 优点: 省略一个 .java 文件
     *       内部类可以防范外部类中的所有成员( 包括私有的 )
     *
     ** 编译后文件名: [classWrap]$[innerClass]
     */
    public class innerDemoClass {

        private String name = "[ memberClass variable ]";

        public void testMemberClass() {
            System.out.println("testMemberClass: " + ClassWrap.this.name);
        }
    }

    /**
     * 静态内部类
     *
     * 静态成员不能访问 非静态成员( 自身 & 外部类 )     // 静态成员属于类本身
     */

    public static class innerStaticClass {
    }

}