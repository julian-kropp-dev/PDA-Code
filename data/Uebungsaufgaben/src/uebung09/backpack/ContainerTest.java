package uebung09.backpack;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;


class ContainerTest {

	@Test
	void test_basic() {		// Aufgabe 3a
		Container con10 = new Container(10);
		assertEquals( 10, con10.getMaxWeight(), "Kapazitaet 10" );
		//
		Package packet2 = new Package(2);
		assertTrue( con10.add(packet2), "Packet 2 eingefuegt" );
		assertEquals( 1, con10.size(), "prueft auf 1 Packet" );
		assertEquals( 2, con10.getWeight(), "prueft das Gesamtgewicht auf 2");
		//
		Package packet3 = new Package(3);
		assertTrue( con10.add(packet3), "Packet 3 eingefuegt" );
		assertEquals( 2, con10.size(), "prueft auf 2 Packete" );
		assertEquals( 5, con10.getWeight(), "prueft das Gesamtgewicht auf 5");
		//
		Package packet6 = new Package(6);
		assertFalse( con10.add(packet6), "Packet 6 nicht eingefuegt" );
		assertEquals( 2, con10.size(), "prueft auf 2 Packete unveraendert" );
		assertEquals( 5, con10.getWeight(), "prueft das Gesamtgewicht auf 5 unveraendert" );
		//
		con10.clear();
		assertEquals( 0, con10.size(), "prueft auf 0 Packete" );
		assertEquals( 0, con10.getWeight(), "prueft das Gesamtgewicht auf 0" );	
	}

	@Test
	void test_opt() {	// Aufgabe 3c
		Container con10 = new Container(10);
		assertEquals( 10, con10.getMaxWeight(), "Kapazitaet 10" );
		//
		Package packet2 = new Package(2);
		Package packet3 = new Package(3);
		Package packet5 = new Package(5);
		Package packet6 = new Package(6);
		//
		con10.addOpt( new Package[] {packet6, packet5, packet3, packet2} );
		assertEquals( 2, con10.size(), "prueft auf 2 Packete" );
		assertEquals( 6+3, con10.getWeight(), "prueft das Gesamtgewicht auf 9" );
	}
	
	/*
	 * 	Leider erfordert die Erfuellung der Aufgaben 3 a und c bisher garkeine Liste der im Container enthaltenen Packete.
	 * 
	 * Daher ergaenzen wir die Anforderungen um die Bedingung, dass kein Packet mehrfach hinzugefuegt werden darf.
	 */

	@Test
	void test_double() {	// Aufgabe 3+
		Container con10 = new Container(10);
		assertEquals( 10, con10.getMaxWeight(), "Kapazitaet 10" );
		//
		Package packet2 = new Package(2);
		assertTrue( con10.add(packet2), "Packet 2 eingefuegt" );
		assertEquals( 1, con10.size(), "prueft auf 1 Packet" );
		assertEquals( 2, con10.getWeight(), "prueft das Gesamtgewicht auf 2");
		//
		assertFalse( con10.add(packet2), "Packet 2 nicht noch einmal eingefuegt" );
		assertEquals( 1, con10.size(), "prueft auf 1 Packet unveraendert" );
		assertEquals( 2, con10.getWeight(), "prueft das Gesamtgewicht auf 2 unveraendert");
	}

}
