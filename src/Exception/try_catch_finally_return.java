package Exception;

public class try_catch_finally_return {
	public static void main(String[] args) {
		System.out.println(m1());
	}
	public static int m1()
	{
		try
		{
			return 777;	
		}
		catch(Exception e)
		{
			return 888;
		}
		finally
		{
			return 999;
		}
	}
}


//Op=999