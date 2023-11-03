package src.java.Advance.Clazz.Relations.Implementation.Interface;

class Father implements TalkAble, SayHi {

    @Override
    public void talk() {
        System.out.println("I am the father.");
    }

    @Override
    public void sayHi() {
        System.out.println("=>(Father.java:12) sayHi: ");
    }
}