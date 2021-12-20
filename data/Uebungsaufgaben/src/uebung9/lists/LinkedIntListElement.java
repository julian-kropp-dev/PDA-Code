package uebung9.lists;

public class LinkedIntListElement {
    private int value;
    private LinkedIntListElement next;

    //constructor
    public  LinkedIntListElement(int value) {
        this.value = value;
        next = null;
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

    public void setValue(int value) {
        this.value = value;
    }

}
