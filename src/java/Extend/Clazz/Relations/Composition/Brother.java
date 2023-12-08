package src.java.Extend.Clazz.Relations.Composition;

class Brother {
    private Father father;

    public Brother(String fatherName) {
        this.father = new Father(fatherName);
    }

    public Father getFather() {
        return father;
    }
}