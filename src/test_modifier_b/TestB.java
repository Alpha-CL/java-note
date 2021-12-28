package test_modifier_b;

import test_modifier_a.TestA;

public class TestB extends TestA {

    public void testB () {

        this.testPublic();
        this.testProtected();
    }

    public static void main(String[] args) {

        TestA ta = new TestA();
        ta.testPublic();
    }

    public void testBB () {

        TestA ta = new TestA();
        ta.testPublic();
        ta.testPublic();
    }
}
