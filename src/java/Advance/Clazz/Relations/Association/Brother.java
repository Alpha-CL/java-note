package src.java.Advance.Clazz.Relations.Association;

class Brother {
    private Father father;

    public Brother(Father father) {
        this.father = father;
    }

    public Father getFather() {
        return father;
    }
}
