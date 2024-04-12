package uebung3;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

class TestFigur {

	@Test
	public void testQuadrat() {
		//erzeuge q
		Quadrat q = new Quadrat(5, new Punkt(0,0));
		//teste Umfang
		assertTrue(q.berechneUmfang() == 20.0);
		Punkt sollAnkerQ = new Punkt(3, -1);
		//verschiebe
		q.verschiebeAnker(3,  -1);
		//teste Verschiebung
		assertEquals(sollAnkerQ, q.getAnker());
	}
	
	@Test
    public void testKreis() {
		//erzeuge k
        Kreis k = new Kreis(7, new Punkt(1, 1));
        //teste Umfang
        assertTrue(k.berechneUmfang() == 43.982);
        //setze Anker neu
        Punkt sollAnkerK = new Punkt(4, 4);
        k.setAnker(sollAnkerK);
        //teste Anker
        assertEquals(sollAnkerK, k.getAnker());
        //teste Radius
        int sollRadiusK = 7;
        assertEquals(sollRadiusK, k.getRadius());
    }

    @Test
    public void testRechteck() {
    	//erzeuge r
        Rechteck r = new Rechteck(4, 8, new Punkt(2, 3));
        //teste Flaeche
        assertTrue(r.berechneUmfang() == 32.0);
        //setze Anker neu
        Punkt sollAnkerR = new Punkt(6, 10);
        r.verschiebeAnker(4, 7);
        //teste Anker
        assertEquals(sollAnkerR, r.getAnker());
        //gib u. teste Laenge u. Breite
        int sollBreiteR = 4;
        assertEquals(sollBreiteR, r.getBreite());
        int sollLaengeR = 8;
        assertEquals(sollLaengeR, r.getLaenge());
    }
    
}

