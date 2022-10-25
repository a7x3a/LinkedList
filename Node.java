public class Node<T> {
    private T value;
    private Node next;

    public Node(T value) {
        this(value, null);
    }

    public Node(T value, Node next) {
        this.value = value;
        this.next = next;
    }

    void setValue(T value) {
        this.value = value;
    }

    void setNext(Node next) {
        this.next = next;
    }

    T getValue() {
        return this.value;
    }

    Node getNext() {
        return this.next;
    }

}
