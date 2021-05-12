package JavaPractice;

public class MaxMinInArray {

	public static void main(String ar[])
	{
		int[] a = {4,54,54,2,54};

		int max=0;
		int min=0;

		max = a[0];
		min = a[0];
		//Max
		for(int i=0;i<a.length;i++)
		{
			if(max<a[i])
			{
				max =a[i];
			}
		}
		System.out.println(max);
		//Min
		for(int i=0;i<a.length;i++)
		{
			if(min>a[i])
			{
				min =a[i];
			}
		}
		System.out.println(min);
	}

}
