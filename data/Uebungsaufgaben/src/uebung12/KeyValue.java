package uebung12;

import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import static org.junit.Assert.assertEquals;

class KeyValue {

    private int key;
    private String value;

    public KeyValue(int key, String value) {
        this.key = key;
        this.value = value;
    }

    public int getKey() {
        return key;
    }

    public void setKey(int key) {
        this.key = key;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

}

class HashTableOverflow {
    private ArrayList<KeyValue> list = new ArrayList<>();

    public HashTableOverflow() {}

    public int hashfunction(int data) {
        int listSize = 7;
        return ((int) Math.floorMod(data, listSize));

    }

    public boolean add(KeyValue data) {
        int func = hashfunction(data.getKey()); //berechnet, an welcher Stelle das Objekt später liegen muss

        if (list.get(func) == null) { //wenn noch kein Elem vorhanden
            list.add(func, data);
            return true;
        } else

        return false;
    }

    public KeyValue get(int key) {
        if (list.get(key) != null) {
            return list.get(key);
        } else {
            return null;
        }
    }


}

class HashTableOpen {

}

class HashTest {

    KeyValue object1 = new KeyValue(0, "Julian");
    KeyValue object2 = new KeyValue(1, "Frauke");
    KeyValue object3 = new KeyValue(2, "Maik");

    HashTableOverflow table1 = new HashTableOverflow();



    @Test
    void testHashfunktion() {
       assertEquals(6, table1.hashfunction(-1)); //Division-mit-Rest-Methode, Beispiel aus Hinweis 3

    }

    @Test
    void testAddOverflow() {

    }

    @Test
    void testGetOverflow() {

    }

    @Test
    void testAddQP() {

    }

    @Test
    void testGetQP() {

    }



}

