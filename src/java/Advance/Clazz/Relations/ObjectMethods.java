package src.java.Advance.Clazz.Relations;


/**
 * 继承自 Object 中的方法介绍
 */
public class ObjectMethods {

    public ObjectMethods() {
        super();
    }

    /**
     * 该方法返回对象的哈希码值( 散列码 )
     * 哈希码是根据对象的内部状态计算得出的一个整数值，用于快速查找和比较对象
     * 如果重写了 equals()方法，通常也需要重写 hashCode()方法，以保证相等的对象具有相等的哈希码
     */
    @Override
    public int hashCode() {
        return super.hashCode();
    }

    /**
     * 该方法用于比较两个对象是否相等
     * 默认情况下，equals() 方法比较的是两个对象的引用是否相等，即是否指向同一个内存地址
     * 可以根据需要在自定义类中重写 equals() 方法，以实现对象内容的比较
     */
    @Override
    public boolean equals(Object obj) {
        /**
         * 原始值的比较规则：
         *
         * 对于boolean类型，只有当两个值都为true或都为false时，它们才被认为是相等的。
         * 对于数值类型（byte、short、int、long、float和double），它们的值会被直接比较，
         * 只有当两个值相等时，它们才被认为是相等的。注意，对于浮点数类型（float和double）
         * 由于浮点数的精度问题，可能存在一些舍入误差，因此在比较浮点数时应该小心。
         * 对于char类型，它们的Unicode码值会被比较，只有当两个字符的码值相等时，它们才被认为是相等的
         */
        return super.equals(obj);
    }

    /**
     * 该方法用于创建并返回对象的一个副本( 克隆 )
     * 默认情况下，clone() 方法执行的是浅拷贝，即只复制对象的字段值，而不复制引用类型的对象
     * 如果需要实现深拷贝，需要在自定义类中重写 clone() 方法，并在其中实现适当的拷贝逻辑
     */
    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    /**
     * 该方法返回对象的字符串表示形式
     * 默认情况下，toString() 方法返回的是对象的类名和哈希码的字符串表示
     * 可以在自定义类中重写 toString() 方法，以返回更有意义的字符串表示，便于对象的打印和调试
     */
    @Override
    public String toString() {
        return super.toString();
    }

    /**
     * 该方法在对象被垃圾回收器回收之前调用
     * 默认情况下，finalize() 方法为空方法，可以在自定义类中重写该方法，以执行对象回收前的清理操作
     */
    @Override
    protected void finalize() throws Throwable {
        super.finalize();
    }
}
