package MethodOverriding;

public class A {
	static int a = 10;

	public void m1() {
		System.out.println("From A");
	}
}

class B extends A {
	public static void main(String[] args) {
		A a1 = new A();// From A

		a1.m1();
	}

	public void m1() {

		System.out.println("From B");
	}

}
