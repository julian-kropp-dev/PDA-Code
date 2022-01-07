package uebung01;

/*
Schreiben Sie ein Java-Programm, das zunächst die Zahl 7 einer Variablen zuweist. Anschließend soll das Programm
so lange den Wert 6 zu dieser Variablen hinzufügen, bis das Ergebnis größer wird als 30. Dabei soll sich das Programm merken,
wie oft diese Addition durchgeführt wird.
Diese Anzahl von Additionen soll anschließend ausgegeben werden.
 */
public class Uebung01Aufgabe4 {
    public static void main(String[] args){
        int startnumber = 7;
        int result = 0;
        int counter = 0;
        //while-loop, which adds int 6 while result <= 30
        while (result <= 30){
            startnumber += 6;
            result = startnumber;
            counter += 1;
        }
        System.out.println(counter);
    }
}
