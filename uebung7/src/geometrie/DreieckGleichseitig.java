package geometrie;

/**
 * This class represents an equilateral triangle.
 * It extends the Dreieck class and implements the Gleichseitig interface.
 * @author Tomas Proano
 * @version 1.0
 */
public class DreieckGleichseitig extends Dreieck implements Gleichseitig {

    private int seite;
    private int seitenlaenge;

    /**
     * Constructs a new DreieckGleichseitig object with the given side length and point.
     * 
     * @param seitenlaenge The side length of the equilateral triangle
     * @param p The point of the equilateral triangle
     */
    public DreieckGleichseitig(int seitenlaenge, Punkt p) {
        super(seitenlaenge, p);
        this.seitenlaenge = seitenlaenge;
    }

    /**
     * Sets the side length of the equilateral triangle.
     * 
     * @param seitenlaenge The side length of the equilateral triangle
     */
    public void setSeitenlaenge(int seitenlaenge) {
        this.seitenlaenge = seitenlaenge;
    }

    /**
     * Calculates and returns the area of the equilateral triangle.
     * 
     * @return The area of the equilateral triangle
     */
    public double berechneFlaeche() {
        return seite * seite * (Math.sqrt(3) / 4);
    }

    /**
     * Calculates and returns the perimeter of the equilateral triangle.
     * 
     * @return The perimeter of the equilateral triangle
     */
    public double berechneUmfang() {
        return seitenlaenge * DREIECKIG;
    }

    /**
     * Gets the side of the equilateral triangle.
     * 
     * @return The side of the equilateral triangle
     */
    public int getSeite() {
        return seite;
    }

    /**
     * Returns a string representation of the equilateral triangle.
     * 
     * @return A string representation of the equilateral triangle
     */
    @Override
    public String toString() {
        return ("Seite: " + seite);
    }

    /**
     * Gets the number of sides of the equilateral triangle.
     * 
     * @return The number of sides of the equilateral triangle
     */
    @Override
    public int getSeitenanzahl() {
        return DREIECKIG;
    }

    /**
     * Gets the side length of the equilateral triangle.
     * 
     * @return The side length of the equilateral triangle
     */
    @Override
    public int getSeitenlaenge() {
        return seitenlaenge;
    }

    /**
     * Gets the color of the equilateral triangle.
     * 
     * @return The color of the equilateral triangle
     */
    @Override
    public String getFarbe() {
        // TODO Auto-generated method stub
        return null;
    }

    /**
     * Calculates and returns the x-distance between this equilateral triangle and another figure.
     * 
     * @param f The figure to calculate the x-distance to
     * @return The x-distance between this equilateral triangle and the given figure
     */
    @Override
    public int berechneXAbstand2(Figur f) {
        // TODO Auto-generated method stub
        return 0;
    }

    /**
     * Calculates and returns the x-distance between this equilateral triangle and another figure.
     * 
     * @param f The figure to calculate the x-distance to
     * @return The x-distance between this equilateral triangle and the given figure
     */
    @Override
    public int berechneXAbstand3(Figur f) {
        // TODO Auto-generated method stub
        return 0;
    }
}
