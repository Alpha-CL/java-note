package test_modifier_a;

public class TestA {

    // public static void main(String[] args) {
    //
    //     TestA ta = new TestA();
    //     ta.testPublic();
    //     ta.testProtected();
    //     ta.testDefault();
    //     ta.testPrivate();
    // }

    public void testPublic() {
        System.out.println("testPublic");
    }

    protected void testProtected() {
        System.out.println("testProtected");
    }

    void testDefault () {
        System.out.println("testDefault");
    }

    private void testPrivate() {
        System.out.println("testPrivate");
    }

}
