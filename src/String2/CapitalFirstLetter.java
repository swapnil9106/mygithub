package String2;

public class CapitalFirstLetter {
	public static void main(String[] args) {
		String str="swapnil";
		str=str.substring(0, 1).toUpperCase()+ str.substring(1);
		System.out.println(str);
	}

}
