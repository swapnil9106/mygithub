package CollectionFramework;

public class LargestNumber {
	public static void main(String[] args) {
		int a[]=new int[5];
		a[0]=10;
		a[1]=1;
		a[2]=6;
		a[3]=2;
		a[4]=0;
		int temp=a[0];
		for(int i=0;i<a.length;i++)
		{
			if(a[i]>temp)
			{
				temp=a[i];
			}
		}
		System.out.println(temp);
	}

}
