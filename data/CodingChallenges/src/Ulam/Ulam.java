package Ulam;

public class Ulam {
    public boolean ulamWert(int n) {
        if (n == 1) {
            System.out.println(n);
            return true;
        }
        if (n % 2 == 0) {
            System.out.print(n+ ", ");
            ulamWert(n / 2);
        }
        if (n % 2 != 0) {
            System.out.print(n+ ", ");
            ulamWert((n + n + n) + 1);
        }
        return false;
    }
}
