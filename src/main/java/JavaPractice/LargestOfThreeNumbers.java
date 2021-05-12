package JavaPractice;

public class LargestOfThreeNumbers {

	public static void main(String ar[]) {
		int a=33;
		int b=221;
		int c=333;

		if(a>b && a>c) {
			System.out.println("Largest number is: "+a);
		}
		else if(b>c) {
			System.out.println("Largest number is: "+b);
		}
		else {
			System.out.println("Largest number is: "+c);
		}
	}

}
