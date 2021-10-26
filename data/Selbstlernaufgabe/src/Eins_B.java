// Schreiben Sie ein Programm in Java, das die Zahlen von 3 bis 15 (einschließlich) aufsummiert und das Ergebnis ausgibt
public class Eins_B {
    public static void main(String[] args){
        int zahl = 15;
        int ergebnis = 0;
        while (zahl >= 3){
            ergebnis = zahl + ergebnis;
            zahl -= 1;
            System.out.println(ergebnis);
        }

    }
}
