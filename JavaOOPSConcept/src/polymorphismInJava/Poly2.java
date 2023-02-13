package polymorphismInJava;
//Overloading
public class Poly2 extends Poly1 {
	
	public void m1(int a,int b) {
		
		System.out.println(a+" "+b+" "+"m1 in child");
	}
	public static void m1(int a) {
		System.out.println(a);
	}
	
	public static void main(String[] args) {
		
		Poly2 p2 = new Poly2();
		p2.m1();//Parent
		p2.m1(10);//Parent
		p2.m1(20, 30);//Child
		
		Poly1 p1 = new Poly1();
		p1.m1();//parent
		p1.m1(40);//parent
		//p1.m1(10,20);//child menthod can't called
		
		Poly1 pref = new Poly2();
		pref.m1();
		pref.m1(10);
		//pref.m1(10,20);//child method cant't called
		
		//Poly2 cref = new poly1();//due to limitation of interface can't create object of parent class into child
		
		Poly1.m1(20);
		
		}

}
