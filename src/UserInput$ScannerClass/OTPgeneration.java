package UserInput$ScannerClass;

public class OTPgeneration {
	public static void main(String[] args) {
		otp();
		
	}
	public static void otp() 
	{
		int min=100000;
		int max=999999;
		int b=(int)(Math.random()*(max-min)+min);
		System.out.println(b);
	}

}
