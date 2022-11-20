public class Node {
    private int value;
    private Node next;

    public Node(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    public Node setNext(Node n) {
        return next = n;
    }

    public Node getNext() {
        return next;
    }
}
