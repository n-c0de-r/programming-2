public class Vektor2D {

    private float delX, delY;
    private Punkt anker;

    // Konstruktor
    public Vektor2D(float delX, float delY, Punkt anker) {
        this.delX = delX;
        this.delY = delY;
        this.anker = anker;
    }

    // To-String Methode
    public String toString() {
        return "(" + delX + ", " + delY + "), anker: (" + anker.getX() + ", " + anker.getY() + ")";
    }

    // Klassenmethode, addieret zwei Vektoren und liefert neuen Vektor zurück
    public static Vektor2D add1(Vektor2D v1, Vektor2D v2) {
        Vektor2D erg = new Vektor2D(v1.delX + v2.delX, v1.delY + v2.delY, v1.anker);
        return erg;
    }

    // Instanzmethode, die Betrag des Vektor liefert
    /*
     * public float betrag() {
     * return ((float) Math.sqrt(delX * delX + delY * delY));
     * }
     */

    // Klassenmethode, die Betrag des Vektors zurückliefert
    public static float betrag(Vektor2D vektor) {
        return ((float) Math.sqrt(vektor.delX * vektor.delX + vektor.delY * vektor.delY));
    }

    // Verschiebt Anker um angegebenen Vektor
    public void verschiebeAnker(Vektor2D schieb) {
        anker.verschiebe(schieb.delX, schieb.delY);
    }

    // Instanzmethode, in der Vektor mit Skalar multipliziert wird
    public void multipliziereMitSkalar(int sklalar) {
        this.delX *= sklalar;
        this.delY *= sklalar;
    }

    // Klassenmethode, in der ein Vektor mit Skalar multipliziert und als neuer
    // Vektor zurückgegeben wird
    public static Vektor2D multipliziereMitSkalarKlasse(Vektor2D vektor, int sklalar) {
        Vektor2D erg = new Vektor2D(vektor.delX * sklalar, vektor.delY * sklalar, vektor.anker);
        return erg;
    }

}
