package AbstarctioInJava;

public class Build2 extends Build1 {
	
	public void mutualfund() {
		
		System.out.println("implemented");
	}

	public static void main(String[] args) {

		Build2 ob = new Build2();
		ob.stockexchange();
		ob.mutualfund();
		ob.test();
		ob.test1();
		ob.test2();

	}

	@Override
	void test() {
		// TODO Auto-generated method stub
		
	}

}
