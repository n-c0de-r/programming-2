package uebung11;

import java.time.LocalDate;

public class Einwohner implements Comparable<Einwohner> {

	private String vorname;
	private String nachname;
	private String adresse;
	private LocalDate einzugsdatum; // gregorian calendar

	// setter
	public Einwohner(String vorname, String nachname, String adresse, LocalDate einzugsdatum) {
		setVorname(vorname);
		setNachname(nachname);
		setAdresse(adresse);
		setEinzugsdatum (einzugsdatum);
	}

	// Getter and setter

	public String getVorname() {
		return vorname;
	}

	public void setVorname(String vorname) {

		if (vorname == null || vorname.isEmpty()) {
			throw new NullPointerException("Der Vorname darf nicht leer sein.");
		}
		this.vorname = vorname;
	}

	public String getNachname() {
		return nachname;
	}

	public void setNachname(String nachname) {

		if (nachname == null || nachname.isEmpty()) {
			throw new NullPointerException("Der Nachname darf nicht leer sein.");
		}
		this.nachname = nachname;
	}

	public String getAdresse() {
		return adresse;
	}

	public void setAdresse(String adresse) {

		if (adresse == null || adresse.isEmpty()) {
			throw new NullPointerException("Die Adresse darf nicht leer sein.");
		}
		this.adresse = adresse;
	}

	public LocalDate getEinzugsdatum() {
		return einzugsdatum;
	}

	public void setEinzugsdatum(LocalDate einzugsdatum) {

		if (einzugsdatum == null) {
			throw new NullPointerException("Das Datum darf nicht leer sein.");
		}

		this.einzugsdatum = einzugsdatum;
	}

	@Override
	public int compareTo(Einwohner a) {
		//to do: ignore case
		//to do: String methoden implementieren
		
		int vornameVergleich = vorname.compareTo(a.vorname);
		int nachnameVergleich = nachname.compareTo(a.nachname);
		
		if (nachnameVergleich != 0) {
			return nachnameVergleich;
		}
		
		// si esto falla, hacer con vorname
		
		if (vornameVergleich != 0) {
			return vornameVergleich;
		}
		return nachnameVergleich;
		
		//
	}
}
