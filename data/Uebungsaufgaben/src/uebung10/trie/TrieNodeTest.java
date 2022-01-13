package uebung10.trie;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TrieNodeTest {

	@Test
	void test_basic() {
		TrieNode tn0 = new TrieNode();
		assertEquals( '\u0000', tn0.getLetter() );		// undefinierter char
		assertEquals( -1, tn0.getValue() );				// undefinierter int
		assertEquals( null, tn0.find('x') );			// keine Kinder
		//
		TrieNode tn1 = new TrieNode( 'g' );
		assertEquals( 'g', tn1.getLetter() );
		assertEquals( -1, tn1.getValue() );				// undefinierter int
		tn1.setValue( 5 );
		assertEquals( 5, tn1.getValue() );		
	}
	
	@Test
	void test_add() {
		TrieNode tn0 = new TrieNode();
		//
		TrieNode tn0ch0 = tn0.addChild('b', -1);
		assertEquals( 'b', tn0ch0.getLetter() );
		assertEquals( -1, tn0ch0.getValue() );				// undefinierter int
		assertEquals( tn0ch0, tn0.addChild('b', 5) );		// muss das bestehende Kind zurueckliefern
		assertEquals( -1, tn0ch0.getValue() );				// noch immer undefinierter int
		//
		TrieNode tn0ch1 = tn0.addChild('c', 3);
		assertEquals( 'c', tn0ch1.getLetter() );
		assertEquals( 3, tn0ch1.getValue() );
		assertEquals( tn0ch1, tn0.addChild('c', 5) );		// muss das bestehende Kind zurueckliefern
		assertEquals( 3, tn0ch1.getValue() );				// zahl unveraendert
		//
		TrieNode tn0ch2 = tn0.addChild('d', 7);
		assertEquals( 'd', tn0ch2.getLetter() );
		assertEquals( 7, tn0ch2.getValue() );
		//
		assertEquals( null, tn0.addChild('e', 5) );			// kein Platz fuer viertes Kind
	}
	
	@Test
	void test_find() {
		TrieNode tn0 = new TrieNode();
		TrieNode tn0ch0 = tn0.addChild('b', -1);
		TrieNode tn0ch1 = tn0.addChild('c', 3);
		TrieNode tn0ch2 = tn0.addChild('d', 7);
		//
		assertEquals( tn0ch0, tn0.find('b') );
		assertEquals( tn0ch2, tn0.find('d') );
		assertEquals( tn0ch1, tn0.find('c') );
		assertEquals( null, tn0.find('x') );
	}

}
