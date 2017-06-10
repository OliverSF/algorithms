package question3;

import java.util.Scanner; //selecting and bringing in the scanner utility

public class RFibonacci {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		//Output to console
		System.out.println("Welcome to the Fibonacci sequence generator\n");
		System.out.println("Recursive Method B: Enter number up to which the Fibonacci series should print: ");
		
		//setting user input to 'number'
		long number = input.nextLong();
		
		//Output to console
		System.out.println("\n- Provided Numer: " + number + " - ");
		
		//Creating for loop to output to console and pass values to fibonacciRecursion method
		for(int counter = 0; counter<= number; counter++){
			System.out.println("The Fibonacci number at location " + counter + " is: " + fibonacciRecursion(counter) + " ");
		}
		
		input.close(); //close input to avoid possible leak
	}
	public static long fibonacciRecursion(long i){
		
		//creating if statement for when values are equal to 0 or 1
		if(i == 0 || i == 1){
			return i; 
		}
		
		else {
			return fibonacciRecursion(i - 1) + fibonacciRecursion(i -2); //recursion
		}
	}

}//End class
