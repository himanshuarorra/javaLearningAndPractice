package JavaPractice;

public class FindDuplicateNumbersInArray {
	
	public static void main(String ar[]) {
		int a[] = {1,2,2,4,7,5,6,4};
		for(int i=1;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]==a[j])
				{
					
					System.out.println(a[i]);
				}
			}
		}
		
	}

}
