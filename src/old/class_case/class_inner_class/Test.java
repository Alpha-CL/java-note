package src.old.class_case.class_inner_class;

public class Test {

    public static void main(String[] args) {

         ClassWrap classWrap = new ClassWrap();
         ClassWrap.innerDemoClass mc = classWrap.new innerDemoClass();

        // ClassWrap.MemberClass mc = new ClassWrap.new MemberClass();
        mc.testMemberClass();
    }
}