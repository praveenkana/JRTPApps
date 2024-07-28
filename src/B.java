
public class B extends A {
	static void m1() {
		System.out.println("B.m1()");
	
	}
	
	void m2() {
		System.out.println("B.m2()");
		super.m1();
		super.m2();
		A.m1();
		
	}
	
}
