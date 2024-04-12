package geometrie;

/**
 * This is the test of class A.
 *  @author Tomas Proano
 *  @version 1.0
 */

public class ATest {
	
    public static void main(String[] args) {
    	
        // Create a square and an equilateral triangle
    	Quadrat quadrat = new Quadrat(5, new Punkt(0, 0));
        DreieckGleichseitig dreieckG = new DreieckGleichseitig(5, new Punkt(0, 0));
        
        // Calculate the perimeter of the square
        int umfangQuadrat = A.berechneUmfang(quadrat);
        // Calculate the perimeter of the equilateral triangle
        int umfangDreieck = A.berechneUmfang(dreieckG);

        // Print the perimeters
        System.out.println("Umfang Quadrat: " + umfangQuadrat);
        System.out.println("Umfang Dreieck: " + umfangDreieck);
    }
}