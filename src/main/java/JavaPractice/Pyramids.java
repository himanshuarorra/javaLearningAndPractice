package JavaPractice;

import java.util.Scanner;

public class Pyramids {
	public static void main(String[] args) {
		// take input
		//		Scanner scan = new Scanner(System.in);
		//		System.out.println("Enter string: "); 
		//		String a = scan.nextLine();
		int b = 5;
		int n=1;

		/*
		 * * 
		 * * 
		 * * * 
		 * * * * 
		 * * * * *
		 */
		//Normal pyramid
		for(int i=1;i<=b;i++) {

			for(int j=1;j<=i;j++) {

				System.out.print("* ");

			}
			System.out.println();
		}

//		E D C B A 
//		E D C B A 
//		E D C B A 
//		E D C B A 
//		E D C B A 
		//Normal char pyramid
		for(char i='E';i>='A';i--) {
			for(char j='E';j>='A';j--) {
				System.out.print(j+" ");

			}
			System.out.println();

		}

		//Normal pyramid
		for(int i=1;i<=b;i++) {

			for(int j=1;j<=i;j++) {

				System.out.print(i+" ");

			}
			System.out.println();
		}

		//Floyd's triangle
		for(int i=0;i<5;i++) {

			for(int j=1;j<=i;j++) {

				System.out.print(n + " ");
				++n;
			}
			System.out.println();
		}

		//Inverted pyramid
		for(int i=1;i<=5;i++) {

			for(int j=5;j>=i;j--) {

				System.out.print(j+" ");

			}
			System.out.println();
		}

		//Inverted pyramid with space
		for(int i=1;i<=5;i++) {

			for(int j=5;j>=1;j--) {

				if(j>i) {
					System.out.print(" ");
				}
				if(j<=i) {
					System.out.print(i);
				}

			}

			System.out.println();
		}

		//Inverted pyramid with space
		for(int i=5;i>=1;i--) {

			for(int j=1;j<=5;j++) {

				if(j<i) {
					System.out.print(" ");
				}
				if(j>=i) {
					System.out.print(j);
				}

			}

			System.out.println();
		}


		/*
		 *5 5 5 5 5 
		 *  4 4 4 4
		 *    3 3 3
		 *      2 2
		 *        1   
		 */
		//Inverted pyramid with space
		for(int i=5;i>=1;i--) {

			for(int j=1;j<=5;j++) {

				if(i>=j) {
					System.out.print(i+" ");
				}
				if(j>=i) {
					//System.out.print(j);
				}

			}

			System.out.println();
		}

	}

}
