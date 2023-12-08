package src.java.Extend.Clazz.Relations.Dependency;

class Son {
    private Father father;

    public Son(Father father) {
        this.father = father;
    }

    public Father getFather() {
        return father;
    }
}