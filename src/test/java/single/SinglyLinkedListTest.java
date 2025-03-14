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

    @Test
    void givenASinglyLinkedList_whenValues1And2AreInsertedAndSearchForValue2_thenTheSpecifiedValueIsFound() {
        SinglyLinkedList<Integer> list = new SinglyLinkedList<>();
        list.add(1);
        list.add(2);
        assertTrue(list.search(2));
    }

    @Test
    void givenASinglyLinkedList_whenValues1And2AreInsertedAndSearchForValue3_thenTheSpecifiedValueIsNotFound() {
        SinglyLinkedList<Integer> list = new SinglyLinkedList<>();
        list.add(1);
        list.add(2);
        assertFalse(list.search(3));
    }

    @Test
    void givenASinglyLinkedList_whenTwoElementsAreInsertedAndInsertAtPositionOne_thenSizeIsThree() {
        SinglyLinkedList<Integer> list = new SinglyLinkedList<>();
        list.add(1);
        list.add(2);
        list.add(3, 1);
        assertEquals(list.getSize(), 3);
    }

    @Test
    void givenASinglyLinkedList_whenValues1And2AreInsertedAndInsertAtPositionOne_thenTraverseIs132() {
        SinglyLinkedList<Integer> list = new SinglyLinkedList<>();
        list.add(1);
        list.add(2);
        list.add(3, 1);
        assertEquals("1 -> 3 -> 2", list.traverse());
    }

    @Test
    void givenASinglyLinkedList_whenValues1And2AreInsertedAndInsertAtPositionTwo_thenTraverseIs123() {
        SinglyLinkedList<Integer> list = new SinglyLinkedList<>();
        list.add(1);
        list.add(2);
        list.add(3, 2);
        assertEquals("1 -> 2 -> 3", list.traverse());
    }

    @Test
    void givenASinglyLinkedList_whenValues1And2AreInsertedAndInsertAtPositionThree_thenTraverseIs123() {
        SinglyLinkedList<Integer> list = new SinglyLinkedList<>();
        list.add(1);
        list.add(2);
        list.add(3, 3);
        assertEquals("1 -> 2 -> 3", list.traverse());
    }

    @Test
    void givenASinglyLinkedList_whenValues1And2And3AreInsertedAndInsert4AtPositionTen_thenTraverseIs1234() {
        SinglyLinkedList<Integer> list = new SinglyLinkedList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4, 10);
        assertEquals("1 -> 2 -> 3 -> 4", list.traverse());
    }

}