package JavaPractice;

import java.util.Arrays;
import java.util.HashMap;

public class FindCharCountInString {
	public static void main(String[] args) {
		String str = "TThis is a javvva program";
		str = str.replaceAll(" ", "");
		//Method 1
		HashMap <Character, Integer> hMap = new HashMap<Character, Integer>();
		for (int i = str.length() - 1; i >= 0; i--) {
			if (hMap.containsKey(str.charAt(i))) {
				int count = hMap.get(str.charAt(i));
				hMap.put(str.charAt(i), ++count);
			} else {
				hMap.put(str.charAt(i),1);
			}
		}
		for (Character name: hMap.keySet()) {
			String key = name.toString();
			String value = hMap.get(name).toString();
			System.out.println(key + " " + value);
		}

		//Method 2
		str = str.toLowerCase();
		char[] st = str.toCharArray();
		Arrays.sort(st);
		HashMap<Character, Integer> hm = new HashMap<Character,Integer>();
		System.out.println(st);
		int count = 1;	//aajv
		for(int j = 1;j<st.length;j++)
		{
			if(st[j]==st[j-1])
			{
				count++;
			}
			else
			{
				System.out.println( st[j-1]+" " +count);
				count=1;
			}
			
		}
		System.out.println(st[st.length-1]+ " "+count);
		
		
		//
		
	}
}