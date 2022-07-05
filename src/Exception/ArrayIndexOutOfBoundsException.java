package Exception;

public class ArrayIndexOutOfBoundsException {
	public static void main(String[] args) {
		int a[]=new int[10];
		System.out.println(a[0]);
		System.out.println(a[9]);
		System.out.println(a[100]);//ArrayIndexOutOfBoundsException
	}

}
