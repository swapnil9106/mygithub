//WAJP to print the element in odd place
package CollectionFramework;

public class Arrays1 {
	public static void main(String[] args) {
		int a[]=new int[5];
		a[0]=10;
		a[1]=1;
		a[2]=6;
		a[3]=2;
		a[4]=0;
		for(int i=0;i<a.length;i++)
		{
			if(i%2==0)
			{
				System.out.println(a[i]);
			}
		}
		
	}

}
