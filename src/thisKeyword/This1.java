package thisKeyword;

public class This1 {
	int a=10;
	void display()
	{
		int a=20;
		System.out.println(a);//20
		System.out.println(this.a);//10
	}
	public static void main(String[] args) {
		This1 obj=new This1();
		obj.display();
		
	}

}
