// Pflichtaufgabe 1
// Modul: Programmierung 2
// Tutor: Ole Lordieck
// Dozentin: Prof. Dr. Adrianna Alexander
// Student: Tomas Proano 
// Matrikelnr.: s0589661

public class SiebDesEratosthenes {

	// Hilfsmethode, um Primzahlen zu checken
	public static boolean isPrime(int n) {

		// Wenn die Zahl < 2 ist, hat sie keine Teiler und ist keine Primzahl.
		if (n < 2) {
			return false;
		}

		// Durchlaufe alle möglichen Teiler bis zur Wurzel.
		for (int i = 2; i <= Math.sqrt(n); i++) {

			// Wenn es einen Teiler gibt, ist die Zahl keine Primzahl.
			if (n % i == 0) {
				return false;
			}
		}

		return true;
	}

	// Methode, die alle Vielfache aus einem Array von Integers
	// weg streicht, ausser x selber

	public static int[] deleteMultiple(int x, int[] array) {

		// Exception fuer ungueltige Eingaben
		if (array == null || array.length == 0 || x <= 0) {
			throw new IllegalArgumentException("Invalid inputs");
		}
		// Anzahl der Elemente im neuen Array
		int count = 0;

		for (int i : array) {
			// Wenn i kein Vielfaches von x ist oder = x ist
			if (i % x != 0 || i == x) {
				// Erhöhe den Wert von count
				count++;
			}
		}
		// Erstelle ein neues Array result mit der Länge count
		int[] result = new int[count];
		// Index für das neue Array result
		int index = 0;

		// Iteriere erneut durch jedes i im Array
		for (int i : array) {
			// Wenn i kein Vielfaches von x ist oder = x ist
			if (i % x != 0 || i == x) {
				// i wird ins Array result eingefügt
				// und Index von result wird um 1 erhöht
				result[index++] = i;
			}
		}

		return result;
	}

	// Diese Methode findet alle Primzahlen bis zu einer maximalen Zahl,
	// basiert auf den Sieb des Eratosthenes.
	// Schritte:
	// 1. Erstelle ein Array mit allen Zahlen von 2 bis zur maximalen Zahl.
	// 2. Entferne nacheinander alle Vielfachen von allen Primzahlen kleiner
	// als die Wurzel der maximalen Zahl im Array.
	// 3. Das Ergebnis ist ein Array, das nur Primzahlen enthaelt.

	// Exception: Wenn die maximale Zahl kleiner als 2 ist,
	// wird eine IllegalArgumentException ausgelöst.

	public static int[] eratoSieve(int max) {
		// Werfe Ausnahme, wenn die maximale Zahl kleiner als 2 ist
		if (max < 2) {
			throw new IllegalArgumentException("Invalid parameter");
		}

		// Erstelle ein neues Array mit Länge max-1,
		// das alle Zahlen von 2 bis zur maximalen Zahl enthält.
		int[] result = new int[max - 1];

		for (int i = 2; i <= max; i++) {
			result[i - 2] = i;
		}
		// Iteriere durch alle Zahlen von 2 bis zur Wurzel der maximalen Zahl,
		// um alle Vielfachen von Primzahlen zu finden und zu entfernen
		for (int i = 2; i <= Math.sqrt(max); i++) {
			// Wenn ein Primzahl gefunden wird,
			// entferne ihre Vielfachen im Array
			if (isPrime(i)) {
				result = deleteMultiple(i, result);
			}
		}

		return result;
	}

}
