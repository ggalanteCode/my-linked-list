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

    /**
     * add an element at the beginning of the list.
     * @param data
     */
    public void addFirst(T data) {
        Node<T> newNode = new Node<>(data);
        newNode.next = head;
        head = newNode;
        size++;
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

    /**
     * traverse the entire list, node by node.
     */
    public void traverse() {
        Node<T> current = head;
        while (current != null) {
            System.out.print(current.data);
            if (current.next != null) {
                System.out.print(" -> ");
            }
            current = current.next;
        }
        System.out.println();
    }

    private void checkBounds(int index) {

    }

}
