package src.java.Extend.Clazz.Base.PermissionModifier;

public class Final {

    /**
     * 使用 final 修饰符 标记的变量/属性，无法被修改
     */
    final String finalStr = "hello world";
    String firstName = "alphal";

    public static void main(String[] args) throws Exception {

        Final finalIns = new Final();
        finalIns.test();
    }

    public void test() throws Exception {
        try {
            // this.finalStr = "hello world";      // 编译及报错
            this.firstName = "beta";
        } catch (Exception e) {
            throw new Exception(e);
        }
    }
}
