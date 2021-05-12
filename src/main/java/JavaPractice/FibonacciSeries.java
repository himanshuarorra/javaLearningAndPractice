package JavaPractice;

public class FibonacciSeries {
	
	//0 1 1 2 3 5 8 13 21 34
	public static void main(String args[])
	{
		int f = 0;
		int s = 1;
		int next = 0;
		System.out.print(f+ " "+s+ " ");
		for(int i=0;i<10;i++)
		{
			next = f+s;
			
			f=s;
			s=next;
			System.out.print(next+ " ");
		}
	}

}
