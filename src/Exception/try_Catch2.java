package Exception;

public class try_Catch2 {
	public static void main(String[] args) {
		System.out.println("Statement-1");
		try {
			System.out.println(10/0);
		  }
		catch(ArithmeticException e ) {
			
		}
		System.out.println("Statement-2");
	}

}



//O/p=Statement-1
//Statement-2