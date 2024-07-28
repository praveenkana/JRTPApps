
public class Test {

	public static void main(String[] args) {

		B b1 = new B();
		b1.m1();
		A.m1();
		
		A a=b1;
		a.m1();
		a.m2();
		
	}

}
