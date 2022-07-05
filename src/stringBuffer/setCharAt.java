//public void setCharAt(int index, char new char)
package stringBuffer;

public class setCharAt {
	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer("Java");
		sb.setCharAt(0, 'Y');
		System.out.println(sb);// Yava
	}

}
