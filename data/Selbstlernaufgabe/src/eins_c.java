public class eins_c {
    public static void main(String[] args){
        int zahl = 255;
        int ergebnis = 0;

        while (zahl >= 9){
            if (zahl % 2 == 0){
                ergebnis = zahl +ergebnis;
                zahl -= 1;
                System.out.println(ergebnis);
            }
            else{
                zahl -=1;
            }
        }
    }
}
