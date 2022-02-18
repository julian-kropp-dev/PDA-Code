package uebung12;

/*
 * Schreiben Sie eine Klasse HashTableOpen, die eine Hash-Tabelle mit den o.g. Methoden implementiert.
 *	Dabei soll die Hash-Tabelle die Größe 7 haben und als Hash-Funktion die Divisions-
 *	Rest-Methode (division-remainder method) verwenden, sowie quadratisches Sondieren (quadratic
 *	probing) zur Kollisionsbehandlung.
 */

public class HashTableOpen {
	
	// Attribute
	int size;
	KeyValue[] hashtable;
	
	// Constructor
	public HashTableOpen( int inSize ) {
		size = inSize;
		hashtable = new KeyValue[inSize];
	}
	
	
	// Accessor (nur für Test)
	
	public KeyValue[] getHashtable() {
		return hashtable;
	}

	// Operationen
	
	/*
	 * Fügt das Objekt data der Hash-Tabelle hinzu. Gibt
	 *	true zurück, falls das Einfügen erfolgreich war, sonst false
	 */
	
	public boolean add(KeyValue data) {
		int key = data.getKey();
		int hk = hashVal( key );
		for ( int versuch = 0; versuch < 2*size; versuch++ ) {
			int s = sondiere(versuch, key);
			int newhk = modulo( (hk-s), size );
			KeyValue currval = hashtable[newhk];
			if ( currval == null ) {
				hashtable[newhk] = data;		
				return true;		
			} else {
				if ( key == currval.getKey() ) {		// Objektvergleich nicht ausreichend; keys pruefen
					return false;
				}
			}
		}
		return false;
	}
	
	/*
	 * Holt das KeyValue Objekt mit dem gegebenen Schlüssel key
	 *	aus der Hash-Tabelle und gibt es zurück. Wird kein entsprechendes Objekt gefunden gibt
	 *	die Methode null zurück.
	 */
	
	public KeyValue get(int key) {
		int hk = hashVal( key );
		for ( int versuch = 0; versuch < 2*size; versuch++ ) {
			int s = sondiere(versuch, key);
			int newhk = modulo( (hk-s), size );
			KeyValue currval = hashtable[newhk];
			if ( currval == null ) {
				return null;
			}
			if ( currval.getKey() == key ) {
				return currval;
			}			
		}
		return null;
	}
	
	//
	//	private Hilfsroutinen
	//
	
	// Aufgabe 2 Hinweis 3

	private int modulo( int inZahl, int inModul ) {
		int rest = inZahl % inModul;
		if ( rest >= 0 )
			return rest;
		else
			return rest + inModul;			
	}

	private int hashVal( int inKey ) {
		return modulo( inKey, size );
	}
	
	// quadratisches Sondieren
	
	private int sondiere( int j , int key ) {
		return (int) ( Math.pow( Math.ceil(j/2.0), 2 ) * Math.pow( -1, j ) );
	}
	

}


