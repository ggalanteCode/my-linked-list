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

    @Test
    void givenASinglyLinkedList_whenTwoElementsAreInsertedAndTheFirstRemoved_thenSizeIsOne() {
        SinglyLinkedList<Integer> list = new SinglyLinkedList<>();
        list.add(1);
        list.add(2);
        list.removeFirst();
        assertEquals(list.getSize(), 1);
    }

    @Test
    void givenASinglyLinkedList_whenTwoElementsAreInsertedAndGetAtIndexZero_thenTheFirstElementIsReturned() {
        SinglyLinkedList<Integer> list = new SinglyLinkedList<>();
        list.add(1);
        list.add(2);
        assertEquals(list.get(0), 1);
    }

    @Test
    void givenASinglyLinkedList_whenTwoElementsAreInsertedAndGetAtIndexMinusOne_thenIndexOutOfBoundsExceptionIsThrown() {
        SinglyLinkedList<Integer> list = new SinglyLinkedList<>();
        list.add(1);
        list.add(2);
        assertThrows(IndexOutOfBoundsException.class, () -> list.get(-1));
    }

    @Test
    void givenASinglyLinkedList_whenTwoElementsAreInsertedAndGetAtIndexTwo_thenIndexOutOfBoundsExceptionIsThrown() {
        SinglyLinkedList<Integer> list = new SinglyLinkedList<>();
        list.add(1);
        list.add(2);
        assertThrows(IndexOutOfBoundsException.class, () -> list.get(2));
    }

}