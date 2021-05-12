package JavaPractice;

import java.util.Scanner;

public class PrintEvenOddInArray {
	
	public static void main(String ar[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int a = sc.nextInt();
		
		if(a%2==0)
		{
			System.out.print("Even");
		}
		else
		{
			System.out.print("Odd");
		}
	}

}
