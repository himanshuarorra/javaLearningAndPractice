package JavaPractice;

public class LinearSearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[] = {10,40,30,22,43};
		
		int b = 30;
		boolean flag = false;
		
		
		for(int i=0;i<a.length;i++)
		{
			if(a[i]==b)
			{
				System.out.print("Found");
				flag=true;
				break;
			}
		}
		if(flag==false)
		{
			System.out.print("Not found");
		}

	}

}
