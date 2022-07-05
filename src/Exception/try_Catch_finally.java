//case-1=if there is no exception
package Exception;

public class try_Catch_finally {
	public static void main(String[] args) {
		try 
		{
			System.out.println("try");
		} catch (Exception e) 
		{
			System.out.println("catch");
		} 
		finally 
		{
			System.out.println("finally");
		}

	}
}

//Output=
//try
//finally
