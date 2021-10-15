//Schreiben Sie ein Programm in Java, das
//a) mit zwei beliebigen Zahlen a und b beginnt, und dann
//b) so lange a zu sich selbst dazu addiert, wie a (ohne Rest) durch b teilbar ist
public class eins_d {
    public static void main(String[] args){
        int a = 20;
        int b = 5;
        int durchlaeufe = 0;
        while(a % b == 0){
            a += a;
            b +=a;
            durchlaeufe += 1;
        }
        System.out.println(durchlaeufe);

    }
}
