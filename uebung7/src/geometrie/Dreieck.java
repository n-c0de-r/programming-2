package geometrie;

/**
 * Represents a triangle shape.
 * @author Tomas Proano
 * @version 1.0
 */
public class Dreieck extends Figur {

    private int seite;

    /**
     * Constructs a new Dreieck object with the given side length and position.
     * 
     * @param s The length of the side of the triangle.
     * @param p The position of the triangle.
     */
    public Dreieck(int s, Punkt p) {
        super(p); // Call the constructor of the superclass
        seite = s;
    }

    /**
     * Calculates and returns the area of the triangle.
     * 
     * @return The area of the triangle.
     */
    public double berechneFlaeche() {
        return seite * seite * (Math.sqrt(3) / 4);
    }

    /**
     * Calculates and returns the perimeter of the triangle.
     * 
     * @return The perimeter of the triangle.
     */
    public double berechneUmfang() {
        return seite * 3;
    }

    /**
     * Gets the side length of the triangle.
     * 
     * @return The side length of the triangle.
     */
    public int getSeite() {
        return seite;
    }

    /**
     * Returns a string representation of the triangle.
     * 
     * @return The string representation of the triangle.
     */
    public String toString() {
        return ("Seite: " + seite);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String getFarbe() {
        return null;
    }

    /**
     * {@inheritDoc}
     * @deprecated This method is deprecated and should not be used.
     */
    @Override
    @Deprecated
    public int berechneXAbstand2(Figur f) {
        return 0;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public int berechneXAbstand3(Figur f) {
        return 0;
    }
}