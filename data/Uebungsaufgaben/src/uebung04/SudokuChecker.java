package uebung04;

/*
	Bei dem Logik-Rätsel Sudoku geht es darum, ein 9x9 Feld mit den Ziffern von 1 bis 9 so zu füllen,
	dass
		- jede Ziffer nur einmal in jeder Zeile vorkommt,
		- jede Ziffer nur einmal in jeder Spalte vorkommt und
		- jede Ziffer nur einmal in jedem 3 x 3 Teilfeld vorkommt (es gibt neun Teilfelder).
	
	Unten ist ein teilweise ausgefülltes Sudoku-Feld dargestellt. Die Zeilen
	und Spalten sind jeweils von 0 bis 8 durchnummeriert. Die Teilfelder
	sind von links oben bis rechts unten zeilenweise ebenfalls von
	0 bis 8 durchnummeriert (dargestellt in grau). Das Teilfeld rechts
	oben hat beispielsweise die Nummer 2, das Teilfeld links unten hat
	die Nummer 6.
	Dieses Feld enthält drei Fehler: die Ziffer 1 kommt jeweils in Zeile 0,
	in Spalte 6 und in Teilfeld 2 doppelt vor.


	Ergänzen Sie dieses Programm so, dass es das Sudoku-Feld auf Korrektheit bezüglich der drei o.g.
	Kriterien überprüft. Für jeden Fehler soll es die Ziffer und die Position ausgeben. Wenn das Feld
	fehlerfrei ist, soll das Programm nichts ausgeben.

	Für das Feld unten erzeugt das Programm folgende Ausgabe:
		Duplicate number ’1’ in row 0.
		Duplicate number ’1’ in column 6.
		Duplicate number ’1’ in square 2.
	Hinweis: Testen Sie Ihre Lösung auch mit anderen Sudoku-Feldern, die andere Fehler oder auch
	gar keine Fehler enthalten. Sie müssen hier nicht prüfen, ob das Feld die korrekte Größe hat und
	ob es nur mit Ziffern von 0 bis 9 gefüllt ist.
 */

public class SudokuChecker {

	/*
	 * Prüft Sudoku int[9]-Array einer Zeile/Spalte/Quadrat auf Fehler
	 *  Bei diesem Verfahren werden ohne weitere Verwaltung Fehler mehrfach ausgegeben
	 *   z.B. wenn eine 1 dreimal vorkommt
	 */
	static boolean checkRowColSquare_PROBLEM( int[] inRowColSquare, String inOrt ) {
		boolean fehlerfrei = true;
		for ( int stelle1 = 0; stelle1 < 9; stelle1++ ) {
			for ( int stelle2 = stelle1+1; stelle2 < 9; stelle2++ ) {
				if ( inRowColSquare[stelle1] == inRowColSquare[stelle2] ) {
					System.out.println( "Duplicate number ’"+inRowColSquare[stelle1]+"’ in " + inOrt );
					fehlerfrei = false;
				}
			}
		}
		return	fehlerfrei;
	}

	/*
	 * Prüft Sudoku int[9]-Array einer Zeile/Spalte/Quadrat auf Fehler
	 */
	static boolean checkRowColSquare( int[] inRowColSquare, String inOrt ) {
		boolean fehlerfrei = true;
		int[] counter = { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };			// zum zaehlen der vorkommenden Ziffern
		for ( int ziffer : inRowColSquare )	counter[ziffer]++;
		for ( int ziffer = 1; ziffer <= 9; ziffer++ ) {
			if ( counter[ziffer] > 1 ) {
				System.out.println( "Duplicate number ’"+ziffer+"’ in " + inOrt );
				fehlerfrei = false;
			}
		}
		return	fehlerfrei;
	}

	/*
	 * extrahiert Spalte aus SudokuArray
	 */
	static int[] getColumn( int[][] inSudokuArray, int inColNum ) {
		int [] ergebnis_column = new int[9];							// 
		for ( int rowNum = 0; rowNum < 9; rowNum++) {
			ergebnis_column[rowNum] = inSudokuArray[rowNum][inColNum];
		};
		return ergebnis_column;
	}
	
	/*
	 * extrahiert Square aus SudokuArray
	 */
	static int[] getSquare( int[][] inSudokuArray, int inSquareNum ) {
		int [] ergebnis_square = new int[9];
		int [][] square_start = { 	{0,0}, {0,3}, {0,6},
									{3,0}, {3,3}, {3,6},
									{6,0}, {6,3}, {6,6}
								};
		int [] my_square_start = square_start[inSquareNum];
		int row_start = my_square_start[0];
		int col_start = my_square_start[1];	
		ergebnis_square[0] = inSudokuArray[row_start][col_start];
		ergebnis_square[1] = inSudokuArray[row_start][col_start+1];
		ergebnis_square[2] = inSudokuArray[row_start][col_start+2];
		//
		ergebnis_square[3] = inSudokuArray[row_start+1][col_start];
		ergebnis_square[4] = inSudokuArray[row_start+1][col_start+1];
		ergebnis_square[5] = inSudokuArray[row_start+1][col_start+2];
		//
		ergebnis_square[6] = inSudokuArray[row_start+2][col_start];
		ergebnis_square[7] = inSudokuArray[row_start+2][col_start+1];
		ergebnis_square[8] = inSudokuArray[row_start+2][col_start+2];
		
		return	ergebnis_square;
	}

	/*
	 * Prüft Sudoku int-Array auf Fehler
	 */
	static boolean checkSudoku( int[][] inSudokuArray ) {
		boolean fehlerfrei = true;
		// Zeilen pruefen
		for ( int row = 0; row < 9; row++ ) {
			if ( !checkRowColSquare( inSudokuArray[row], "row "+ row ) )		fehlerfrei = false;
		}
		// Spalten pruefen
		for ( int col = 0; col < 9; col++ ) {
			if ( !checkRowColSquare( getColumn( inSudokuArray, col ), "column "+ col ) )		fehlerfrei = false;
		}
		// Squares pruefen
		for ( int square = 0; square < 9; square++ ) {
			if ( !checkRowColSquare( getSquare( inSudokuArray, square ), "square "+ square ) )		fehlerfrei = false;
		}
		return	fehlerfrei;
	}

	public static void main(String[] args) {

		// leere Felder sind als 0 eingetragen
		int[][] sudoku = new int[][] {
			{ 0, 9, 0,  0, 0, 0,  1, 1, 0 },
			{ 8, 0, 4,  0, 2, 0,  3, 0, 7 },
			{ 0, 6, 0,  9, 0, 7,  0, 2, 0 },
			
			{ 0, 0, 5,  0, 3, 0,  1, 0, 0 },
			{ 0, 7, 0,  5, 0, 1,  0, 3, 0 },
			{ 0, 0, 3,  0, 9, 0,  8, 0, 0 },
			
			{ 0, 2, 0,  8, 0, 5,  0, 6, 0 },
			{ 1, 0, 7,  0, 6, 0,  4, 0, 9 },
			{ 0, 3, 0,  0, 0, 0,  0, 8, 0 }
		};
		if ( !checkSudoku( sudoku ) ) {
			System.out.println("Dieses SUDOKU ist fehlerhaft!");
		}

	}
}
