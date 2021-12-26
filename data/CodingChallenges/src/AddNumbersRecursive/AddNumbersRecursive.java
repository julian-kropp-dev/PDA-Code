package AddNumbersRecursive;

public class AddNumbersRecursive {
    public static void main(String[] args) {
        System.out.println(add(2,5));
    }
    public static int add(int x, int y) {
        if (x == 0) return y;
        if (y == 0) return x;
        return add(x + 1, y - 1);
    }
}
