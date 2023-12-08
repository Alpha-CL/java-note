package src.java.Advance.List.ArrayList;

import java.util.Stack;

public class TestStack {

    public static void main(String[] args) {

        Stack<String> stack = new Stack<String>();

        stack.push("a");
        stack.push("b");
        stack.push("c");
        System.out.println("push a element: " + stack);

        stack.pop();
        System.out.println("pop a element: " + stack);

        String ele = stack.peek();
        System.out.println("first element: " + ele);

        boolean isEmpty = stack.empty();
        System.out.println("isEmpty: " + isEmpty);

        int elementBySeat = stack.search("a");
        System.out.println("elementByIndex: " + elementBySeat);

    }
}
