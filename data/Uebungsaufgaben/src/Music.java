import java.util.Scanner;
public class Music {
    private static double round(double value, int decimalPoints) {
        double d = Math.pow(10, decimalPoints);
        return Math.round(value * d) / d;
    }
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        System.out.println("Anzahl Downloads (>=0)");
        int downloads = userInput.nextInt();
        int counter = 1;
        double costs = 0.0;
        while (counter <= 5 && downloads != 0){
            downloads -= 1;
            counter += 1;
        }
        while (counter > 5 && counter <= 35 && downloads != 0){
            downloads -= 1;
            counter +=1;
            costs += 0.2;
        }
        while (counter > 35 && downloads != 0){
            downloads -= 1;
            counter += 1;
            costs += 0.15;
        }
        System.out.println("Kosten = "+ round(costs,2) + " EURO");
    }
}
