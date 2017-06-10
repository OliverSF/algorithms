package question3;

import java.util.Scanner; //selecting and bringing in the scanner utility

public class LFibonacci {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in); //Declaring and creating instance of the scanner class
		
		//Output to console
		System.out.println("Welcome to the Fibonacci sequence generator\n");
		System.out.println("Non Recursive Method A: Enter number up to which the Fibonacci series should print: ");
		
		int number = input.nextInt(); //set number equal to value entered by user
		
		//creating for loop to pass arguments to method and output answers to console
		for(int counter = 0; counter<=number; counter++){
		System.out.println("The Fibonacci number at location " + counter + " is: " + fibonacciLoop(counter) + " " );
		}
		
		input.close(); //closing scanner to avoid possible leak
	}
	
	public static int fibonacciLoop(int num){
			
			//creating variables
			int fibo1 = 0;
			int fibo2 = 1;
			int fibonacci = 1;
			
			//creating for loop to calculate fibonacci sequence
			for(int i = 0; i<num; i++){
				fibo1 = fibo2;
				fibo2 = fibonacci;
				fibonacci = fibo1 + fibo2;
				
			}//End for loop
			return fibo1; //returning fibo11 as the solution		
	}
}//End class
