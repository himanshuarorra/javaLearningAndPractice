package JavaPractice;

import java.util.Arrays;
import java.util.Collections;

public class SortElementsInArrayUsingInBuiltMeth {
	
	public static void main(String ar[])
	{
		//way 1
		Integer a[] = {1,4,3,5,2};
		
		Arrays.parallelSort(a);
		System.out.print(Arrays.toString(a));
		
		//way 2
		Arrays.sort(a);
		
		Integer aa[] = {1,4,3,5,2};

		//descending order
		Arrays.sort(aa,Collections.reverseOrder());
	}

}
