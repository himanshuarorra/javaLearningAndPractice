package JavaPractice;

import java.util.Arrays;

public class CheckEqualityOfTwoArrays {
	public static void main(String ar[])
	{
		int[] a = {5,2,3,4,1};
		int[] b = {1,3,2,4,5};
		boolean flag=true;

		Arrays.sort(a);
		Arrays.sort(b);

		//By using 
		System.out.println(Arrays.equals(a, b));

		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]+" "+b[i]);
		}

		if(a.length==b.length)
		{
			for(int j=0;j<a.length;j++)
			{
				if(a[j]!=b[j])
				{
					flag = false;
					break;
				}
			}
		}
		
		if(flag==true) {
			System.out.println("Equals");
		}
		else
		{
			System.out.println("Arrays are not equal.");
		}



	}

}
