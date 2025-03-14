package single;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.NoSuchElementException;

import static org.junit.jupiter.api.Assertions.*;

class SinglyLinkedListTest {

    SinglyLinkedList<Integer> list;

    @BeforeEach
    void init() {

        list = new SinglyLinkedList<>();

    }

    @Test
    void givenASinglyLinkedList_whenInsertingOnlyOneElement_thenSizeIsOne() {
        list.add(1);
        assertEquals(1, list.getSize());
    }

    @Test
    void givenASinglyLinkedList_whenInsertingTwoElements_thenSizeIsTwo() {
        list.add(1);
        list.add(2);
        assertEquals(2, list.getSize());
    }

    @Test
    void givenASinglyLinkedList_whenTwoElementsAreInsertedAndGetAtIndexZero_thenTheFirstElementIsReturned() {
        list.add(1);
        list.add(2);
        assertEquals(1, list.get(0));
    }

    @Test
    void givenASinglyLinkedList_whenTwoElementsAreInsertedAndGetAtIndexMinusOne_thenIndexOutOfBoundsExceptionIsThrown() {
        list.add(1);
        list.add(2);
        assertThrows(IndexOutOfBoundsException.class, () -> list.get(-1));
    }

    @Test
    void givenASinglyLinkedList_whenTwoElementsAreInsertedAndGetAtIndexTwo_thenIndexOutOfBoundsExceptionIsThrown() {
        list.add(1);
        list.add(2);
        assertThrows(IndexOutOfBoundsException.class, () -> list.get(2));
    }

    @Test
    void givenASinglyLinkedList_whenValues1And2AreInsertedAndSearchForValue2_thenTheSpecifiedValueIsFound() {
        list.add(1);
        list.add(2);
        assertTrue(list.search(2));
    }

    @Test
    void givenASinglyLinkedList_whenValues1And2AreInsertedAndSearchForValue3_thenTheSpecifiedValueIsNotFound() {
        list.add(1);
        list.add(2);
        assertFalse(list.search(3));
    }

    @Test
    void givenASinglyLinkedList_whenTwoElementsAreInsertedAndInsertAtPositionOne_thenSizeIsThree() {
        list.add(1);
        list.add(2);
        list.add(3, 1);
        assertEquals(3, list.getSize());
    }

    @Test
    void givenASinglyLinkedList_whenValues1And2AreInsertedAndInsertAtPositionOne_thenTraverseIs132() {
        list.add(1);
        list.add(2);
        list.add(3, 1);
        assertEquals("1 -> 3 -> 2", list.traverse());
    }

    @Test
    void givenASinglyLinkedList_whenValues1And2AreInsertedAndInsertAtPositionTwo_thenTraverseIs123() {
        list.add(1);
        list.add(2);
        list.add(3, 2);
        assertEquals("1 -> 2 -> 3", list.traverse());
    }

    @Test
    void givenASinglyLinkedList_whenValues1And2AreInsertedAndInsertAtPositionThree_thenTraverseIs123() {
        list.add(1);
        list.add(2);
        list.add(3, 3);
        assertEquals("1 -> 2 -> 3", list.traverse());
    }

    @Test
    void givenASinglyLinkedList_whenValues1And2And3AreInsertedAndInsert4AtPositionTen_thenTraverseIs1234() {
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4, 10);
        assertEquals("1 -> 2 -> 3 -> 4", list.traverse());
    }

    @Test
    void givenASinglyLinkedList_whenListIsEmpty_thenNoSuchElementExceptionIsThrown() {
        assertThrows(NoSuchElementException.class, () -> list.removeFirst());
    }

    @Test
    void givenASinglyLinkedList_whenTwoElementsAreInsertedAndTheFirstRemoved_thenSizeIsOne() {
        list.add(1);
        list.add(2);
        list.removeFirst();
        assertEquals(1, list.getSize());
    }

    @Test
    void givenASinglyLinkedList_whenValues1And2And3AreInsertedAndTheFirstRemoved_thenTraverseIs23() {
        list.add(1);
        list.add(2);
        list.add(3);
        list.removeFirst();
        assertEquals("2 -> 3", list.traverse());
    }

    @Test
    void givenASinglyLinkedList_whenValue1IsInsertedAndTheFirstRemoved_thenTraverseIsEmptyString() {
        list.add(1);
        list.removeFirst();
        assertEquals("", list.traverse());
    }

}