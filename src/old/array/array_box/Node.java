package src.old.array.array_box;

public class Node<E> {

    public Node<E> prev;            // 上一个节点
    public E curItem;               // 当前节点数据
    public Node<E> next;            // 下一个节点

    public Node(Node<E> prev, E item, Node<E> next) {
        this.prev = prev;
        this.curItem = item;
        this.next = next;
    }
}