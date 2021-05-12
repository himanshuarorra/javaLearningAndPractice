package JavaPractice;

import java.util.Scanner;

public class PrimeOrNot {
	//A number which is divisible by a number other than 1 and itself
	
	public static void main(String ar[])
	{
		
	
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter number to check.");
	int n = sc.nextInt();
	int count=0;
	if(n==2)
	{
		System.out.println("Not prime.");
	}
	else
	{
		for(int i=1;i<=n/2;i++)
		{
			if(n%i==0)
			{
				count++;
				System.out.println("Divisible of number :"+i);
			}
		}
		if(count>1)
		{
			System.out.println("Number is not prime.");
		}
		else
		{
			System.out.println("prime.");
		}
	}
	
	
	}

}
