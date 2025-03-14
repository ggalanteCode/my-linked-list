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

    public void add(T data, int position) {
        if (position <= 0) {
            addFirst(data);
        } else if (position >= size) {
            add(data);
        } else {
            Node<T> newNode = new Node<>(data);
            Node<T> current = head;
            for (int i = 1; i < position; i++) {
                current = current.next;
            }
            newNode.next = current.next;
            current.next = newNode;
            size++;
        }
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

    /**
     * retrieves the element at the specified index.
     * @param index
     * @return
     */
    public T get(int index) {
        checkBounds(index);
        Node<T> current = head;
        for (int i = 0; i < index; i++) {
            current = current.next;
        }
        return current.data;
    }

    public int getSize() {
        return size;
    }

    /**
     * searches the specified element in this list
     * @param searchedData
     * @return true if the list contains the specified element, false otherwise.
     */
    public boolean search(T searchedData) {
        Node<T> current = head;
        while (current != null) {
            if (current.data.equals(searchedData)) {
                return true;    //the element is found
            }
            current = current.next;
        }
        return false;   //the element is not found
    }

    /**
     * traverse the entire list, node by node.
     */
    public String traverse() {
        Node<T> current = head;
        StringBuilder listNodes = new StringBuilder();
        while (current != null) {
            listNodes.append(current.data);
            if (current.next != null) {
                listNodes.append(" -> ");
            }
            current = current.next;
        }
        return listNodes.toString();
    }

    private void checkBounds(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("the specified index is out of bounds.");
        }
    }

}
