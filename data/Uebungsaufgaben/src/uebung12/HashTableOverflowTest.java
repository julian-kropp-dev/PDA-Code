package uebung12;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class HashTableOverflowTest {

	@Test
	void test() {
		HashTableOverflow ht1 = new HashTableOverflow(7);
		KeyValue keyval12 = new KeyValue( 12, "12 in Slot 5" );
		KeyValue keyval53 = new KeyValue( 53, "53 in Slot 4" );
		KeyValue keyval5  = new KeyValue(  5, "5 in Slot 5" );
		KeyValue keyval15 = new KeyValue( 15, "15 in Slot 1" );
		KeyValue keyval2  = new KeyValue(  2, "2 in Slot 2" );
		KeyValue keyval19 = new KeyValue( 19, "19 in Slot 5" );
		KeyValue keyval43 = new KeyValue( 43, "43 in Slot 1" );
		//
		assertTrue( ht1.add( keyval12 ), "12 eingefuegt" );
		assertFalse( ht1.add( keyval12 ), "12 nicht erneut eingefuegt" );
		assertTrue( ht1.add( keyval53 ), "53 eingefuegt" );
		assertTrue( ht1.add( keyval5 ), "5 eingefuegt" );
		assertTrue( ht1.add( keyval15 ), "15 eingefuegt" );
		assertTrue( ht1.add( keyval2 ), "2 eingefuegt" );
		assertTrue( ht1.add( keyval19 ), "19 eingefuegt" );
		assertTrue( ht1.add( keyval43 ), "43 eingefuegt" );
		//
		assertEquals( null, ht1.get(17), "17 nicht vorhanden");
		assertEquals( keyval43, ht1.get(43), "43 vorhanden");
		assertEquals( keyval19, ht1.get(19), "19 vorhanden");
		assertEquals( keyval2, ht1.get(2), "2 vorhanden");
		assertEquals( keyval15, ht1.get(15), "15 vorhanden");
		assertEquals( keyval5, ht1.get(5), "5 vorhanden");
		assertEquals( keyval53, ht1.get(53), "53 vorhanden");
		assertEquals( keyval12, ht1.get(12), "12 vorhanden");
	}

}
