package JavaPractice;

import java.util.ArrayList;

public class PrintUniqueNumber {

	public static void main(String ar[])
	{
		//int a[] = {4,5,5,5,4,6,6,9,4};
		String str = "himanshu";
		char a[] = str.toCharArray();
		//Print unique number from the list

		//ArrayList<Integer> ab =new ArrayList<Integer>();
		ArrayList<Character> ab =new ArrayList<Character>();

		for(int i=0;i<a.length;i++)
		{
			int k=0;

			if(!ab.contains(a[i]))
			{
				ab.add(a[i]);
				k++;

				for(int j=i+1;j<a.length;j++)
				{
					if(a[i]==a[j])
					{
						k++;
					}

				}
				System.out.print(a[i]+" ");
				System.out.println(k);
			}


		}
	}
	}


