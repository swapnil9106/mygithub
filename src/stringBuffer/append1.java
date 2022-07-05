package stringBuffer;

public class append1 {
	public static void main(String[] args) {
		StringBuffer sb=new StringBuffer();
		sb.append("PI Value is");
		sb.append(3.14);
		sb.append("It is exactly");
		sb.append(true);
		System.out.println(sb);//PI Value is3.14It is exactlytrue
	}

}