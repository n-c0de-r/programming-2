package geometrie;

/**
 * The Quadrat class represents a square. It extends the Rechteck class 
 * and implements the Gleichseitig interface.
 * @author Tomas Proano
 * @version 1.0
 */
public class Quadrat extends Rechteck implements Gleichseitig {

    private int seitenlaenge;

    /**
     * Constructs a new Quadrat with a default side length of 0.
     * Prints a warning message.
     */
    public Quadrat() {
        super();
        System.out.println("Warning: Parameterless constructor of Quadrat called!");
    }

    /**
     * Constructs a new Quadrat with the specified side length and center point.
     * 
     * @param seitenlaenge the side length of the Quadrat
     * @param p the center point of the Quadrat
     */
    public Quadrat(int seitenlaenge, Punkt p) {
        super(p, seitenlaenge, seitenlaenge);
    }

    /**
     * Sets the side length of the Quadrat.
     * 
     * @param seitenlaenge the side length to set
     */
    public void setSeitenlaenge(int seitenlaenge) {
        this.seitenlaenge = seitenlaenge;
    }

    /**
     * Calculates the diagonal length of the Quadrat.
     * 
     * @return the diagonal length of the Quadrat
     */
    public double berechneDiagonale() {
        int breite = getBreite();
        return Math.sqrt(breite * breite + breite * breite);
    }

    /**
     * Returns the number of sides of the Quadrat.
     * 
     * @return the number of sides
     */
    public int getSeitenanzahl() {
        return VIERECKIG;
    }

    /**
     * Returns the side length of the Quadrat.
     * 
     * @return the side length of the Quadrat
     */
    public int getSeitenlaenge() {
        return seitenlaenge;
    }
    
    /**
     * Calculates the perimeter of the Quadrat.
     * 
     * @return the perimeter of the Quadrat
     */
    public double berechneUmfang() {
        return seitenlaenge * VIERECKIG;
    }

}