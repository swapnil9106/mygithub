package stringBuffer;

public class ensureCapacity1 {
	public static void main(String[] args) {
		
	StringBuffer sb=new StringBuffer();
	System.out.println(sb.capacity());//16
	sb.ensureCapacity(1000);
	System.out.println(sb.capacity());//1000
	}
}
