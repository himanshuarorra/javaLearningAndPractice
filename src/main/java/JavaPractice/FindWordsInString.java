package JavaPractice;

import java.util.Scanner;

public class FindWordsInString {
	
	public static void main(String args[]) {
		System.out.println("Enter the string");

		Scanner sc = new Scanner(System.in);
		
		String str = sc.nextLine();		//This is the string
		
		str = str.trim();
		
		int count = 1;
		
		for(int i=0;i<str.length()-1;i++) {
			if((str.charAt(i)==' ') && (str.charAt(i+1) != ' ')) {
				count++;
			}
		}
		
		System.out.println(count);
	}

}
