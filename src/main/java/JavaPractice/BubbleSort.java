package JavaPractice;

public class BubbleSort {

	public static void main(String b[])
	{
		int a[]= {1,5,3,2,4,9,8,7,10,6};
		for(int i=0;i<a.length-1;i++)	//for number of passes
		{
			for(int j=i+1;j<a.length-1;j++)			//for iterating and swapping
			{
					if(a[i]>a[j])
					{
						int t= a[j];
						a[j]=a[j+1];
						a[j+1]=t;
					}
			}
		}
		for(int k =0;k<a.length;k++)
		{
			System.out.println(a[k]);
		}
	}


	
}


