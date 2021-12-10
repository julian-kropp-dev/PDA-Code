import java.lang.reflect.Array;
import java.util.Arrays;

public class Median {

	public static void main(String[] args) {
		double[] test1a = new double[] {};
		double[] test1b = new double[] { 1 };
		double[] test1c = new double[] { 1, 3, 5, 6, 8 };
		double[] test1d = new double[] { 1, 3, 5, 6, 8, 9};
		double[][] test2a = new double[][] {};
		double[][] test2b = new double[][] { { 1 } };
		double[][] test2c = new double[][] { { 1, 2, 3 }, { 4, 5 } };
		double[][] test2d = new double[][] { { 1, 2, 3 }, { }, { 4, 5, 6 }, { 7 } };
		
		System.out.println(median(test1a)); // 0.0
		System.out.println(median(test1b)); // 1.0
		System.out.println(median(test1c)); // 5.0
		System.out.println(median(test1d)); // 5.5
		
		System.out.println("--------");
		
		System.out.println(medianOfMedians(test2a)); // 0.0
		System.out.println(medianOfMedians(test2b)); // 1.0
		System.out.println(medianOfMedians(test2c)); // 3.25
		System.out.println(medianOfMedians(test2d)); // 3.5

		System.out.println("--------");
		
		System.out.println(median2Dim(test2a)); // 0.0
		System.out.println(median2Dim(test2b)); // 1.0
		System.out.println(median2Dim(test2c)); // 3.0
		System.out.println(median2Dim(test2d)); // 4.0


	}
	
	public static double median(double[] values) {

		if (values.length == 0) return 0.0; //guckt, ob das Array überhaupt Elemente hat. Nein? Median von 0 ist 0
			// Wenn das Array gerade ist, berechne Median: Median sind die zwei mittigen Elemente addiert und durch zwei geteilt
		if (values.length % 2 == 0) return ((values[(values.length / 2) - 1] + values[values.length / 2]) / 2);
		// Wenn das Array ungerade ist, ist der Median die Mitte
		else return (values[values.length / 2]);
	}
	
	public static double medianOfMedians(double[][] values) {
		double [] stack = new double [values.length]; //neues Array, in dem Zwischenwerte gespeichert werden

		for (int row = 0; row < values.length; row++){

			if (values[row].length == 0) {
				stack[row] = 0.0; //Wenn das Array leer ist, ist der Median 0
			}
			else if (values[row].length == 1) {
				stack[row] = values[row][0]; //Wenn das Zeilen-Array eine Länge von eins hat, wird die eine Zahl in den Stack geworfen
			}
 			else if (values[row].length % 2 != 0){
				stack[row] = values[row][values.length / 2]; //Wenn Zeilen-Array ungerade ist, ist die Zahl in der Mitte der Median
			}
			else {
				stack[row] = values[row][(values.length / 2) - 1] + values[row][values.length / 2] / 2;
			}
		}

		stack = isSorted(stack);
		return median(stack); //Stack ist jetzt ein neues, eind. Array. Median vom Median wird berechnet
	}

	public static double median2Dim(double[][] values) {

		return 0;
	}

	public static double[] isSorted(double[] values){
		double[] numbers = new double[values.length];
		for (int i = 0; i < values.length; i++){
			numbers[i] = values[i];
		}

		for (int index = 0; index < numbers.length - 1; index++ ){
			int minIndex = index;

			for (int j = index + 1; j < numbers.length; j++){
				if (numbers[j] < numbers[minIndex]) minIndex = j;
			}

			double tmp = numbers[minIndex];
			numbers[minIndex] = numbers[index];
			numbers[index] = tmp;
		}
		return numbers;
	}
}
