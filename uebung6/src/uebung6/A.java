package uebung6;

public abstract class A {
	
    public static int berechneUmfang(Gleichseitig g) {
    	
        int seitenanzahl = g.getSeitenanzahl();
        int seitenlaenge = g.getSeitenlaenge();
        
        return seitenanzahl * seitenlaenge;
    }
}