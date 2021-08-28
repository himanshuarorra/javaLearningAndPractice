package JavaPractice;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map.Entry;

public class FindDupicateCharsInString {
	public static void main(String[] args) {
		String str = "himaanshuu arora";
		str = str.replaceAll(" ", "");

		//Method 2
		str = str.toLowerCase();
		char[] st = str.toCharArray();
		Arrays.sort(st);
		HashMap<Character, Integer> hm = new HashMap<Character,Integer>();
		System.out.println(st);
		int count = 1;	//aajv
		for(int j = 1;j<st.length-1;j++)
		{
			if(st[j]==st[j+1])
			{
				count++;
				hm.put(st[j], count);
			}
			else
			{
				System.out.println( st[j]+" " +count);
				count=1;
			}
			
		}
		System.out.println(st[st.length-1]+ " "+count);
		
		
		//
		for(Entry<Character, Integer> e : hm.entrySet()) {
			
			if(e.getValue()>1)
			{
				System.out.println("Duplicate char: "+e.getKey());
			}
		}
		
	}
}