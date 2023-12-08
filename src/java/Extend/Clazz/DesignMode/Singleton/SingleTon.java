package src.java.Extend.Clazz.DesignMode.Singleton;

public class SingleTon {

    /**
     * private static final
     *
     * - private       // 私有的( 不许外部改变 )
     * - static        // 静态的( 唯一引用地址 )
     * - final         // 最终的( 不允许改变的 )
     *
     *
     * 1. 私有的构造方法
     * 2. 私有唯一的属性对象
     * 3. 共有静态方法, 用于获取唯一的私有属性
     *
     *
     ** 饿汉式: 立即加载
     * 对象启动时候即加载
     * 不会产生对象没有就使用的错误( 空指针异常 )
     * 启动项目加载对象过多时, 有些还未使用, 则会造成服务器承载压力
     *
     *
     ** 懒汉式: 延迟加载
     * 当使用对象时, 才加载
     * 必须严谨使用, 否则可能会抛出异常
     *
     *
     ** 生命周期托管: 单例对象由他人处理
     */

    // 饿汉式
    // private static final SingleTon single = new SingleTon();
    // public SingleTon getSingleTon() {
    //     return single;
    // }

    // 懒汉式
    private static SingleTon single;

    public static SingleTon getSingleTon() {
        return single == null ? new SingleTon() : single;
    }
}
