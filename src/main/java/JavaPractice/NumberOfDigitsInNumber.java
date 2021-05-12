package JavaPractice;

import java.util.Scanner;

public class NumberOfDigitsInNumber {
	
	public static void main(String ar[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number");
		int a = sc.nextInt();
		int count=0;
		
		while(a%10!=0)
		{
			count++;
			a = a/10;
		}
		System.out.print("Number of digits: "+count);
	}

}
