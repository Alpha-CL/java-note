package src.relation.relation_rely;

public class Farmer {

    public Pig feedPig (int month) {
        Pig pig = new Pig("花姑娘");
        pig.growUp(month);
        return pig;
    }
}
