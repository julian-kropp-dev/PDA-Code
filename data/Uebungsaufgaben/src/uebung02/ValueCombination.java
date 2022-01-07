package uebung02;

public class ValueCombination {
    public static void main(String[] args) {
        int i = 5;
        long l = 10L;
        float f = 15.0F;
        double d = 20.5D;
        char c = 'c';

        double sumDouble = i + l + f + d + c; // char c's value is 99.0 so the System.out.println(sumDouble) is 149.5
        System.out.println(sumDouble);

        int sumInt = i + (int) (l + f + d + c);
        System.out.println(sumInt); // System.out.println(sumInt) is 149.

    }
}
