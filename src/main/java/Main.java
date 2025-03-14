import single.SinglyLinkedList;

public class Main {

    public static void main(String[] args) {

        SinglyLinkedList<Integer> list = new SinglyLinkedList<>();

        list.add(1);
        list.add(2);
        list.add(3);
        list.traverse();

        list.addFirst(4);
        list.traverse();

    }

}
