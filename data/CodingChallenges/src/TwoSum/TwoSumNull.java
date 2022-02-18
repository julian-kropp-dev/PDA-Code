package TwoSum;

public class TwoSumNull {
    public static boolean twoSumEqualsNull(int[] array) {
        if (array.length == 0) return false;
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] + array[j] == 0) return true;
            }
        }
        return false;

    }
}
