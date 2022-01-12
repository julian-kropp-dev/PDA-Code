package uebung09.lists;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SortedLinkedIntListTestTut {
    SortedLinkedIntListTut list;

    @BeforeEach
    void setup(){
        list = new SortedLinkedIntListTut();
        list.add(3);
        list.add(5);
        list.add(7);
        list.add(9);
    }

    @Test
    void add() {
        list.add(4);
        list.reset();
        assertEquals(3, list.getNext());
        assertEquals(4, list.getNext());
        assertEquals(5, list.getNext());
        list.add(2);
        list.reset();
        assertEquals(2, list.getNext());
        list.add(10);
        list.reset();
        while(list.hasNext()){
            list.getNext();
        }
        assertEquals(10, list.getNext());
        list = new SortedLinkedIntListTut();
        list.add(5);
        assertEquals(5, list.getNext());
    }

    @Test
    void hasNext(){
        list.reset();
        list.getNext();
        list.getNext();
        list.getNext();
        assertFalse(list.hasNext());
        list.reset();
        assertTrue(list.hasNext());
    }

    @Test
    void getNext(){
        list.reset();
        assertEquals(3, list.getNext());
        assertEquals(5, list.getNext());
        assertEquals(7, list.getNext());
        assertEquals(9, list.getNext());
    }

    @Test
    void reset() {
        list.reset();
        assertEquals(3, list.getNext());
        list.reset();
        assertEquals(3, list.getNext());
    }

    @Test
    void size() {
        assertEquals(4, list.size());
        for(int i = 0;i<30;i++){
            list.add((int) (Math.random()*100.0));
            assertEquals(5+i, list.size());
        }
    }

    @Test
    void toArray() {
        assertArrayEquals(new int[]{3, 5, 7, 9},list.toArray());
        list = new SortedLinkedIntListTut();
        assertEquals(0, list.toArray().length);
    }}