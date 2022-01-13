package uebung10.trie;
public class Trie {
	
	// Attribute

    private TrieNode root;
    
    // Konstruktor
    
    public Trie() {
		root = new TrieNode();
    }

    /**
     * Adds a new value with the given key to the trie, creating new TrieNodes as required.
     * @param key The character sequence associated with the new value
     * @param value The new value
     * @return True if the value could be added to the trie, false otherwise
     */
    public boolean addValue(char[] key, int value) {
    	TrieNode currNode = root;
    	for ( int idx = 0; idx < key.length; idx++ ) {	    		
    		currNode = currNode.addChild( key[idx], -1 );
	    	if ( currNode == null ) {						// nicht genug Platz
				return false;
			}
    	}
    	currNode.setValue(value); 				// setzt korrekten Wert
    	return true;
	}

    /**
     * Returns the value associated with a given key, or -1 if the key could not be found.
     * @param key The given key
     * @return The associated value, or -1 if the key is not represented in this trie
     */
    
    public int findValue(char[] key) {
    	TrieNode currNode = root;
    	for ( int idx = 0; idx < key.length; idx++ ) {	    		
    		currNode = currNode.find(key[idx]);
	    	if ( currNode == null )
	    		return -1;
    	}
    	return currNode.getValue();
	}

}