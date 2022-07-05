package UserInput$ScannerClass;

import java.util.Scanner;

public class AverageOfMarks {
	public static void main(String[] args) {
		Scanner Sc=new Scanner(System.in);
		System.out.println("Enter marks of student1");
		int s1=Sc.nextInt();
		System.out.println("Enter the marks of student2");
		int s2=Sc.nextInt();
		System.out.println("Enter the marks of student3");
		int s3=Sc.nextInt();
		int avg=(s1+s2+s3)/3;
		System.out.println("Average marks of student is "+ avg );
		
			
	}

}
