package uebung5;

public class MethodsA {
    public static void main(String[] args) {
        // testing my method "min" with an array numbers
        int[] numbers = new int[] {90, 8, 3, 77, 5};
        System.out.println(min(numbers));
    }
    public static int min(int[] values){
        // using a sorting algorithm (Selection Sort) to sort my array. Algorithm is trivial cause we use a small array
        for (int index = 0; index < values.length - 1; index++){
            int minIndex = index;

            //search for smallest element in numbers[index: n-1]
            for (int j = index + 1; j < values.length; j++){
                if (values[j] < values[minIndex]){
                    minIndex = j;
                }
            }

            // swap numbers[minIndex] and numbers[index]
            int tmp = values[minIndex];
            values[minIndex] = values[index];
            values[index] = tmp;
        }
        // return first element of new array, which is the smallest number
        return values[0];
    }
}