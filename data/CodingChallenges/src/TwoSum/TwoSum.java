package TwoSum;
import org.testng.annotations.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TwoSum {
    @Test
    public static void main(String[] args) {
        int[] test1 = new int[] {};
        int[] test2 = new int[] {1};
        int[] test3 = new int[] {1, 2, 3, 4};
        int[] test4 = new int[] {-1, -2, -3, -4};
        int[] test5 = new int[] {4, 7, 1, -3, 2};

        assertFalse(twoSum(test1, 5));
        assertFalse(twoSum(test2, 5));
        assertTrue(twoSum(test3, 5));
        assertFalse(twoSum(test4, 5));
        assertTrue(twoSum(test5, 5));

        System.out.println(twoSum(test1, 5));
        System.out.println(twoSum(test2, 5));
        System.out.println(twoSum(test3, 5));
        System.out.println(twoSum(test4, 5));
        System.out.println(twoSum(test5, 5));
    }
    public static boolean twoSum(int[] array, int target) {
        for (int i = 0; i < array.length; i++) {
            for (int j = i +1; j < array.length; j++) {
                if (array[i] + array[j] == target) return true;
                }
            }
            return false;
        }
    }

//0(n^2)