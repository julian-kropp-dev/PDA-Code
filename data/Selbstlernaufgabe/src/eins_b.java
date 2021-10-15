public class eins_b {
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
