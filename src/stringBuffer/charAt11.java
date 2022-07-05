package stringBuffer;

public class charAt11 {
	public static void main(String[] args) {
		StringBuffer sb=new StringBuffer("durga");
		System.out.println(sb.charAt(3));//g
		System.out.println(sb.charAt(30));//" java.lang.StringIndexOutOfBoundsException
	}

}
