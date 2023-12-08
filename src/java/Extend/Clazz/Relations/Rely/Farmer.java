package src.java.Extend.Clazz.Relations.Rely;

public class Farmer {

    public Pig feedPig (int month) {
        Pig pig = new Pig("花姑娘");
        pig.growUp(month);
        return pig;
    }
}
