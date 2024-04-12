package uebung11;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Register {

	// Das Einwohnermeldeamt von Oberschöneweide verwaltet seine Einwohner in einer sortierten Liste.
	// Ein Einwohner hat einen Vornamen, Nachnamen, Adresse und das Einzugsdatum.
	// Es sollte möglich sein, nach einem Einwohner in der Liste zu suchen, einen Einwohner sortiert in die
	// Liste einzufügen, aus der Liste zu löschen und die aktuelle Anzahl der
	// registrierten Einwohner zu berechnen.
	// Implementieren Sie eine entsprechende Anwendung. Verwenden Sie dazu passende Klasse(n) und
	// Schnittstelle(n) aus der Java Collection-API.

	private List<Einwohner> einwohnerListe;

	public Register() {
		ArrayList<String> einwohnerListe = new ArrayList<>();
	}

	public void einwohnerSuchen(String vorname, String nachname) {

		for (Einwohner einwohner : einwohnerListe) {

			if (einwohner.getVorname().equals(vorname) && (einwohner.getNachname().equals(nachname))) {

				System.out.println("Einwohner:in wurde gefunden");

			} else {

				System.out.println("Einwohner:in wurde nicht gefunden");
			}
		}
	}

	public void einwohnerEinfuegen(Einwohner einwohner) {

		einwohnerListe.add(einwohner);

		// Einwohner:innen sollen sortiert eingefuegt werden
		Collections.sort(einwohnerListe);

		System.out.println("Einwohner:in " + einwohner + "wurde eingefügt");

	}

	public void einwohnerLoeschen(Einwohner einwohner) {

		einwohnerListe.remove(einwohner);
		System.out.println("Einwohner:in " + einwohner + "wurde gelöscht");
	}

	public void einwohnerAnzahl() {

		einwohnerListe.size();
		System.out.println("Einwohner:innenanzahl: " + einwohnerListe.size());
	}

	public List<Einwohner> getEinwohnerListe() {

		return einwohnerListe;
	}

	public void setEinwohnerListe(List<Einwohner> einwohnerListe) {

		this.einwohnerListe = einwohnerListe;
	}

}
