package uebueng4;

public class Test {
	
	public static void main(String[] args) {
		Figur f = new Figur (new Punkt(3,8));
		System.out.println(f);
		
		System.out.println();
		
		Quadrat q = new Quadrat(3, new Punkt(1,2));
		System.out.println(q);
		
		System.out.println();

		Rechteck r = new Rechteck(2,2, new Punkt(0,0));
		System.out.println(r);
		
		System.out.println();

		
		System.out.println(f.farbe);
		System.out.println(r.farbe);
		System.out.println(q.farbe);
		
		System.out.println();

		
		System.out.println(f.getFarbe());
		System.out.println(r.getFarbe());
		System.out.println(q.getFarbe());
		//si solo hay getter en farbe, farbe von figur wird abgerufen....
		//gelb
		//gelb
		//gelb
		
		System.out.println(f.getFarbe());
		System.out.println(r.getFarbe());
		System.out.println(q.getFarbe());
		//ahora hay getters en las otras dos clases que heredan y salen los
		//colores de cada una
		
//		gelb
//		rot
//		blau
		
		r.printFarbe();
		
//		Farbe Rechteck: rot
//		Farbe Quadrat: blau
//		Farbe Figur: rot //wurde ueberschrieben

		
		
		
	}

}
