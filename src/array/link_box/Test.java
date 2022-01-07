package array.link_box;

public class Test {

    public static void main(String[] args) {

        LinkBox lb = new LinkBox();

        for (int i = 0; i < 10; i++) {
            lb.add(i);
        }

        int removeElement = lb.remove(0);
        System.out.println("removeElement: " + removeElement);
        int getItem = lb.get(0);
        System.out.println("getItem: " + getItem);
        int len = lb.size();
        System.out.println("length: " + len);
    }
}
