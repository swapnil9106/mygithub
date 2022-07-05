//Case:2if exception is handled
package Exception;

public class try_catch_finally2 {
	public static void main(String[] args) {
		
	try
	{
		System.out.println("try");
		System.out.println(10/0);
	}
	catch(ArithmeticException e)
	{
		System.out.println("catch");
	}
	finally
	{
		System.out.println("finally");
	}
	
	}
}


//Op
//try
//catch
//finally