package geometrie;


/**
 * Represents a circle shape.
 * @author Tomas Proano
 * @version 1.0
 */
public class Kreis extends Figur {

    private int radius;
    private double PI = Math.PI;

    /**
     * Constructs a circle with the given radius and anchor point.
     *
     * @param radius the radius of the circle
     * @param anker  the anchor point of the circle
     */
    public Kreis(int radius, Punkt anker) {
        super(anker);
        this.radius = radius;
    }

    /**
     * Calculates the area of the circle.
     *
     * @return the area of the circle
     */
    public double berechneFlaeche() {
        return PI * radius * radius;
    }

    /**
     * Calculates the circumference of the circle.
     *
     * @return the circumference of the circle
     */
    public double berechneUmfang() {
        return 2 * radius * PI;
    }

    /**
     * Returns the radius of the circle.
     *
     * @return the radius of the circle
     */
    public int getRadius() {
        return radius;
    }

    /**
     * Returns a string representation of the circle.
     *
     * @return a string representation of the circle
     */
    public String toString() {
        return ("Radius: " + radius);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String getFarbe() {
        // TODO Auto-generated method stub
        return null;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public int berechneXAbstand2(Figur f) {
        // TODO Auto-generated method stub
        return 0;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public int berechneXAbstand3(Figur f) {
        // TODO Auto-generated method stub
        return 0;
    }

}