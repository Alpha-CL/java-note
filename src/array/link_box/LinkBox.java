package array.link_box;


public class LinkBox implements Box {

    private Node firstNode; // 第一个节点
    private Node lastNode; // 最后一个节点
    private int size; // 有效长度

    private void lastNode(int element) {

        Node l = lastNode;
        Node newNode = new Node(l, element, null);
        lastNode = newNode;

        if (l == null) {
            firstNode = newNode;
        } else {
            l.next = newNode;
        }
        size++;
    }

    private void rangeCheck(int index) {
        if (index < 0 || index >= size) {
            throw new BoxIndexOutOfBoundsException("Index: " + index + ", Size: " + size);
        }
    }

    private Node node(int index) {
        Node targetNode;
        if (index < (size >> 1)) {
            targetNode = firstNode;
            for (int i = 0; i < index; i++) {
                targetNode = targetNode.next;
            }
        } else {
            targetNode = lastNode;
            for (int i = size - 1; i > index; i--) {
                targetNode = targetNode.prev;
            }
        }
        return targetNode;
    }

    private int unlink(Node targetNode) {

        int oldValue = targetNode.item;
        Node prev = targetNode.prev;
        Node next = targetNode.next;

        if (prev == null) {
            firstNode = next;
        } else {
            prev.next = next;
            targetNode.prev = null;
        }

        if (next == null) {
            lastNode = prev;
        } else {
            next.prev = prev;
            targetNode.next = null;
        }

        size--;
        return oldValue;
    }

    @Override
    public boolean add(int element) {
        this.lastNode(element);
        return true;
    }

    @Override
    public int get(int index) {
        this.rangeCheck(index);
        Node targetNode = this.node(index);
        return targetNode.item;
    }

    @Override
    public int remove(int index) {
        this.rangeCheck(index);
        Node targetNode = this.node(index);
        int oldValue = this.unlink(targetNode);
        return oldValue;
    }

    @Override
    public int size () {
        return size;
    }
}