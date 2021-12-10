public class TestEnvironment {
    public static void main(String[] args) {
        int[][][] arr = { { { 1, 2 }, { 3, 4 } },
                { { 5, 6 }, { 7, 8 } } };

        for (int[][] ints : arr) {
            for (int j = 0; j < arr[0].length; j++) {
                for (int k = 0; k < arr[j][0].length; k++) {

                    System.out.print(ints[j][k] + " ");
                }
                System.out.println();
            }
            System.out.println();
        }
    }
}

