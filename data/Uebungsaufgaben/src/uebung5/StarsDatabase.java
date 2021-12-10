package uebung5;
import java.util.Arrays;

public class StarsDatabase {
	
	public static void main(String[] args) {
		String[] names = new String[] { "Sirius", "Alpha Centauri", "Rigel",
										"Almaaz", "Luhman 16" };
		String[] ids = new String[] { "TYC 5949-2777-1", "TYC 9007-5849-1",
										"TYC 5331-1752-1", "TYC 2907-1275-1",
										"WISE J1049-5319A" };
		double[] distances = new double[] { 8.6, 4.37, 860, 2000, 6.589 };
//		double[] apparentMagnitudes = new double[] { -1.46, -0.27, 0.13,
//													2.92, 14.94 };			
		String[] types = new String[] { "Main sequence", "Main sequence",
										"Blue supergiant", "Yellow supergiant",
										"Brown dwarf" };
		// Aufgabe Teil a)		
		System.out.println(dataBaseSize( names ));						// da die Groeße der Database der Groeße eines in ihr
													//	enthaltenen Arrays entspricht kann man einfach dessen Groeße abfragen
		
		// Aufgabe Teil b)
		String suchId = "TYC 2907-1275-1";			// hier kann die gewünschte SuchID eingetragen werden
		System.out.println(findStarIdxById( suchId, ids));
		
		
		// Aufgabe Teil c)
		int suchIdx = 2;							// hier kann der gewünschte Suchindex eingetragen werden
		System.out.println(findStarsByIdx( suchIdx, names, types));
		
		
		// Aufgabe Teil d)
		double suchDist = 10;						// hier kann die gewünschte Suchdistanz eingetragen werden
		System.out.println(Arrays.toString(findStarsByDist(suchDist, distances)));
		
		
		// Aufgabe Teil e)
		String inSuchId = "TYC 5949-2777-1";
		String inNewType = "Brown dwarf";
		System.out.println(Arrays.toString(replaceType(inSuchId, inNewType, types, ids)));
	}
	
	/*
	 * a) ...
	 * 	Gibt die Groesse der Datenbank, d.h die Anzahl der Eintraege zurueck
	 * 
	 */
	
	static int dataBaseSize( String[] names) {
		return	names.length;
	}
	
	
	/*
	 * b) ...
	 * Sucht Stern anhand seiner ID und gibt dessen Index zurück
	 *  oder -1, falls nicht gefunden.
	 */
	
	static int findStarIdxById( String inSuchId, String[] ids ) {
		for ( int i = 0; i < ids.length; i++ ) {
			if ( ids[i].equals( inSuchId ) )		return i;
		}
		return	-1;
	}
	
	/*
	 * c) ...
	 * Sucht Name und Typ eines Sternes anhand seines Indexes und gibt ihn in der Form „Name (Typ)“ zurück.
	 */
	
	static String findStarsByIdx( int inSuchIdx, String[] inNames, String[] inTypes ) {
		//
		String name = inNames[inSuchIdx];
		String typ = inTypes[inSuchIdx];
		String NameType = "" + name + " ("+ typ +")";
		return NameType;
	}

	/* 
	 * d) ...
	 * Sucht Sterne anhand ihrer Distanz
	 *  und alle mit kleinerer Distanz als inDistance aus.
	 * Gibt die Indizes der gefundenen Sterne zurück.
	 */
	static int[] findStarsByDist( double inSuchDist, double[] inDistances ) {
		int counter = 0;
		for (double inDistance : inDistances) {
			if (inDistance < inSuchDist) counter++;
		}
		//
		int [] result = new int[counter];
		int result_idx = 0;
		for ( int i = 0; i < inDistances.length; i++ ) {
			if ( inDistances[i] <  inSuchDist  ) 		result[result_idx++] = i;
		}
		return	result;
	}
	
	/* 
	 * e) Schreiben Sie eine Methode, die den Typen eines Sternes mit einer gegebenen ID
	 * 		durch einen neuen Typen ersetzt.
	 */
	static String[] replaceType( String inSuchId, String inNewType, String[] types, String[] ids ) {
		for ( int i = 0; i < ids.length; i++ ) {
			if ( inSuchId.equals( ids[i] ) )	types[i] = inNewType;
		}
		return types;
	}
	
}

