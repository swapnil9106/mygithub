//case:3 if exception is raised and not handled
package Exception;

public class try_catch_finally3 {
	public static void main(String[] args) {
		try 
		{
			System.out.println("try");
			System.out.println(10/0);	
		}
		
		catch(NullPointerException e)
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
//finally
