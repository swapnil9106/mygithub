package UserInput$ScannerClass;

import java.util.Scanner;

public class LastDigitOfNumber {
	public static void main(String[] args) {
		System.out.println("Last Digit of number");
		LastNumber();
	}

	public static void LastNumber() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number");
		int num = sc.nextInt();
		int lastdigit = num % 10;
		System.out.println("Last digit of number is " + lastdigit);

	}

}
