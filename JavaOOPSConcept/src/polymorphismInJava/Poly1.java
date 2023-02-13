package polymorphismInJava;
//Overloading in same class
public class Poly1 {
	
	public static void m1() {
		
		System.out.println("m1 in parent");
	}
	
	public static void m1(int a) {
		
		System.out.println(a+" "+"m1 in parent");
	}
	public static void main(String[] args) {
		//Poly1 p1 = new Poly1();
		//p1.m1();
		//p1.m1(20);
		m1();
		m1(20);
	}

}
