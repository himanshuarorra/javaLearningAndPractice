package arrays;

import java.util.Scanner;

public class MultiDArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * 1 2 3
		 * 4 5 6
		 * 7 8 9
		 */
		Scanner s = new Scanner(System.in);

		int a[][] = new int[3][3];
		int smallestNumber = 0;
		int highestNumber = 0;		
		System.out.println(a.length);
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a.length;j++)
			{
				System.out.println("Enter element at: " + i+" "+j);
				a[i][j]=Integer.parseInt(s.nextLine());
			}
		}

		System.out.println("Printing array");		
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a.length;j++)
			{
				System.out.print(a[i][j]);
				System.out.print("  ");				
			}
			System.out.println();				
		}


		//Finding high number
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a.length;j++)
			{
				if(highestNumber<a[i][j]) {
					highestNumber = a[i][j];
				}
			}
		}
		System.out.println("The highest number is: " + highestNumber);				

		int col=0;
		smallestNumber = a[0][0];
		//Finding smallest number
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a.length;j++)
			{
				if(smallestNumber>a[i][j]) {
					smallestNumber = a[i][j];
					col = j;
				}
			}
		}
		System.out.println("The smallest number is: " + smallestNumber);				
		System.out.println("Column with The smallest number : " + col);		
		//to find the max number in the column
		int k=0;
		int max = a[0][col];
		while(k<a.length)
		{
			if(a[k][col]>max)
			{
				max = a[k][col];
			}
			k++;
		}
		System.out.println("Highest number in column : " + max);		
	}

}
