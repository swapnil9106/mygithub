//public StringBuffer delete(int begin,int end)
package stringBuffer;

public class delete1 {
	public static void main(String[] args) {
		StringBuffer sb=new StringBuffer("abcdefgh");
		sb.delete(2, 5);
		System.out.println(sb);//abfgh From begin index to end-1 index

	}

}
