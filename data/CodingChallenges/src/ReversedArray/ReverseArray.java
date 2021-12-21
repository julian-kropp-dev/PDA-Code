package ReversedArray;

import java.util.Arrays;

public class ReverseArray {
    public static void main(String[] args) {
        int[] validData = new int[]{1, 2, 3, 4, 5};

        for (int i = 0; i < validData.length / 2; i++) {
            int temp = validData[i];
            validData[i] = validData[validData.length - i - 1];
            validData[validData.length - i - 1] = temp;
        }
        System.out.println(Arrays.toString(validData));

    }
}

