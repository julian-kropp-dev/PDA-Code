package uebung09.lists;

public class SortedLinkedIntList {
    private LinkedIntListElement start;
    private int counter; //Aktuelle Länge der Liste

    private LinkedIntListElement iterNext; //steht auf nächstem Element im Laufe einer Iteration

    //Constructor
    public SortedLinkedIntList () {
        start = null;
        iterNext = null;
        counter = 0;
    }

    public LinkedIntListElement findPrev(int value) {
        LinkedIntListElement current = start;
        if (value < current.getValue()) {
            return null;
        }

        while (current.hasNext()) {
            if (value < current.getNext().getValue()) { //Wenn unser neues Element kleiner ist als der Wert des Nachfolgers,
                return current; //dann returnen wir das aktuell ausgewählte elem
            }
            current = current.getNext(); //nächstes elem wird als aktuelles gesetzt

        }
        return current;
    }


    public void add(int value) {
        LinkedIntListElement elem = new LinkedIntListElement(value);
        counter ++; //Neue Elemente werden für den Array Converter (s. unten) gezählt

        if (start == null) { //Wenn Liste noch leer, also start zeigt auf keine Node
            start = elem; //erstes elem als Start definieren (start --> elem1: value = value, next = null)

        } else { //Liste hat mehr als ein Element
            LinkedIntListElement prev = findPrev(value); //neues Elem prev wird erstellt mit dem Rückgabetyp von findPrev, also entweder null (neues elem < aktuelles elem) oder Objekt current
            if (prev == null) {
                elem.setNext(start);
                start = elem; //neues Start Element festsetzen
            } else {
                elem.setNext(prev.getNext());
                prev.setNext(elem); //Nachfolger des vorherigen Elements auf das aktuelle elem verweisen
            }
        }
    }

    public Integer getNext() {
        int result = iterNext.getValue();
        iterNext = iterNext.getNext();
        return result;
    }

    public void reset() {
        iterNext = start;
    }

    public boolean hasNext() {
        return (iterNext != null);
    }

    public int[] toArray() {
        LinkedIntListElement current = start; //lokale Laufvariable für die Liste
        int[] result = new int[counter];
        for (int i = 0; i < counter; i++) {
            result[i] = current.getValue();
            current = current.getNext();
        }
        return result;

    }

}
