package uebung6;

public class StepSumList {			// Aufgabe 3

	/*
	 * (a)
	 * Schreiben Sie eine rekursive Methode stepSum, die ein Array von Integer-Zahlen so lange
	 * durch Addition von benachbarten Elementen reduziert, bis nur noch ein einziges Element
	 * übrig bleibt. Dabei soll das jeweils reduzierte Array schrittweise ausgegeben werden.
	 * Beispiel: Für das Eingabe-Array {2; 4; 1; 3; 7} soll folgende Ausgabe gemacht werden:
	 * 43
	 * 20 23
	 * 11 9 14
	 * 6 5 4 10
	 * 2 4 1 3 7
	 * Zeile 5 ist das Eingabearray. In Zeile 4 werden 2 + 4 = 6, 4 + 1 = 5, 1 + 3 = 4 und 3 + 7 = 10
	 * ausgegeben, usw.
	 */

	public static void stepSum( int[] inValues ) {
		if ( inValues.length == 0 )		return;						// Prüfung auf leeres Array, nur beim ersten Aufruf relevant
		String Zeichenkette = "" + inValues[0];						// Zeichenkette der Werte mit 1. Wert vorbelegen
		if ( inValues.length > 1 ) {								// Addition nur erforderlich wenn noch mehr als ein Wert vorhanden ist
			int[] sum = new int[ inValues.length - 1 ];				// Array fuer die Summen anlegen; um 1 kuerzer als aktuelle Werteliste
			for ( int i = 1; i < inValues.length; i++ ) {			// laeuft ab dem 2. Wert durch die Liste der Werte
				sum[i-1] = inValues[i-1] + inValues[i];				// addiert Wert und seinen Vorgaenger
				Zeichenkette = Zeichenkette + " " + inValues[i];	// fuegt weiteren Wert zur Zeichenkette hinzu
			}
			stepSum( sum );											// ruft sich selbst mit den Summen der aktuellen Werte auf
		}
		System.out.println( Zeichenkette );							// gibt die Zeichenkette auf der Konsole auf dem Rueckweg aus
	}
	
	/*
	 * (b)
	 * Schreiben Sie eine rekursive Methode stepSumRightAlign, welche die gleiche Ausgabe wie
	 * die Methode stepSum macht, allerdings rechtsbündig:
	 *        43
	 *     20 23
	 *   11 9 14
	 *  6 5 4 10
	 * 2 4 1 3 7
	 */
	
	static int maxLength = 0;					// ACHTUNG: muss vor Aufruf der Routine auf 0 gesetzt werden!
	
	public static void stepSumRightAlign( int[] inValues ) {
		if ( inValues.length == 0 )		return;												// Prüfung auf leeres Array, nur beim ersten Aufruf relevant
		String Zeichenkette = "" + inValues[0];												// Zeichenkette der Werte mit 1. Wert vorbelegen ( "" + ueberfluessig ? wegen impliziter Typumwandlung )
		if ( maxLength < Zeichenkette.length() )	maxLength = Zeichenkette.length();		// korrigiert maximale Laenge der erstellten Zeichenketten fuer den Fall dass inValues.length == 1 ist
		if ( inValues.length > 1 ) {														// Addition nur erforderlich wenn noch mehr als ein Wert vorhanden ist
			int[] sum = new int[ inValues.length - 1 ];										// Array fuer die Summen anlegen; um 1 kuerzer als aktuelle Werteliste
			for ( int i = 1; i < inValues.length; i++ ) {									// laeuft ab dem 2. Wert durch die Liste der Werte
				sum[i-1] = inValues[i-1] + inValues[i];										// addiert Wert und seinen Vorgaenger
				Zeichenkette = Zeichenkette + " " + inValues[i];							// fuegt weiteren Wert zur Zeichenkette hinzu
			}
			if ( maxLength < Zeichenkette.length() )	maxLength = Zeichenkette.length();	// korrigiert maximale Laenge der erstellten Zeichenketten
			stepSumRightAlign( sum );														// ruft sich selbst mit den Summen der aktuellen Werte auf
		}
		System.out.println( String.format( "%" + maxLength + "s", Zeichenkette ) );			// gibt die Zeichenkette auf der Konsole auf dem Rueckweg aus
	}


	public static void main(String[] args) {
		// Aufgabe (a)
		stepSum( new int[] {2,4,1,3,7} );
		System.out.println();
		stepSum( new int[] {9,9,9,9} );
		System.out.println();
		//
		// Aufgabe (b)
		maxLength = 0;
		stepSumRightAlign( new int[] {2,4,1,3,7} );
		System.out.println();
		maxLength = 0;
		stepSumRightAlign( new int[] {9,9,9,9} );
		System.out.println();
		//
		maxLength = 0;
		stepSumRightAlign( new int[] {435} );						// ( rechtfertigt erste maxLength Setzung )
		System.out.println();
	}

}
