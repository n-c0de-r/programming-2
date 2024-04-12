package uebung10;

class WarteschlangeTest {
	
	public static void main(String[] args) {
		
		WarteschlangeGenerisch<Integer> intqueue = new WarteschlangeGenerisch<Integer>();
		
		Element<Integer> int1 = new Element<>(5);	
		Element<Integer> int2 = new Element<>(4);
		Element<Integer> int3 = new Element<>(7);
		
		intqueue.enqueue(5);
		intqueue.enqueue(4);
		intqueue.enqueue(7);
		
		intqueue.content(); //547
	


		System.out.println(intqueue.dequeue());
		
		intqueue.content(); //47
		
		
	}
}
