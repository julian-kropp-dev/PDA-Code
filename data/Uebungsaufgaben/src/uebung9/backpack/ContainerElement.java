package uebung9.backpack;

public class ContainerElement {
	
	private ContainerElement next;
	private Package value;

//	public ContainerElement() { }		// es werden keine leeren Containerelemente zugelassen

	public ContainerElement(ContainerElement next, Package value) {
		this.next = next;
		this.value = value;
	}
	
	public ContainerElement getNext() {
		return next;
	}

	public void setNext(ContainerElement next) {
		this.next = next;
	}

	public Package getValue() {
		return value;
	}

/*	public void setValue(Package value) {		// nachtraegliches Austauschen des Packetes fuehrt zu Chaos
		this.value = value;
	}
*/
	
}
