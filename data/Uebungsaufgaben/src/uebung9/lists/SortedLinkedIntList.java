package uebung9.lists;

public class SortedLinkedIntList {
    LinkedIntListElement start;

    public SortedLinkedIntList () {
        start = new LinkedIntListElement(0);
    }

    public int get(int index) {
        if (start == null) return 0;

        //start at the head of the list
        LinkedIntListElement current = start;

        //counter for finding the correct index position
        int pos = 0;

        //repeat until the position in the list is the desired index
        while (pos < index) {

            // list does not have enough elements
            if (current.getNext() == null) {
                return 0;
            }

            //move to the next element in the list
            current = current.getNext();
            pos ++;
        }
        return current.getValue();

    }

    public void add(int value) {
        LinkedIntListElement elem = new LinkedIntListElement(value);
        if (start == null) {
            start = elem;
        }
        else{
            LinkedIntListElement current = start;
            int pos = 0;
            while (pos < value - 1) {
                if (current.getNext() == null) {
                    break;
                }
                current = current.getNext();
                pos ++;
            }
            LinkedIntListElement element = new LinkedIntListElement(value);
            element.setNext(current.getNext());
            current.setNext(element);
        }
    }


}
