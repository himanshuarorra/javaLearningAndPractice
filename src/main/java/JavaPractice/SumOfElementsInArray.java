package JavaPractice;

public class SumOfElementsInArray {
	
	public static void main(String ar[])
	{
		int a[] = {1,2,3,4,5,6};
		int sum= 0;
		
		for(int i=0;i<a.length;i++)
		{
			sum =sum+a[i];
		}
		System.out.println(sum);
	}

}
