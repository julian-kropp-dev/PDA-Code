package uebung09.lists;

public class LinkedIntListElement {
    private final int value;
    private LinkedIntListElement next;

    //constructor
    public  LinkedIntListElement(int value) {
        this.value = value;
        this.next = null;
    }

    //getter
    public LinkedIntListElement getNext() {
        return next;
    }

    public int getValue() {
        return value;
    }

    //setter
    public void setNext(LinkedIntListElement next) {
        this.next = next;
    }


    //hasNext
    public boolean hasNext() {
        return (next != null);
    }

}
