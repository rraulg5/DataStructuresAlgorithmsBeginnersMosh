import java.util.NoSuchElementException;

public class LinkedList {
    private Node first;
    private Node last;

    public void addFirst(int item) {
        Node node = new Node(item);
        if (isEmpty()) {
            first = last = node;
            return;
        }
        node.setNext(first);
        first = node;
    }

    public void addLast(int item) {
        Node node = new Node(item);
        if (isEmpty()) {
            first = last = node;
            return;
        }
        last.setNext(node);
        last = node;
    }

    public void removeFirst() {

        if (isEmpty()) {
            throw new NoSuchElementException();
        }

        if (first == last) {
            first = last = null;
            return;
        }

        Node node = first;
        first = node.getNext();
        node.setNext(null);
    }

    public void removeLast() {

        if (isEmpty()) {
            throw new NoSuchElementException();
        }

        if (first == last) {
            first = last = null;
            return;
        }

        Node node = first;
        Node prev = node;

        while (node != null) {
            if (node.getNext() == last) {
                prev = node;
            }
            node = node.getNext();
        }

        prev.setNext(null);
        last = prev;
    }

    public boolean contains(int item) {
        return indexOf(item) != -1;
    }

    public int indexOf(int item) {
        int index = 0;
        Node node = first;

        while (node != null) {
            if (node.getValue() == item) {
                return index;
            }
            node = node.getNext();
            index++;
        }

        return -1;
    }

    public void print() {
        Node node = first;

        while (node != null) {
            System.out.print(node.getValue() + " , ");
            node = node.getNext();
        }
    }

    private boolean isEmpty() {
        return first == null;
    }
}
