package inheritanceInJava;

public class child extends Parent {

	int a=20;
	static int b=20;
	public child() {
		this(20);
		//super(55);
		System.out.println("Child default Constructor");
	}
	public child(int x) {
	System.out.println(x);	
	}
	
	public void m3() {
		
		System.out.println(Parent.b);//static variale same name for parent and child
		System.out.println(super.a);//non-static variable same name for parent and child
	}
	public static void main(String[] args) {
	   m1();
       child c =new child();
       c.m2();
       System.out.println(c.a+" "+b);
       c.m3();
      System.out.println();
      new child();
      //new parent();//can not call parent constructor directly 
	}

}
