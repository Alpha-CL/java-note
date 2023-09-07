package src.feature_modifier.interface_class;

public interface TestInterface {

    /**
     * public interface [name] {                // 不能继承其他类
     *                                          // 不能创建方法
     *                                          // 仅通过子类
     *
     *      public static final [ member ];
     *
     *      // member
     *          - prop:
     *          - method:
     *          - block-code:
     *          - construct-method:
     * }
     *
     ** interface: 用于定义规则
     *   abstract-class: 描述事物
     *
     *
     */

    /**
     * abstract-class vs interface
     *
     *      interface --> 直接多实现 --> abstract-class --> 多继承 --> class
     *          |                              |
     *          |                              | --------------------> |        单继承
     *          |                              |        class 必须将 abstract-method 具体化
     *          |                              |
     *          |                              | <-------------------- |        单继承
     *          |                              |        可以直接单继承
     *          | <--------------------------- |
     *          |         直接多实现
     *          |
     *          | <--------------------------------------------------- |
     *                     不能直接多实现, 需要将抽象方法具体化
     *
     *
     *      abstract-class --> 直接多实现 --> interface      √           //
     *      default-class --> 直接多实现 --> interface       x           //
     *      interface ------> 多继承 -----> interface       √           // 可以直接多实现
     *
     *
     */

    public static final String prop = "";

    public default void abstractMethod() {
    }

}
