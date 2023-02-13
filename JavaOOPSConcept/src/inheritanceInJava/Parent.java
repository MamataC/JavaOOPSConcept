package inheritanceInJava;

public class Parent {
	
int a=200;
static int b=100;
public Parent() {
	System.out.println("Parent default constructor");
}
public Parent(int a) {
	System.out.println(a+"Parent paramertized constructor");
}
	public static void m1() {
		System.out.println("m1 static method of parent");
	}
	public void m2() {
		System.out.println("m2 non-static method of parent");
	}
}
