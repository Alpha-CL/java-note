package src.java.Extend.Clazz.Relations.Implementation.Interface;

class Son implements TalkAble, SayHi {

    @Override
    public void talk() {
        System.out.println("I am the son.");
    }

    @Override
    public void sayHi() {
        System.out.println("=>(Son.java:12) sayHi");
    }
}
