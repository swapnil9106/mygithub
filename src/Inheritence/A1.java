package Inheritence;

class A1 {
	static int a=656;
}

class B1 extends A1
{
	
}
class C1 extends B1
{
	public static void main(String[] args) {
		System.out.println(a);
	}
}

