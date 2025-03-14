package single;

/**
 * a node that contains an integer and the reference to the next node.
 */
public class Node<T> {

    T data;
    Node<T> next;

    public Node(T data) {
        this.data = data;
    }

}
