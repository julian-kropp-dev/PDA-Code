import java.util.Arrays;
import java.util.Scanner;

public class HashTable {
    public static void main(String[] args) {
        int eingabe = 7; //LÄNGE HASH TABLE

        Scanner userInput2 = new Scanner(System.in);
        System.out.println("Überlaufliste (1), lineares Sondieren (2) oder quadratisches Sondieren (3)? ");
        int eingabe2 = userInput2.nextInt();
        Scanner userInput3 = new Scanner(System.in);
        System.out.println("Einzufügendes Element ");
        int eingabe3 = userInput2.nextInt();
        Scanner userInput4 = new Scanner(System.in);
        System.out.println("Versuch ");
        int eingabe4 = userInput2.nextInt();


        if (eingabe2 == 1) {
            int[] array = new int[] {2,3,5,7,11,13,17,19,23,29}; //HIER DIE WERTE DIE EINZUFÜGEN SIND

            for (int j : array) {
                System.out.print(überlauflisten(j, eingabe) + ", ");
            }
            System.out.println(" ");
            System.out.print(Arrays.toString(array));

        }
        else if (eingabe2 == 2) {
            System.out.println(lSondieren(eingabe3, eingabe, eingabe4));
        }
        else {
            System.out.println(qSondieren(eingabe3, eingabe, eingabe4));
        }

    }
    public static int überlauflisten(int key, int länge) {
        return (Math.floorMod(key, länge));
    }

    public static int lSondieren(int key, int länge, int versuch) {
        int hashfunktion = Math.floorMod(key, länge);
        double funcS = versuch;
        int mod = Math.floorMod((int) (hashfunktion - funcS), länge);
        return mod;

    }

    public static int qSondieren(int key, int länge, int versuch) {
        int hashfunktion = Math.floorMod(key, länge);
        double funcS = Math.pow(Math.ceil(versuch / 2.0), 2) * Math.pow((-1), versuch);
        int mod = Math.floorMod((int) (hashfunktion - funcS), länge);
        return mod;

    }

}
