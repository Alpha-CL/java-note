package src.java.Extend.Clazz.Relations.Implementation.Interface;

class Mother implements TalkAble, SayHi {

    @Override
    public void talk() {
        System.out.println("I am the Mother.");
    }

    @Override
    public void sayHi() {
        System.out.println("=>(GrandFather.java:12) sayHi");
    }
}