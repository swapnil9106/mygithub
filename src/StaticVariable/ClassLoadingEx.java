package StaticVariable;

public class ClassLoadingEx {
	static int a=10;
	static int b=20;
	static
	{
		System.out.println("Hi");
	}
	public static void main(String[] args) {
		System.out.println("Hello");
	}

}
