package TwoSum;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TwoSumNullTest {

    @Test
    void twoSumEqualsNullTest() {
        int[] test0 = new int[] {};
        int[] test1 = new int[] {1, -1};
        int[] test2 = new int[] {1, 2, 3, 4};
        int[] test3 = new int[] {1, 3, 4, -3};
        int[] test4 = new int[] {1, 6, -0, 7, -1, 2};

        assertTrue(TwoSumNull.twoSumEqualsNull(test1));
        assertTrue(TwoSumNull.twoSumEqualsNull(test3));
        assertTrue(TwoSumNull.twoSumEqualsNull(test4));
        assertFalse(TwoSumNull.twoSumEqualsNull(test0));
        assertFalse(TwoSumNull.twoSumEqualsNull(test2));

    }
}