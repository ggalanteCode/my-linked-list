package single;

public class SinglyLinkedList<T> {

    private Node<T> head;

    private int size = 0;

    /**
     * adds an element at the end of the list.
     * @param data
     */
    public void add(T data) {
        Node<T> newNode = new Node<>(data);
        if (this.head == null) {
            head = newNode;
        } else {
            Node<T> current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }
        size++;
    }


    public void addFirst(T data) {

    }

    public T removeFirst() {
        return null;
    }

    public T get(int index) {
        return null;
    }

    public int getSize() {
        return size;
    }

    private void checkBounds(int index) {

    }

}
