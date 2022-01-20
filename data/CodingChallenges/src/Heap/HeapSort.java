package Heap;

import java.util.Arrays;

public class HeapSort {
    public static void main(String[] args) {
        int[] testArray = new int[]{7, 3, 8, 1, 2, 6, 4};
        System.out.println(Arrays.toString(sort(testArray))); //expected output: 1,2,3,4,6,7,8
    }
    public static int[] sort(int[] array){
        for (int i = array.length / 2; i >= 0; i--){
            //siftDown(array, i, array.length);
        }
        for (int i = array.length - 1; i >= 1; i--) {
            //swap(array, 0, i);
            //siftDown(array, 0, i-1);
        }
        return array;
    }


}
