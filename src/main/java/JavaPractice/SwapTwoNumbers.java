package JavaPractice;

public class SwapTwoNumbers {

	public static void main(String ar[])
	{
		int a =10;
		int b = 6;
		int t=0;
		
		//way 1
		/*t=a;
		a=b;
		b=t;
		System.out.println(a+" "+b);*/
		
		//way2 
		/*b = a*b;		//60
		a = b/a;		//6
		b = b/a;		//10
		System.out.println(a+" "+b);*/
		
		//way 3
		a = a+b;		//16
		b = a-b;
		a = a-b;
		System.out.println(a+" "+b);

	}
}
