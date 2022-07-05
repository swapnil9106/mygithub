package Exception;

public class throw1 {
	public static void vote (int age){
		if(age<18)
		{
			throw new ArithmeticException("Go home");
			
		}
		else
		{
			System.out.println("Vote and go home");
		}
		
	}
	public static void main(String[] args) {
		System.out.println("Wel Come");
		vote(19);
		System.out.println("Thank you");
	}

}
