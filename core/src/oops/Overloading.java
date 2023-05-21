package oops;


class A {
	void method(Object s) {
		System.out.println("1");
	}

	void method(Double s) {
		System.out.println("1");
	}

	void method(Float s) {
		System.out.println("1");
	}

	void method(String s) {
		System.out.println("2");
	}

	void method(Integer s) {
		System.out.println("3");
	}
}

class B extends A {
	void method() {
		System.out.println("2");
	}
}

public class Overloading extends B {
	public static void main(String[] args) {
		A a = new A();
//		a.method(null);
	}
}

