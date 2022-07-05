//public StringBuffer insert(int index,String s)
package stringBuffer;

public class insert1 {
	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer("abcdefgh");
		sb.insert(2, "xyz");
		System.out.println(sb);//abxyzcdefgh

	}

}
