package UserInput$ScannerClass;

import java.util.Scanner;

public class ODDorEVEN {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int num=sc.nextInt();
		int b=num%2;
		switch(b) {
		case 0:
		{
			System.out.println("Even number");
		}
		break;
		case 1:
		{
			System.out.println("Odd number");
		}
		}
	
	}

}
