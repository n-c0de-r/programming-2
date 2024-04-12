
public class Vektor2DTest {

	public static void main(String[] args) {
		
	Punkt p1 = new Punkt(1, 1);
	Punkt p2 = new Punkt(2, 2);
	Punkt p3 = new Punkt(3, 4);
	Punkt p4 = new Punkt(2, 3);
	Punkt p5 = new Punkt(3, 3);
	
	Vektor2D v1 = new Vektor2D(1, 0, p1);
	Vektor2D v2 = new Vektor2D(0, 1, p2);
	Vektor2D v3 = new Vektor2D(1, 4, p3);
	Vektor2D v4 = new Vektor2D(3, 2, p4);
	Vektor2D v5 = new Vektor2D(3, 5, p5);
	
	System.out.println(v1);
	System.out.println(v2);
	System.out.println(v3);
	System.out.println(v4);
	System.out.println(v5);
	
	System.out.println(Vektor2D.betrag(v3));
	
	
	System.out.println(multipliziereMitSkalar1(v1, 5));


}
	
	
}
