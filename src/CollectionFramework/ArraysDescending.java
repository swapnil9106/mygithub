//WAJP to print the element in descending order
package CollectionFramework;

import java.util.Arrays;

public class ArraysDescending {
	public static void main(String[] args) {
		int a[]=new int[5];
		a[0]=10;
		a[1]=1;
		a[2]=6;
		a[3]=2;
		a[4]=0;
		Arrays.sort(a);
		for(int i=a.length-1;i>=0;i--)
		{
			System.out.println(a[i]);
		}
	}

}
