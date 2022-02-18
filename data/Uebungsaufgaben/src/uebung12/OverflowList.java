package uebung12;

public class OverflowList {		// Aufgabe 2 Hinweis 1
	
	// Attribute
	
	OverflowListElement start;
	
	// Constructor
	
	public OverflowList( KeyValue inKeyVal ) {
		start = new OverflowListElement( inKeyVal );
	}
	
	//
	//	Operationen
	//
	
	// sucht Eintrag mit key in Liste

	public KeyValue get( int inKey ) {
		OverflowListElement currElem = start;
		while ( currElem != null ) {
			KeyValue currVal = currElem.getValue();
			if ( currVal.getKey() == inKey ) {
				return currVal;
			}
			currElem = currElem.getNext();
		}
		return null;
	}
	
	// Liste.add(KeyValue) return boolean, keine doppelten keys einfuegen
	
	public boolean add( KeyValue inKeyVal ) {
		if ( get( inKeyVal.getKey() ) != null )
			return false;
		OverflowListElement bisherigeListe = start;
		start = new OverflowListElement( inKeyVal );
		start.setNext(bisherigeListe);
		return true;
	}

}
