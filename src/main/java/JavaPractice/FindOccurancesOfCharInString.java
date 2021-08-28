package JavaPractice;

import java.util.ArrayList;
import java.util.List;

public class FindOccurancesOfCharInString {
	
	public static void main(String ar[])
	{
		String n = "This is a string";
		String[] st = n.split(" ");
		for(int i=0;i<st.length;i++) {
		System.out.println(st[i]);
		}
		
		String a = "aaabbbbca";
		char[] b = a.toCharArray();
		//List<Char> l = new ArrayList<String>();
		int count =0;
		for(int i=0;i<b.length;i++)
		{
			count++;
			//l.add(b[i]);
			
			for(int j=i+1;j<b.length;j++)
			{
				if(b[i]==b[j])
				{
					count++;
				}
				if(j==b.length-1)
				{
					System.out.print(b[i]+" "+count);
					count = 1;
				}
			}
		
		}
	};

}
