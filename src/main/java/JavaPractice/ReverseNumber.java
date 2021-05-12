package JavaPractice;

public class ReverseNumber {
	public static void main(String ar[])
	{
		int a = 16461;
		int n =a;
		int rev=0;
		
		/*while(a%10!=0)
		{
			rev=a%10;
			a=a/10;
			System.out.print(rev);
		}*/
		
		while(a!=0)
		{
			rev = rev*10 +  a%10;
			a = a/10;
		}
		System.out.print(rev);
		
		if(n==rev)
		{
			System.out.println("Palindrome");	
		}
		else
		{
			System.out.println("Not Palindrome");		
		}

		
		//Using string buffer
//		StringBuffer sb = new StringBuffer(String.valueOf(a));
//		System.out.println(sb.reverse()); 
		

		
	}

}
