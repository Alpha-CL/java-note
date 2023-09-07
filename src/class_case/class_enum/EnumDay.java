package src.class_case.class_enum;

public enum EnumDay {

    /**
     * 描述了七个当前类的对象
     *
     *
     * 默认直接继承关系: EnumDay -> [Enum] -> [Object]
     * ( 无法使用 extends 继承其他类, 但可以实现抽象类或接口的方法 )
     */

    // public static final Day monday = new Day();
    // public static final Day tuesday = new Day();
    // public static final Day wednesday = new Day();
    // public static final Day thursday = new Day();
    // public static final Day friday = new Day();
    // public static final Day saturday = new Day();
    // public static final Day sunday = new Day();


    monday("星期一", 0),           // 若需要传参调用, 则必须重写构造方法
    tuesday("星期二", 1),
    wednesday("星期三", 2),
    thursday,
    friday,
    saturday,
    sunday;             // 若后续还有其他成员, 则需要添加 分号 结束


    // 自定义属性
    private String name;
    private int index;

    /** 构造方法仅能使用 private 修饰符 **/
    private EnumDay(){}
    private EnumDay(String name, int index){
        this.name = name;
        this.index = index;
    }
    /** 构造方法仅能使用 private 修饰符 **/


    public void testMethod() {
        // 自定义方法
    }
}
