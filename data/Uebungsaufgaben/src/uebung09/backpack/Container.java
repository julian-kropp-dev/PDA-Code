package uebung09.backpack;

public class Container {	// Aufgabe 3
	
	// Attribute
	private int maxWeight;
	
	private int numPackets;
	
	private int sumWeigth;
	

	ContainerElement packageList;			//	Liste von package-objekten

	
	// Constructor

	public Container ( int inMaxWeight ) {
		maxWeight = inMaxWeight;
		numPackets = 0;
		sumWeigth = 0;
		//
		packageList = null;
	}
	
	// Accessoren
	
	public int getMaxWeight() {
		return maxWeight;
	}
	
	public int size() {
		return numPackets;
	}
	
	public int getWeight() {
		return sumWeigth;
	}
	
	// Operationen
	
	private boolean checkdouble(Package value) {
		ContainerElement current = packageList;
		while ( current != null ) {
			if ( value == current.getValue() )
				return true;
			current = current.getNext();
		}
		return false;
	}
	
	
	public boolean add(Package value) {
		/*
		 * 	Leider erfordert die Erfuellung der Aufgaben 3 a und c
		 *   bisher garkeine Liste der im Container enthaltenen Packete.
		 * 
		 * Daher ergaenzen wir die Anforderungen um die Bedingung,
		 *   dass kein Packet mehrfach hinzugefuegt werden darf.
		 */
		if ( checkdouble(value) )		// Packet bereits vorhanden?
			return false;
		//
		// normale Anforderungen
		if ( sumWeigth + value.getWeight() > maxWeight )
			return false;
		numPackets++;
		sumWeigth += value.getWeight();
		// Liste ergaenzen, vorne dran haengen
		packageList = new ContainerElement( packageList, value);
		return true;
	}
	
	public void clear() {
		numPackets = 0;
		sumWeigth = 0;		
	}
	
	/* Aufgabe 3b
	 * 
	 * Es gibt 2^n moegliche Kombinationen bei n Paketen
	 * (fuer jedes Paket: drin oder nicht drin)
	 *  Die Komplexitaet ist also O(2^n)
	 */
	
	// Aufgabe 3c
	
	public void addOpt(Package[] values) {
		for ( Package val : values ) {
			add( val );
		}
	}
}
