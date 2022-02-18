package uebung12;

/*
 * Schreiben Sie eine Klasse HashTableOverflow, die eine Hash-Tabelle mit den o.g. Methoden
 *	implementiert. Dabei soll die Hash-Tabelle die Größe 7 haben und als Hash-Funktion
 *	die Divisions-Rest-Methode (division-remainder method) verwenden, sowie Überlauflisten
 *	(overflow lists) zur Kollisionsbehandlung.
 */

public class HashTableOverflow {
	
	//  Attribute
	
	int size;
	OverflowList[] kopf;
	
	// Constructor
	
	public HashTableOverflow ( int inSize ) {
		size = inSize;
		kopf = new OverflowList[size];
	}
	
	// Operationen
	
	/*
	 * Fügt das Objekt data der Hash-Tabelle hinzu. Gibt
	 *	true zurück, falls das Einfügen erfolgreich war, sonst false
	 */
	
	public boolean add(KeyValue data) {
		int hk = hashVal( data.getKey() );
		if( kopf[hk] == null ) {
			kopf[hk] = new OverflowList( data );
			return true;
		} else {
			return kopf[hk].add(data);
		}
	}
	
	/*
	 * Holt das KeyValue Objekt mit dem gegebenen Schlüssel key
	 *	aus der Hash-Tabelle und gibt es zurück. Wird kein entsprechendes Objekt gefunden gibt
	 *	die Methode null zurück.
	 */
	
	public KeyValue get(int key) {
		int hk = hashVal( key );
		if ( kopf[hk] == null )
			return null;
		return kopf[hk].get(key);
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
	

}
