package uebung10.trie;

public class TrieNode {

    private char letter;
    private int value;
    private TrieNode[] children;
	
    public int getValue() {
		//TODO implement this
        return 0;
	}

    public void setValue(int value) {
		//TODO implement this
	}

    /**
     * Adds a new child node with the given key and value to this node.
     * @param letter The character of this node
     * @param value The value associated with this node, or -1 if no value is associated
     * @return The new child if it could be added or if a node with the given key is already
     *         there, null if there are already three children
     */
    public TrieNode addChild(char letter, int value) {
		//TODO implement this
        return null;
	}

    /**
     * Searches this node's direct children for a node with the given key.
     * @param letter The character to look for
     * @return Returns the TrieNode with the given key if it was found, or null otherwise
     */
    public TrieNode find(char letter) {
		//TODO implement this
        return null;
	}

}