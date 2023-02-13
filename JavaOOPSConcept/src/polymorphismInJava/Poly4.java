package polymorphismInJava;
//Overiding
public class Poly4 extends Poly3 {
	
	public static void m1() {
		
		System.out.println("Child Nonstatic");
	}

	public static void main(String[] args) {
	
		
		
		Poly3 p = new Poly4();
		p.m1();
		
		Poly4 p1 = new Poly4();
		p1.m1();
		
		m1();
	}

}
