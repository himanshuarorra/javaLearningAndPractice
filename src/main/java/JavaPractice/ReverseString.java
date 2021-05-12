package JavaPractice;

import java.util.Scanner;

public class ReverseString {

	public void Reverse(String string) {
		//First way
		String org = string;
		String res = "";
		for(int i=string.length()-1;i>=0;i--) {
			res = res + string.charAt(i);
		}
		
		/*char[] a = string.toCharArray();
		char[] res2 = a;
		for(int i = 0, j=string.length()-1;i>=string.length();i++,j--) {
			res2[i] = a[j];
		}*/
		
		//3rd way
		/*char[] c = string.toCharArray(); 
		int len = c.length;
		for(int i=len-1;i>=0;i--) {
			res = res+c[i];
		}*/
		
		//4th way
		//StringBuffer sb = new StringBuffer(string);
		//System.out.println("After reversing: " + sb.reverse());

		System.out.println("After reversing: " + res);
		//System.out.println(String.valueOf(res2));

		//Checking if palindrome
		if(org==res) {
			System.out.println("String is palindrome.");
		}
		else
		{
			System.out.println("Not Palindrome");
		}

	}

	public static void main(String[] args) {
		// take input
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter string: "); 
		String str = scan.nextLine();

		ReverseString r = new ReverseString();
		r.Reverse(str);
	}

}
