package geometrie;

/**
 *  An auxiliary class to test the berechneUmfang method in ATest test class.
 *  @author Tomas Proano
 *  @version 1.0
 */

public abstract class A {
	
	/**
	 * Calculates the perimeter.
	 *
	 * @param g The figure object.
	 * @return The perimeter of the figure.
	 */
    public static int berechneUmfang(Gleichseitig g) {
    	
        int seitenanzahl = g.getSeitenanzahl();
        int seitenlaenge = g.getSeitenlaenge();
        
        return seitenanzahl * seitenlaenge;
    }
}