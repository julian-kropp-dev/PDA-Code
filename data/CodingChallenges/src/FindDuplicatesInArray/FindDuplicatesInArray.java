package FindDuplicatesInArray;

import java.util.LinkedList;
import java.util.List;

public class FindDuplicatesInArray {
    public static void main(String[] args) {
        int[] array = new int[] {4, 3, 2, 7, 8, 2, 3, 1, 5, 6, 6, 6};
        System.out.println(duplicates(array));

    }
    public static List <Integer> duplicates(int[] array) {
        List <Integer> ergebnis = new LinkedList<>();
        if (array.length == 0) {
            ergebnis.add(0);
            return ergebnis;
        }
        if (array.length == 1) {
            ergebnis.add(array[0]);
            return ergebnis;
        }
        else {
            for (int i = 0; i < array.length; i++) {
                for (int j = i + 1; j < array.length; j++) {
                    if (array[i] == array[j]) {
                        ergebnis.add(array[i]);
                    }
                }
            }
            return ergebnis;
        }
    }
}
