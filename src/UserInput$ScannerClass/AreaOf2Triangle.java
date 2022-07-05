package UserInput$ScannerClass;

import java.util.Scanner;

public class AreaOf2Triangle {
	public static void main(String[] args) {
		Scanner sc1 = new Scanner(System.in);
		System.out.println("Enter the base of triangle1");
		double b1 = sc1.nextDouble();
		System.out.println("Enter the height of triangle1");
		double h1 = sc1.nextDouble();
		double area1 = (b1 * h1) / 2;
		System.out.println("Area of triangle1 is " + area1);
		Scanner sc2=new Scanner(System.in);
		System.out.println("Enter the base of triangle2");
		double b2=sc2.nextDouble();
		System.out.println("Enter the height of triangle2");
		double h2=sc2.nextDouble();
		double area2=(b2*h2)/2;
		System.out.println("Area of triangle 2 "+ area2);
	}

}

