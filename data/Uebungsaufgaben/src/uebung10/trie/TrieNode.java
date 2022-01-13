package uebung10.trie;

public class TrieNode {

    private char letter;			// undefinierter char fuer die root-node ist '\u0000'
    private int value;				// undefinierter int ist -1
    private TrieNode[] children;
    
    // Constructor
    //	es wird nicht auf valide Parameter gepfueft,
    //	weil die Objekterzeugung hier nicht mehr verhindert werden kann.
    //	Das wuerde eine Fabrikmethode und privaten Constructor erfordern.
    //	Darauf haben wir hier verzichtet.
    
    public TrieNode() {
    	// this.letter bleibt undefined
    	this.value = -1;
    	this.children = new TrieNode[3];
    }
    
    public TrieNode( char inLetter ) {
    	this.letter = inLetter;
    	this.value = -1;
    	this.children = new TrieNode[3];
    }
 
    
    //
    //	Accessoren
    //
	
    public int getLetter() {
		return letter;
	}
	
    public int getValue() {
		return value;
	}

    public void setValue(int inValue) {
    	this.value = inValue;
	}

    /**
     * Adds a new child node with the given key and value to this node.
     * @param letter The character of this node
     * @param value The value associated with this node, or -1 if no value is associated
     * @return The new child if it could be added or if a node with the given key is already
     *         there, null if there are already three children
     */
    public TrieNode addChild(char letter, int value) {
    	TrieNode tn = find(letter);
    	if ( tn != null )
    		return tn;
    	for( int idx = 0; idx < 3; idx++ ) {
    		if ( children[idx] != null )		// Slot belegt?
    			continue;
        	tn = new TrieNode(letter);			// erzeugt neues Child und fuegt es an der freien Stelle ein
        	tn.setValue(value);
        	children[idx] = tn;
    		return tn;
    	}
    	return null;						// kein freier Slot mehr vorhanden
	}

    /**
     * Searches this node's direct children for a node with the given key.
     * @param letter The character to look for
     * @return Returns the TrieNode with the given key if it was found, or null otherwise
     */
    public TrieNode find(char letter) {
    	for( TrieNode tn : children ) {
    		if ( tn == null ) {
     			continue;    			
    		} else {
    			if ( tn.getLetter() == letter )
    				return tn;						// letter gefunden
    		}
    	}
		return null;
	}

}