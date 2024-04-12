package uebung6;

public class ATest {
	
    public static void main(String[] args) {
    	
        Quadrat quadrat = new Quadrat(5, new Punkt(0, 0));
        DreieckGleichseitig dreieckG = new DreieckGleichseitig(5, new Punkt(0, 0));

        int umfangQuadrat = A.berechneUmfang(quadrat);
        int umfangDreieck = A.berechneUmfang(dreieckG);

        System.out.println("Umfang Quadrat: " + umfangQuadrat);
        System.out.println("Umfang Dreieck: " + umfangDreieck);
    }
}
