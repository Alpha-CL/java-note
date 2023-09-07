package src.class_case.garbage_collection;

public class TestGC {

    /**
     * TestGC 默认继承 Object
     *
     ** Object
     *      - hashCode  equals  toString  ...
     *      - public finalize( 用于垃圾回收 )
     */

    public TestGC() {
        System.out.println("1. create class");
    }

    public void finalize() {
        System.out.println("2. garbage_collection class");
    }

}
