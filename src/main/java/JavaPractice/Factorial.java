package JavaPractice;

import java.util.Scanner;

public class Factorial {

	//
	public static void main(String args[])
	{
		System.out.print("Finding factorial.");
		//5*4*3*2*1
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		int a = Integer.parseInt(s);
		long f = 1;
		
		for(int i=1;i<=a;i++)
		{
			f = f*i;
		}
		System.out.println(f);

	}

}
