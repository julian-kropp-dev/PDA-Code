package ScannerVorlage;

import java.util.Scanner;

public class Scannervorlage {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Hier einen Text für den User");
        int einzufügendesElem = scanner.nextInt();
        scanner.close();

        System.out.println(einzufügendesElem);
    }

}
