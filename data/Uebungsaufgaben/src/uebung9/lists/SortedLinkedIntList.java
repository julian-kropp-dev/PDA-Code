package uebung9.lists;

import java.awt.*;
import java.util.ArrayList;
import java.util.Arrays;

public class SortedLinkedIntList {
    LinkedIntListElement start;

    public static void main(String[] args) {
        SortedLinkedIntList newlist = new SortedLinkedIntList(1); //Start-Element
        newlist.add(1); //Add
        newlist.add(2);
        newlist.add(4);
        newlist.add(4);
        newlist.add(10);
        System.out.println(Arrays.toString(newlist.toArray(newlist)));

    }

    public SortedLinkedIntList (int value) {
        start = new LinkedIntListElement(value);
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

    private LinkedIntListElement iterCurrent;

    public int getNext() {
        int result = iterCurrent.getValue();
        iterCurrent = iterCurrent.getNext();
        return result;
    }

    public void reset() {
        iterCurrent = start;
    }

    public boolean hasNext() {
        return iterCurrent != null;
    }

    public int[] toArray(SortedLinkedIntList newlist) {
        newlist.reset();
        ArrayList<Integer> list = new ArrayList<>();
        while (newlist.hasNext()) {
            list.add(newlist.getNext());
        }
        return list.stream().mapToInt(Integer::intValue).toArray();

    }







}
