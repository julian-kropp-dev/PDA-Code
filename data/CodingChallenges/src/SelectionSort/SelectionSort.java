package SelectionSort;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[] selectionSortTestArray = new int[]{23, 14, 53, 69, 42, 78, 44, 38, 39};
        System.out.println(Arrays.toString(selectionSort(selectionSortTestArray)));
    }
    public static int[] selectionSort(int[] array){
        int tmp = 0;
        for (int i = 0; i < array.length - 1; i++) {
            for(int j = i + 1; j < array.length; j++){
                if(array[i] > array[j]) {
                    tmp = array[i];
                    array[i] = array[j];
                    array[j] = tmp;
                }
            }

        }
        return array;
    }
}
