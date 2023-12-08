package src.java.Advance.Box.LinkBox;

public class Test {

    public static void main(String[] args) {

        LinkBox linkBox = new LinkBox();

        for (int i = 0; i < 10; i++) {
            linkBox.add(i);
        }

        int removedItem = linkBox.remove(0);
        System.out.println("removedItem: " + removedItem);

        int fistItem = linkBox.get(0);
        System.out.println("getItem: " + fistItem);

        int linkBoxLength = linkBox.size();
        System.out.println("length: " + linkBoxLength);
    }
}
