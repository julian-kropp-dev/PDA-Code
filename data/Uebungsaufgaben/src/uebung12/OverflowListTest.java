package uebung12;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class OverflowListTest {

	@Test
	void test() {
		KeyValue keyval1 = new KeyValue( 1, "5" );
		OverflowList list1 = new OverflowList( keyval1 );
		assertEquals( keyval1, list1.get(1), "Suche 1. Element ueber key");
		assertFalse( list1.add(keyval1), "Element nicht nochmal hinzugefuegt" );
		//
		KeyValue keyval2 = new KeyValue( 2, "19" );
		assertTrue( list1.add(keyval2), "2. Element hinzugefuegt" );
		assertEquals( keyval2, list1.get(2), "Suche 2. Element ueber key");
		//
		KeyValue keyval3 = new KeyValue( 3, "12" );
		assertTrue( list1.add(keyval3), "3. Element hinzugefuegt" );
		assertEquals( keyval3, list1.get(3), "Suche 3. Element ueber key");
		assertEquals( keyval1, list1.get(1), "Suche 1. Element ueber key #2");
		assertEquals( keyval2, list1.get(2), "Suche 2. Element ueber key #2");		
	}

}
