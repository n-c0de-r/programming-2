package geometrie;

/**
 * Abstrakte Klasse für geometrische Figuren.
 * @author Tomas Proano
 * @version 1.0
 */
public abstract class Figur {

    protected Punkt anker;

    /**
     * Standardkonstruktor der Figur-Klasse.
     * Initialisiert den Ankerpunkt auf (0,0).
     */
    public Figur() {
        anker = new Punkt(0,0);
        System.out.println("Warnung: Parameterloser Konstruktor von Figur wurde aufgerufen!");
    }

    /**
     * Konstruktor der Figur-Klasse mit einem gegebenen Ankerpunkt.
     * @param p Der Ankerpunkt der Figur.
     * @throws NullPointerException Wenn der gegebene Ankerpunkt null ist.
     */
    public Figur(Punkt p) throws NullPointerException {
        if (p == null) {
            throw new NullPointerException("Punkt darf nicht null sein");
        }
        anker = p;
    }

    /**
     * Gibt die Farbe der Figur zurück.
     * @return Die Farbe der Figur.
     */
    public abstract String getFarbe();

    /**
     * Berechnet den Abstand auf der X-Achse zwischen dieser Figur und einer anderen Figur.
     * @param f Die andere Figur.
     * @return Der Abstand auf der X-Achse zwischen den beiden Figuren (gerundet).
     */
    public int berechneXAbstand(Figur f) {
        int abstand = (int)(Math.sqrt(Math.pow((this.anker.getX()  - f.anker.getX()),2) + Math.pow((this.anker.getY() - f.anker.getY()),2)));
        return abstand;
    }

    /**
     * Berechnet den Abstand auf der X-Achse zwischen dieser Figur und einer anderen Figur.
     * @param f Die andere Figur.
     * @return Der Abstand auf der X-Achse zwischen den beiden Figuren.
     */
    public abstract int berechneXAbstand2(Figur f);

    /**
     * Berechnet den Abstand auf der X-Achse zwischen dieser Figur und einer anderen Figur.
     * @param f Die andere Figur.
     * @return Der Abstand auf der X-Achse zwischen den beiden Figuren.
     * @throws UnsupportedOperationException Wenn die Methode in der Unterklasse nicht implementiert ist.
     */
    public abstract int berechneXAbstand3(Figur f) throws UnsupportedOperationException;

    /**
     * Gibt eine Zeichenkette zur Repräsentation der Figur zurück.
     * @return Eine Zeichenkette zur Repräsentation der Figur.
     */
    @Override
    public abstract String toString();

    /**
     * Berechnet die Fläche der Figur.
     * @return Die Fläche der Figur.
     * @deprecated Diese Methode ist veraltet und sollte nicht mehr verwendet werden.
     */
    @Deprecated
    public double berechneFlaeche() {
        // Implementierung für die Berechnung der Fläche
        return 0;
    }

    /**
     * Unterdrückt die Warnungen für eine veraltete Methode.
     */
    @SuppressWarnings("deprecation")
    public void verwendeVeralteteMethode() {
        berechneFlaeche();
    }
}