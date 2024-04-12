// Pflichtaufgabe 1
// Modul: Programmierung 2
// Tutor: Ole Lordieck
// Dozentin: Prof. Dr. Adrianna Alexander
// Student: Tomas Proano 
// Matrikelnr.: s0589661

import org.junit.Test;
import static org.junit.Assert.*;

public class SiebDesEratosthenesTest {

	// Unit-Tests fuer deleteMultiple() Methode

	// Test: Normalfall
	@Test
	public void testDeleteMultiple1() {
		int[] input = { 13, 2, 3, 4, 6, 7, 41, 22 };
		int[] expected = { 13, 2, 3, 7, 41 };
		assertArrayEquals(expected, SiebDesEratosthenes.deleteMultiple(2, input));
	}

	// Test: x ist nicht im Array (Grenzfall)
	@Test
	public void testDeleteMultiple2() {
		int[] input = { 13, 3, 7, 41 };
		int[] expected = { 13, 3, 7, 41 };
		assertArrayEquals(expected, SiebDesEratosthenes.deleteMultiple(2, input));
	}

	// Test: Array ist Null-Wert (Fehlerfall)
	@Test(expected = IllegalArgumentException.class)
	public void testDeleteMultiple3() {
		SiebDesEratosthenes.deleteMultiple(2, null);
	}

	// Test: Array ist leer (Fehlerfall)
	@Test(expected = IllegalArgumentException.class)
	public void testDeleteMultiple4() {
		SiebDesEratosthenes.deleteMultiple(2, new int[] {});
	}

	// Test: x ist 0 (Fehlerfall)
	@Test(expected = IllegalArgumentException.class)
	public void testDeleteMultiple5() {
		SiebDesEratosthenes.deleteMultiple(0, new int[] { 1, 2, 3 });
	}

	// Test: x ist negativ (Fehlerfall)
	@Test(expected = IllegalArgumentException.class)
	public void testDeleteMultiple6() {
		SiebDesEratosthenes.deleteMultiple(-3, new int[] { 1, 2, 3 });
	}

	// Unit Tests fuer eratoSieve() Methode

	// Test: Normalfall
	@Test
	public void testEratoSieve1() {
		int[] expected = { 2, 3, 5, 7, 11, 13, 17, 19, 23, 29 };
		assertArrayEquals(expected, SiebDesEratosthenes.eratoSieve(30));
	}

	// Test: Parameter ist 1 (Fehlerfall)
	@Test(expected = IllegalArgumentException.class)
	public void testEratoSieve2() {
		SiebDesEratosthenes.eratoSieve(1);
	}

	// Test: Parameter ist negativ (Fehlerfall)
	@Test(expected = IllegalArgumentException.class)
	public void testEratoSieve3() {
		SiebDesEratosthenes.eratoSieve(-5);
	}

	// Test: Parameter ist 0 (Fehlerfall)
	@Test(expected = IllegalArgumentException.class)
	public void testEratoSieve4() {
		SiebDesEratosthenes.eratoSieve(0);
	}

	// Test: Parameter ist 2 (Grenzfall)
	@Test
	public void testEratoSieve5() {
		int[] expected = { 2 };
		assertArrayEquals(expected, SiebDesEratosthenes.eratoSieve(2));
	}

	// Test: Parameter ist eine grosse Primzahl (Grenzfall)
	@Test
	public void testEratoSieve6() {
		int[] result = SiebDesEratosthenes.eratoSieve(1000);
		assertTrue(SiebDesEratosthenes.isPrime(result[result.length - 1]));
	}

}