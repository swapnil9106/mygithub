//WAJP to print the largest element of an Arrays
package CollectionFramework;

import java.util.Arrays;

public class LargesrNumberArray {
	public static void main(String[] args) {
		int a[]=new int[5];
		a[0]=100;
		a[1]=45;
		a[2]=64;
		a[3]=26;
		a[4]=543;
		Arrays.sort(a);
		System.out.println(a[a.length-1]);
	}

}
