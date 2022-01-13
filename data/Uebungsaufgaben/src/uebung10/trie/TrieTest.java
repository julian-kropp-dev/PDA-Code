package uebung10.trie;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TrieTest {

	@Test
	void test_basic() {
		Trie trie = new Trie();
		assertNotEquals( null, trie );
		assertEquals( -1, trie.findValue( "x".toCharArray() ) );
	}

	@Test
	void test_add_find() {
		Trie trie1 = new Trie();
		assertTrue( trie1.addValue( "green".toCharArray(), 1 ) );
		assertTrue( trie1.addValue( "greed".toCharArray(), 2 ) );
		assertTrue( trie1.addValue( "grass".toCharArray(), 5 ) );
		//
		assertEquals( -1, trie1.findValue( "g".toCharArray() ) );
		assertEquals( -1, trie1.findValue( "gr".toCharArray() ) );
		assertEquals( -1, trie1.findValue( "gre".toCharArray() ) );
		assertEquals( -1, trie1.findValue( "gree".toCharArray() ) );
		assertEquals( 1, trie1.findValue( "green".toCharArray() ) );
		assertEquals( 2, trie1.findValue( "greed".toCharArray() ) );
		assertEquals( 5, trie1.findValue( "grass".toCharArray() ) );
		//
		assertEquals( -1, trie1.findValue( "blau".toCharArray() ) );
	}

}
