package class_case.inner_class;
import class_case.inner_class.ClassWrap.innerDemoClass;

public class Test {

    public static void main(String[] args) {

         ClassWrap classWrap = new ClassWrap();
         ClassWrap.innerDemoClass mc = classWrap.new innerDemoClass();

        // ClassWrap.MemberClass mc = new ClassWrap.new MemberClass();
        mc.testMemberClass();
    }
}