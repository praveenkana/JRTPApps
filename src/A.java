
public class A {
	static void m1() {
		System.out.println("A.m1()");
	}

	
	void m2() {
		
		System.out.println("A.m2()");
		A.m1();
		System.out.println(super.hashCode());
		
		
	}
}
