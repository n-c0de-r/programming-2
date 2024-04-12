package geometrie;

/**
 * Represents a rectangle shape.
 * @author Tomas Proano
 * @version 1.0
 */
public class Rechteck extends Figur {

    private int laenge;
    private int breite;

    /**
     * Constructs a new rectangle with default values.
     */
    public Rechteck() {
        super();
    }

    /**
     * Constructs a new rectangle with the given anchor point, width, and height.
     *
     * @param anker  the anchor point of the rectangle
     * @param breite the width of the rectangle
     * @param laenge the height of the rectangle
     */
    Rechteck(Punkt anker, int breite, int laenge) {
        super(anker);
        this.laenge = laenge;
        this.breite = breite;
    }

    /**
     * Returns the length of the rectangle.
     *
     * @return the length of the rectangle
     */
    public int getLaenge() {
        return laenge;
    }

    /**
     * Returns the width of the rectangle.
     *
     * @return the width of the rectangle
     */
    public int getBreite() {
        return breite;
    }

    /**
     * Calculates and returns the area of the rectangle.
     *
     * @return the area of the rectangle
     */
    public double berechneFlaeche() {
        return laenge * breite;
    }

    /**
     * Calculates and returns the perimeter of the rectangle.
     *
     * @return the perimeter of the rectangle
     */
    public double berechneUmfang() {
        return 2 * (breite + laenge);
    }

    /**
     * Returns a string representation of the rectangle.
     *
     * @return a string representation of the rectangle
     */
    @Override
    public String toString() {
        return "Anker: " + anker.toString() + "\nLaenge: " + laenge + " und Breite: " + breite;
    }

    // Implementations of abstract methods from the Figur class

    @Override
    public String getFarbe() {
        return null;
    }

    @Override
    public int berechneXAbstand2(Figur f) {
        return (int) Math.abs(this.anker.getX() - f.anker.getX());
    }

    @Override
    public int berechneXAbstand3(Figur f) {
        return (int) Math.abs(anker.getX() - f.anker.getX());
    }
}