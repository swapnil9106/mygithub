package EqualsMethods;

public class EqualExample2 {
	public static void main(String [] args)
	{
	String s1="javatpoint";
	String s2="javatpoint";
	String s3="JAVATPOINT";
	System.out.println(s1.equals(s2));
	if(s1.equals(s3))
	{
		System.out.println("both strings are equals");
	}
	else
	{
		System.out.println("both strings are unequals");
		
	}
	
	}
}
