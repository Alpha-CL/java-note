package src.java.Advance.Clazz.Relations.Association;

class Son {
    private Father father;

    public Son(Father father) {
        this.father = father;
    }

    public Father getFather() {
        return father;
    }
}

