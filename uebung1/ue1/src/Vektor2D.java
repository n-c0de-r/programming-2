
public class Vektor2D {
	
	private float delX, delY;
	
	private Punkt anker;
	
	public Vektor2D(float delX, float delY, Punkt anker) {
		this.delX = delX;
		this.delY = delY;
		this.anker = anker;
	}
	
//	1.1 Überschreiben der toString()-Methode
// getter und setter nicht nötig
	
	public String toString() {
		return "(" +  delX + ", " + delY + "), anker: (" + anker + ")";

	}
	
// bei Klassenmethoden: erg DT zuweisen und return erg

	public static float betrag(Vektor2D v) {
		float erg = (float) Math.sqrt(v.delX*v.delX + v.delY*v.delY);
		return erg;
	}
	
//1.2 Instanz- in Klassenmethoden umwandeln		
//	Implementiere als Instanzmethode
		public Vektor2D multipliziereMitSkalar1(Vektor2D v1, float skalar){
			return new Vektor2D(delX * skalar, delY * skalar, anker); 
		 }
		
//	Implementiere als Klassenmethode
		public static Vektor2D multipliziereMitSkalar2 (Vektor2D v1, float skalar) {
	
			return new Vektor2D(v1.delX * skalar, v1.delY * skalar, v1.anker); 
	
		}
		
// 1.3 Objektarray
	    public static void ausgabeVekObj(Vektor2D[] vektoren) {
	        for(Vektor2D vektor : vektoren) {
	            System.out.println(vektor);
	        }
	    }


}