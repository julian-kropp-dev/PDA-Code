package uebung12;

public class OverflowListElement {
	
	// Attribute
	KeyValue value;
	OverflowListElement next;
	
	// Constructor
	
	public OverflowListElement( KeyValue inValue ) {
		value = inValue;
		next = null;
	}
	
	// Accessoren
	
	public KeyValue getValue() {
		return value;
	}
	
	public void setNext( OverflowListElement inNext ) {
		next = inNext;
	}
	
	public OverflowListElement getNext() {
		return next;
	}
	
}
