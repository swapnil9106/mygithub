package String2;

public class ReverseStringExample {
	public static void main(String[] args) {
		String str = "Big Dream";
		// store the reverse of given String
		String reverseStr = "";
		// iterate through the String from last and add each character to variable
		// reverseStr
		for (int i = str.length() - 1; i >= 0; i--) {
			reverseStr = reverseStr + str.charAt(i);
		}
		System.out.println("Original String :" + str);

		// Display reverse String
		System.out.println("reverse String :" + reverseStr);

	}

}
