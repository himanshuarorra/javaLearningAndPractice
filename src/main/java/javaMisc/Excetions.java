package javaMisc;

public class Excetions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=4;
		int b=3;
		int c=0;
		int d[] = new int[5];


		try {
			//int k = b/c;
			//System.out.println(k);
			System.out.println(d[6]);
		}

		//ArithmaticException divide by zero
		catch(ArithmeticException et) {
			System.out.println("Caught ArithmeticException exception");
		}

		//Index Out Of Bounds Exception
		catch(IndexOutOfBoundsException ets) {
			System.out.println("Caught IndexOutOfBoundsExceptions exception");
		}

		//Normal exception
		catch(Exception e) {
			System.out.println("Caught exception");
		}

		/*
		 * Finally block will always execute even if ther's an exception
		 *------We can avert execution of finally o block by program termination resulting jvm crash 
		 *------*by hitting stop button during execution
		 *------*By using ===System.exit()====
		 *A finally block will not execute due to other conditions like 
		 *when JVM runs out of memory when our java process is killed forcefully
		 * from task manager or console when our machine shuts down due to power 
		 * failure and deadlock condition in our try block
		 */
		finally {
			System.out.println(a);
			System.out.println(b);
			System.out.println(c);

			
		}


	}

}
