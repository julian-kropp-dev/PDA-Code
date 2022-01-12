package uebung09.lists;

public class SortedLinkedIntListTut {
    LinkedIntListElement start;
    LinkedIntListElement current;

    public void add(int value){
        if(start == null){ //Wenn es noch kein Element in der Liste gibt
            start = new LinkedIntListElement(value);
            reset(); //current = start
            return;
        }else if(start.getValue()>value){ //Wenn der neue Wert kleiner ist als das Start Element
            LinkedIntListElement tmp = new LinkedIntListElement(value);
            tmp.setNext(start); //Dann neues Element davor einfügen und Verweis erstellen
            start = tmp; //Das Element dann als start definieren
        }else{ //Wenn das Element größer ist, als Start
            reset();
            while(hasNext()){ //solange durch die Liste iterieren,
                if(current.getNext().getValue()>value){ //bis das nächste Element größer ist, als das aktuelle
                    LinkedIntListElement tmp = new LinkedIntListElement(value);
                    tmp.setNext(current.getNext()); //aktuelles Element dann davor einfügen
                    current.setNext(tmp);
                    return;
                }
                getNext();
            }
            current.setNext(new LinkedIntListElement(value));
        }
    }

    public void reset(){
        current = start;
    }

    public boolean hasNext() {
        return current.hasNext();
    }

    public int getNext() {
        int result = current.getValue();
        current = current.getNext();
        return result;
    }

    public int size(){
        reset();
        if(current == null){
            return 0;
        }
        int counter = 1;
        while(hasNext()){
            getNext();
            counter++;
        }
        return counter;
    }

    public int[] toArray(){
        int[] result = new int[size()];
        reset();
        for(int i = 0; i<result.length; i++){
            result[i] = getNext();
        }
        return result;
    }
}
