package JavaPractice;

public class BinarSearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Elements should be sorted order
		int a[] = {1,2,3,4,5,6,7,8,9,10};
		int key = 2;
		
		int l = 0;
		int h = a.length-1;
		System.out.println("h "+h);
		int mid = (l+h)/2;
		System.out.println("mid "+mid);
		boolean flag =false;
		
		/*for(int i=0;i<a.length;i++)
		{
			if(a[mid]==key)
			{
				System.out.println("Found");
				flag = true;
				break;
			}
			if(a[mid]>key)
			{
				h=mid;
				mid = (l+h)/2;
			}
			if(a[mid]<key)
			{
				l=mid;
				mid = (l+h)/2;
				//a[mid]=l;
			}
		}*/
		
	   while(l<=h)
		{
			int m = (l+h)/2;
			
			if(a[m]==key)
			{
				System.out.println("Found....");
				flag =true;
				break;
			}
			if(a[m]<key)
			{
				l=m+1;
					
			}
			if(a[m]>key)
			{
				h=m-1;
				
			}
		}
		if(flag==false)
		{
			System.out.println("Number Not found...");
		}

	}

}
