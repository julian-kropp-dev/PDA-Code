//Schreiben Sie ein Programm in Java, das
//a) mit zwei beliebigen Zahlen a und b beginnt, und dann
//b) so lange a zu sich selbst dazu addiert, wie a (ohne Rest) durch b teilbar ist
public class Eins_D {
    public static void main(String[] args){
        int a = 12;
        int b = 6;
        int durchlaeufe = 0;
        while(a % b == 0){
            a += a;
            durchlaeufe += 1;
            System.out.println(a);
            System.out.println(durchlaeufe);
        }
        System.out.println(durchlaeufe);

    }
}
