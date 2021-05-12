package arrays;

import java.util.Scanner;

public class OneDArray {

	public static void main(String args[])
	{
		
		//Intializing array at run time or at time coding 
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size of array: " );
		int a[] = new int[Integer.parseInt(sc.nextLine())];
		for(int i=0;i<a.length;i++)
		{
			System.out.println("Enter value at index: " + i);
			a[i]= Integer.parseInt(sc.nextLine());
		}
		System.out.println("Printing loop");
		for (int j=0;j<a.length;j++)
		{
			System.out.println(a[j]);
		}	
		
		//Initializing at time of declaration i.e. Array literal
		int m[] = {1,1,1,1,1,1,1};
		System.out.println("Printing loop");
		for (int j=0;j<m.length;j++)
		{
			System.out.println(m[j]);
		}
		


	}


}
