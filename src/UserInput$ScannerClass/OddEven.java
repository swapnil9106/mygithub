package UserInput$ScannerClass;

import java.util.Scanner;

public class OddEven {
	public static void main(String[] args) {
		check();
		
	}
	public static void check() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int num=sc.nextInt();
		if(num%2==0)
		{
			System.out.println("Given number is Even");
		}
		else
		{
			System.out.println("Given number is odd");
		}
	}

}
