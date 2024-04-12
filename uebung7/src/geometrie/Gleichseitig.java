package geometrie;

/**
 * The Gleichseitig interface represents a geometric shape with equal sides.
 */
public interface Gleichseitig {
	
	/**
	 * Constant representing a triangular shape.
	 */
	int DREIECKIG = 3;
	
	/**
	 * Constant representing a quadrilateral shape.
	 */
	int VIERECKIG = 4;
	

	/**
	 * Returns the number of sides of the shape.
	 * 
	 * @return the number of sides
	 */
	public abstract int getSeitenanzahl(); 
	
	/**
	 * Returns the length of the side of the shape.
	 * 
	 * @return the length of the side
	 */
	public abstract int getSeitenlaenge(); 
}