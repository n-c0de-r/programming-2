public class Vektor2DTest {
    public static void main(String[] args) {
        Vektor2D[] vektoren = new Vektor2D[] {
                new Vektor2D(1, 0, new Punkt(1, 1)),
                new Vektor2D(0, 1, new Punkt(2, 2)),
                new Vektor2D(1, 4, new Punkt(3, 4)),
                new Vektor2D(3, 2, new Punkt(2, 3)),
                new Vektor2D(3, 5, new Punkt(3, 3)),
        };

        for (Vektor2D vektor : vektoren) {

            // Gibt Vektor aus
            System.out.println(vektor);

            // Berechenet Betrag
            float betrag = Vektor2D.betrag(vektor);
            System.out.println("Betrag: " + betrag);

            // Berechnet Skalar als Klassenmethode und Instanzmethode
            int skalar = 4;
            Vektor2D multMitSkalar = Vektor2D.multipliziereMitSkalarKlasse(vektor, skalar);
            System.out.println("Neuer Vektor multipliziert mit Skalar: " + multMitSkalar);

            vektor.multipliziereMitSkalar(skalar);
            System.out.println("Vektor multipliziert mit Skalar" + vektor);
            System.out.println();

        }
    }

    // Print ein Vektor2D - Array
    public static void printvektor2DArray(Vektor2D[] vektorArray) {
        for (Vektor2D vektor : vektorArray) {
            System.out.println(vektor);
        }
    }
}
