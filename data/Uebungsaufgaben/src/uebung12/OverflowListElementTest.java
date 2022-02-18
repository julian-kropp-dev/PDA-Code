package uebung12;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class OverflowListElementTest {

	@Test
	void test() {
		KeyValue keyval1 = new KeyValue( 1, "43" );
		OverflowListElement elem1 = new OverflowListElement( keyval1 );
		assertEquals( keyval1, elem1.getValue(), "Value #1" );
		assertEquals( null, elem1.getNext(), "Next #1 leer" );
		//
		KeyValue keyval2 = new KeyValue( 2, "2" );
		OverflowListElement elem2 = new OverflowListElement( keyval2 );
		assertEquals( keyval2, elem2.getValue(), "Value #2" );
		assertEquals( null, elem2.getNext(), "Next #2 leer" );
		//
		elem1.setNext(elem2);
		assertEquals( elem2, elem1.getNext(), "Next von #1 elem2" );
		assertEquals( null, elem2.getNext(), "Next #2 leer" );		
	}

}
