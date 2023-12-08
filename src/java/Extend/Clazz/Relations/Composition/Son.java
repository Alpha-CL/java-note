package src.java.Extend.Clazz.Relations.Composition;

class Son {
    private Father father;

    public Son(String fatherName) {
        this.father = new Father(fatherName);
    }

    public Father getFather() {
        return father;
    }
}