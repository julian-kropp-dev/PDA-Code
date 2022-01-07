package uebung06;

import tools.IO;

public class BedeutsameZahlen {							// Aufgabe 4

	/*
	 * Die Zahl Vier ist eine bedeutsame Zahl (vier Himmelsrichtungen, vier Jahreszeiten, …). Und es ist
	 * möglich, ausgehend von der Zahl vier jede andere natürliche Zahl durch geeignete Operationen
	 * zu erzeugen. Folgende Operationen sind dafür geeignet:
	 * - man fügt am Ende die Ziffer 4 hinzu,
	 * - man fügt am Ende die Ziffer 0 hinzu,
	 * - man teilt durch 2 (wenn die Zahl gerade ist).
	 * Schreiben Sie ein Java-Programm, bei dem der Benutzer eine natürliche Zahl eingibt und das
	 * dann die entsprechenden Zwischenzahlen auf dem Weg zu Erzeugung der Zahl gemäß den obigen
	 * Regeln ausgibt. Die Verwendung einer Speicherstruktur wie Array, Liste oder Stack ist nicht
	 * erlaubt. Nutzen Sie Rekursion!
	 * Im Folgenden wird ein Beispiel für eine mögliche Ausgabe des Programms gegeben (in <> die
	 * Eingaben des Benutzers):
	 *   Zahl (> 0): <2524>
	 *   4
	 *   2
	 *   1
	 *   10
	 *   5
	 *   50
	 *   504
	 *   252
	 *   2524
	 * Hinweis: Gehen Sie den umgekehrten Weg, ausgehend von der zu erzeugenden Zahl hin zur Zahl 4.
	 */

	public static void sucheWegVon4Nach(int inNumber) {
		if ( inNumber != 4 ){
			if ( ( ( inNumber % 10 ) == 4 ) || ( ( inNumber % 10 ) == 0 ) )	sucheWegVon4Nach( inNumber/10 );
			else sucheWegVon4Nach( inNumber*2 );
		}
		System.out.println( inNumber );				// Ausgabe erfolgt auf dem Rückweg
	}
	
	public static void main(String[] args) {
		int zahl = IO.readInt("Zahl (> 0): ");
		if ( zahl <= 0)		System.out.println( "Zahl muss groeßer 0 sein!");
		else sucheWegVon4Nach( zahl );						// 2524
	}

}