package src.java.Extend.Clazz.Relations.Aggregation;

class Brother {
    private Father father;

    public Brother(Father father) {
        this.father = father;
    }

    public Father getFather() {
        return father;
    }
}