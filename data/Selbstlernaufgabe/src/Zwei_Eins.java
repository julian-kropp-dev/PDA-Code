//converter celsius --> fahrenheit & fahrenheit --> celsius
import java.util.Scanner;
public class Zwei_Eins {
    public static void main(String[] args) {
        Scanner user_input = new Scanner(System.in);
        System.out.println("Celsius:");
        float celsius = user_input.nextFloat();
        float fahrenheit = (celsius * 9) / 5 + 32;
        System.out.println("Fahrenheit = " + fahrenheit);
        user_input.close();
    }
}
