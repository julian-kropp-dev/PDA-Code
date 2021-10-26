public class Factorial {
    public static void main(String[] args) {
        int number = 5;
        int result = 1;
        while (number > 0) {
            result = result * number; number = number - 1;}
            System.out.println(result);
    }
}
