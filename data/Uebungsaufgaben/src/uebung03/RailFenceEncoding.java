package uebung03;// Aufgabe 5

public class RailFenceEncoding {

	/*
	 * encodiert ein char[] nach der Gartenzaun-Transposition
	 */
	static char[] encodeSequence( char[] inSequence ) {
		char[] encoded = new char[inSequence.length];
		// encoding
		int zielIdx = 0;
		for ( int i = 0; i < inSequence.length; i += 2)		encoded[ zielIdx++ ] = inSequence[i];		// extrahiert gerade Stellen
		for ( int i = 1; i < inSequence.length; i += 2) 	encoded[ zielIdx++ ] = inSequence[i];		// extrahiert ungerade Stellen
		return	encoded;
	}
	
	/*
	 * decodiert ein char[], das nach der Gartenzaun-Transposition
	 *  encodiert wurde.
	 */
	static char[] decodeSequence( char[] inSequence ) {
		char[] decoded = new char[inSequence.length];
		// decoding
		int quellIdx = 0;
		for ( int i = 0; i < inSequence.length; i += 2)		decoded[i] = inSequence[ quellIdx++ ];		// schreibt gerade Stellen
		for ( int i = 1; i < inSequence.length; i += 2) 	decoded[i] = inSequence[ quellIdx++ ];		// schreibt ungerade Stellen
		return	decoded;
	}

	public static void main( String[] args ) {
		String text = "gartenzauntransposition";
		
		char[] sequence = text.toCharArray();
		char[] sequenceEncoded = encodeSequence( sequence );
		
		//encoding...
		
		String code = String.copyValueOf( sequenceEncoded );
		System.out.println(code);			// Ausgabe des verschlüsselten Textes
		
		char[] sequenceDecoded = decodeSequence( sequenceEncoded );
		
		//decoding...
		
		text = String.copyValueOf(sequenceDecoded);
		System.out.println(text);			// Ausgabe des entschlüsselten Textes
	}

}
