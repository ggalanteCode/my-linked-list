package single;

import org.junit.jupiter.api.Test;

import java.util.NoSuchElementException;

import static org.junit.jupiter.api.Assertions.*;

class SinglyLinkedListTest {

    @Test
    void givenASinglyLinkedList_whenInsertingOnlyOneElement_thenSizeIsOne() {
        SinglyLinkedList<Integer> list = new SinglyLinkedList<>();
        list.add(1);
        assertEquals(list.getSize(), 1);
    }

    @Test
    void givenASinglyLinkedList_whenInsertingTwoElements_thenSizeIsTwo() {
        SinglyLinkedList<Integer> list = new SinglyLinkedList<>();
        list.add(1);
        list.add(2);
        assertEquals(list.getSize(), 2);
    }

    @Test
    void givenASinglyLinkedList_whenListIsEmpty_thenNoSuchElementExceptionIsThrown() {
        SinglyLinkedList<Integer> list = new SinglyLinkedList<>();
        assertThrows(NoSuchElementException.class, () -> list.removeFirst());
    }

}