package single;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SinglyLinkedListTest {

    @Test
    void givenASinglyLinkedList_whenInsertingOnlyOneElement_thenSizeIsOne() {
        SinglyLinkedList<Integer> list = new SinglyLinkedList<>();
        list.add(1);
        assertEquals(list.getSize(), 1);
    }

}