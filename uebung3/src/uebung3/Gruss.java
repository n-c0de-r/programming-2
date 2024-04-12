package uebung3;

import java.util.Scanner;

public class Gruss {

	public static void main(String[] args) {

		System.out.println("Gib eine Zahl ein: ");
		Scanner sc = new Scanner(System.in);
		String anzahl = sc.next();

		try {
			int anzahlToInt = Integer.parseInt(anzahl);

			System.out.println();
			System.out.println("Du wirst " + anzahl + " mal begrüßt:");
			System.out.println();

			for (int i = 1; i <= anzahlToInt; i++) {
				System.out.println(i + ". Hallo, Welt!");
			}

		} catch (NumberFormatException e) {
			System.out.println(anzahl + " ist nicht eine ganze Zahl. Probiere es noch einmal.");

		} finally {
			sc.close();
		}

	}

}
