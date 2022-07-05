package CollectionFramework;

import java.util.Arrays;

public class SortinginArray {
	public static void main(String[] args) {
		int a[]=new int[5];
		a[0]=10;
		a[1]=1;
		a[2]=6;
		a[3]=2;
		a[4]=0;
		System.out.println("before sorting");
		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]);
		}
		Arrays.sort(a);
		System.out.println("After sorting");
		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]);
		}
	}

}
