package Fib;

public class Fib {
    public static void main(String[] args) {
        System.out.println(fib(0));
        System.out.println(fib(1));
        System.out.println(fib(7));
    }
    public static int fib(int n) {
        int[] array = new int[n + 2];
        if (n == 1 || n == 0) return 1;

        array[0] = 1;
        array[1] = 1;
        for (int i = 2; i < n + 1; i++) {
            array[i] = array[i -1] + array[i - 2];
        }
        return array[n - 1];
    }
}
