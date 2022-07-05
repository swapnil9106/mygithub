package UserInput$ScannerClass;

import java.util.Scanner;

public class AreaOfSquare {
	public static void main(String[] args) {
		System.out.println("Area Of square");
		area();
	}
	static void area()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the side");
		double side=sc.nextDouble();
		double area=side * side;
		System.out.println("Area of square :"+ area);
	}

}
