package RecursionArray;

import java.util.Arrays;

public class RecursionArray {
    public static void main(String[] args) {
        int[] array = new int[] {1,2,3,4};
        System.out.println(rec(array));

    }
    public static int rec(int[] array) {
        if (0 == array.length) return 0;
        if (1 == array.length) return array[0];

        return array[0] + rec(Arrays.copyOfRange(array, 1, array.length));
    }

}
