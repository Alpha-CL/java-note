package feature_modifier.feature_modifier_abstract;

/**
 * abstract class           // 抽象类中不一定包含抽象方法
 *                          ( 一种思想, 将公共特点通过 "抽象方法 + 抽象类" 提取出来,
 *                           若子类为具体类继承 抽象类, 则必须将继承的抽象方法具体化,
 *                           从而实现约束子类的公共方法, 避免父类定义该抽象方法的方法体, 实现了该方法在子类中的多态 )
 *
 *      - 抽象类含有构造方法, 但不能通过 new 直接调用构造方法创建对象
 *      - 抽象方法为了解决, 子类继承父类方法后重写的约束
 *        ( 省去父类定义该方法, 约束继承的子类必须将抽象方法具体化 )
 *
 *
 ** 抽象类中的抽象方法, 是为了预留给 子类使用
 *
 *
 * extends
 *
 *      abstract-class [extends] abstract-class         √       // 抽象类 继承 抽象类
 *
 *      abstract-class [extends] default-class          √       // 抽象类 继承 具体类
 *
 *      default-class [extends] abstract-class          x       // 具体类 继承 抽象类
 *
 *          - "具体类 继承 抽象类"， 必须将父抽象类的抽象方法具体化
 *             ( 实现了  该方法在子类中的多态 )
 */


/**
 * abstract-class --> interface
 *
 *
 ** 抽象类中全部都是 抽象方法,
 *
 *
 */


// 抽象方法必须在抽象类中
public abstract class Animal {

    // public void eat() {
    //     System.out.println("动物随便吃");
    // }

    //  public void sleep() {
    //      System.out.println("动物随便睡");
    //  }

    /**
     * abstract method          // 抽象方法必须在( 抽象类 | 接口 )中
     *
     *
     * [abstract] method ();
     *
     ** 抽象方法只有方法结构没有方法体, 必须有抽象描述符
     */

    // 抽象方法
    public abstract void eat();

    // 抽象方法
    public abstract void sleep();
}
