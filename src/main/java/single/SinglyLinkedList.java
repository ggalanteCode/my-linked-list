package single;

import java.util.NoSuchElementException;

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

    /**
     * removes the element at the beginning of the list.
     * @return
     */
    public T removeFirst() {
        if (head == null) {
            throw new NoSuchElementException("You can't remove anything because the list is empty.");
        }
        T removedData = head.data;
        head = head.next;
        size--;
        return removedData;
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
