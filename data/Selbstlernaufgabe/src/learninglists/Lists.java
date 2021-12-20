package learninglists;

public class Lists {
    ListElement start;

    public Lists(){
        start = new ListElement("Kopf");
    }

    public void insertLast(String s){
        ListElement newElement = new ListElement(s);
        start.next = newElement;
    }
    private ListElement findIndex(int n) {
        ListElement iterator = start;
        for(int i = 0; i < n; i++){
            iterator = iterator.next;
        }
        return iterator;
    }
}
