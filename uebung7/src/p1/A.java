package p1;

public class A {
	  private int datum;
	  
	  protected A () {
	datum = 1; 
	
	  }
	  
	  protected int meth1 (int add) {
	      return datum = datum + add;
	  }
	  
	  protected int meth2 (int sub) {
	      return datum -= sub;
	  }
	  protected int meth3 (int mult) {
	      return datum = datum * mult;
	  }
	  protected int meth4(int div, int d) {
	      return div / d;
	  }
	}
