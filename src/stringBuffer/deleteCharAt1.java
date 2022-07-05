package stringBuffer;

public class deleteCharAt1 {
	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer("abcdefgh");
		sb.deleteCharAt(0);
		System.out.println(sb);// bcdefgh

	}

}
