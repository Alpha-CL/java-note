package relation_rely;

public class Test {

    public static void main(String[] args) {
        Butcher butcher = new Butcher();
        Farmer farmer = new Farmer();
        Pig pig = farmer.feedPig(4);
        butcher.killPig(pig);
    }
}
