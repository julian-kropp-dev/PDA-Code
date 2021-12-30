package uebung9.lists;

public class SortedLinkedIntList {
    private LinkedIntListElement start;
    private int counter; //Aktuelle Länge der Liste

    private LinkedIntListElement iterNext; //steht auf nächstem Element im Laufe einer Iteration

    public SortedLinkedIntList () {
        start = null;
        iterNext = null;
        counter = 0;
    }

    public LinkedIntListElement findPrev(int value) {
        LinkedIntListElement current = start;
        if (current == null || value < current.getValue()) {
            return null;
        }

        while (current.hasNext()) {
            if (value < current.getNext().getValue()) {
                return current;
            }
            current = current.getNext();

        }
        return current;
    }


    public void add(int value) {
        LinkedIntListElement elem = new LinkedIntListElement(value);
        counter ++; //Neue Elemente werden gezählt

        if (start == null) { //Wenn Liste noch leer
            start = elem;

        } else {
            LinkedIntListElement prev = findPrev(value);
            if (prev == null) {
                elem.setNext(start);
                start = elem;
            } else {
                elem.setNext(prev.getNext());
                prev.setNext(elem);
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
