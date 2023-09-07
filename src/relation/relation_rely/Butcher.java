package src.relation.relation_rely;

public class Butcher {

    {
        System.out.println("屠夫要杀猪了");
    }

    public void killPig(Pig pig) {

        int pigWeight = pig.getWeight();
        String name = pig.getName();
        System.out.println(name + "的体重为" + pigWeight);
        pig.beKilled();
    }
}