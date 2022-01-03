package uebung9.lists;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class SortedLinkedIntListTest {
    SortedLinkedIntList newlist = new SortedLinkedIntList(); //Start-Element

    @Test
    void testCase1() {
        newlist.reset(); // reset vor getNext() und hasNext()
        assertFalse(newlist.hasNext());
    }

    @Test
    void testCase2() {
        newlist.add(3);
        newlist.reset();
        assertTrue(newlist.hasNext());
        assertEquals(3, newlist.getNext());
        assertFalse(newlist.hasNext());
    }

    @Test
    void testCase3() {
        newlist.add(4);
        newlist.reset();
        assertTrue(newlist.hasNext());
        assertEquals(4, newlist.getNext());
        assertFalse(newlist.hasNext());

    }

    @Test
    void testCase4() {
        newlist.add(8);
        newlist.add(90);
        newlist.add(-2);
        newlist.add(10);

        assertArrayEquals(new int[] {-2, 8, 10, 90}, newlist.toArray());
    }
}
