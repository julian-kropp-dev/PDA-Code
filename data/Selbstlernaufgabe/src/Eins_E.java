//Schreiben Sie ein Programm in Java, das die Fakultät zu einer gegebenen Zahl a berechnet.
public class Eins_E {
    public static void main(String[] args){
        int a = 5;
        int fakultaet = 1;
        int durchlaeufe = 1;
        while (durchlaeufe <= a){
            fakultaet = fakultaet*durchlaeufe;
            durchlaeufe += 1;
            System.out.println(fakultaet);

        }
    }
}
// 5*4*3*2*1 = 20*3*2*1 = 60*2*1= 120*1 = 120
