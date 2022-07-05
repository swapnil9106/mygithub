//WAJP to design method which accept a natural number and retirn sum of it
// test case---5=1+2+3+4+5
package UserInput$ScannerClass;

import java.util.Scanner;

public class AdditionOfNaturalNumber {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int num=sc.nextInt();
		int a=m1(num);
		System.out.println("sum of number " + a);
		
	}
	public static int m1(int a)
	{
		int sum=0;
		for(int i=1;i<=a;i++)
		{
			sum=sum+i;
		}
		return sum;
	}

}
