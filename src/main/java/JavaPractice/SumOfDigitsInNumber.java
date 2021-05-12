package JavaPractice;

import java.util.Scanner;

public class SumOfDigitsInNumber {
	
	public static void main(String ar[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int a = sc.nextInt();
		int sum=0;
		
		while(a%10!=0)
		{
			sum= sum+a%10;
			a=a/10;
		}
		System.out.println(sum);
		
	}

}
