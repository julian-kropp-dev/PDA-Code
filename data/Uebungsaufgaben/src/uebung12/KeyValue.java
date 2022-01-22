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
    private final int listSize = 7;
    private int versuch = 0;
    private KeyValue[] quadraticProbing = new KeyValue[listSize];

    public void reset() {versuch = 0;}

    public int hashfunction(int data) {
        return ((int) Math.floorMod(data, listSize));
    }

    public int quadraticProbingFunc(int data) {
        double funcS = Math.pow(Math.ceil(versuch / 2.0), 2) * Math.pow((-1), versuch);
        int mod = Math.floorMod((int) (hashfunction(data) - funcS), listSize);
        return mod;
    }

    public boolean add(KeyValue data) {
        int counter = 0;
        for (int i = 0; i < quadraticProbing.length; i++) {
            if(quadraticProbing[i] != null) {
                counter++; //zählt belegte Plätze
            }
        }

        if (counter < quadraticProbing.length) { //nur Objekte hinzufügen, wenn Liste noch Platz hat
            if (quadraticProbing[quadraticProbingFunc(data.getKey())] == null) { //wenn aktueller Platz nicht belegt ist
                quadraticProbing[quadraticProbingFunc(data.getKey())] = data;
            } else {
                versuch++;
                add(data);
            }

        }
        return true;

    }

    public KeyValue get(int key) {
        return quadraticProbing[quadraticProbingFunc(key)];
    }


}

class HashTest {

    KeyValue object1 = new KeyValue(12, "12");
    KeyValue object2 = new KeyValue(5, "5");
    KeyValue object3 = new KeyValue(53, "53");
    KeyValue object4 = new KeyValue(2, "2");
    KeyValue object5 = new KeyValue(15, "15");
    KeyValue object6 = new KeyValue(19, "19");

    HashTableOverflow table1 = new HashTableOverflow();
    HashTableOpen table2 = new HashTableOpen();



    @Test
    void testHashfunktion() {
       assertEquals(6, table1.hashfunction(-1)); //Division-mit-Rest-Methode, Beispiel aus Hinweis 3

    }

    @Test
    void testQuadraticProbing() {
        assertEquals(5, table2.quadraticProbingFunc(12));
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
        KeyValue[] erwartetesArray = new KeyValue[] {object6, object5, object4, null, object3, object1, object2};
        table2.add(object1);
        table2.add(object2);
        table2.add(object3);
        table2.add(object4);
        table2.add(object5);
        table2.add(object6);




        assertEquals(erwartetesArray[0], table2.get(19));
        assertEquals(erwartetesArray[1], table2.get(15));
        assertEquals(erwartetesArray[2], table2.get(2));
        assertEquals(erwartetesArray[3], null);
        assertEquals(erwartetesArray[4], table2.get(53));
        assertEquals(erwartetesArray[5], table2.get(12)); //Falsch
        assertEquals(erwartetesArray[6], table2.get(5)); //Falsch

    }



}

