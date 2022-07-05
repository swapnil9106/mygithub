//super is used to invoke parent class constructor
package SuperKeyword;

public class Animal2 {
	Animal2()
	{
		System.out.println("animal is created");
	}
}
	
	class dog4 extends Animal2
	{
		dog4()
		{
			super();
			System.out.println("dog is created");
		}
	}	



class TestSuper3
{
	public static void main(String[] args) {
		dog4 d2=new dog4();
		
		
}
}
