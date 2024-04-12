package p1;

public class B extends A {
	
	  void teste() {
		  
	    int value = meth1(2); // Zugriff auf protected Methode meth1
	    System.out.println(value); // gibt den geänderten Wert von datum aus
	  }
	}