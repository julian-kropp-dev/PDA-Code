package uebung4;

/*
 * Zwei sortierte Arrays sollen gemischt werden, so dass ein ebenfalls sortiertes Gesamt-Array herauskommt.
 * Vervollständigen Sie dazu folgendes Programm:
 *
 * Mögliches Verfahren: Erstellen Sie ein Ergebnis-Array der richtigen Länge. Legen Sie für beide
 * Eingabe-Arrays jeweils einen aktuellen Index an. Durchlaufen Sie die beiden Arrays. Vergleichen
 * Sie die beiden Elemente am jeweils aktuellen Index. Fügen Sie das jeweils kleinere Element in
 * das Ergebnis-Array ein und erhöhen Sie den dazu gehörenden aktuellen Index.
 * Sie dürfen dabei das Ergebnis-Array nicht noch einmal sortieren, die korrekte Reihenfolge muss
 * bereits beim zusammenfügen hergestellt werden.
*/

public class ArrayMerger {

	/*
	 * Merged zwei int-Arrays
	 */
	static int[] mergeArrays( int[] inArray1, int[] inArray2 ) {
		int[] result = new int[inArray1.length + inArray2.length];
		int i = 0;
		int idx1 = 0;
		int idx2 = 0;
		// solange beide Arrays noch Elemente enthalten
		while ( ( idx1 < inArray1.length ) && ( idx2 < inArray2.length) ) {
			if ( inArray1[idx1] <= inArray2[idx2]) 	result[i++] = inArray1[idx1++];
			else 									result[i++] = inArray2[idx2++];
		}
		// wenn nurnoch Array1 Elemente enthaelt
		while ( idx1 < inArray1.length ) result[i++] = inArray1[idx1++];
		// wenn nurnoch Array2 Elemente enthaelt
		while ( idx2 < inArray2.length ) result[i++] = inArray2[idx2++];
		return	result;
	}
	
	public static void main(String[] args) {
		int[] array1 = { 1, 3, 3, 5, 6, 9 };
		int[] array2 = { 2, 3, 5, 7, 8, 9, 10 };
		int[] result = mergeArrays( array1, array2 );
		
		for ( int i = 0; i < result.length; i++ ) {
			System.out.print( result[i] + " " );
		}
		System.out.println();
		// output: 1 2 3 3 3 5 5 6 7 8 9 9 10
	}
}
