package src.java.Advance.List.ArrayList;

import java.util.Vector;

public class TestVector {

    public static void main(String[] args) {


        Vector<String> vector = new Vector<String>(100);

        vector.add("a");
        vector.add("b");
        vector.add("c");

        System.out.println(vector);
    }
}