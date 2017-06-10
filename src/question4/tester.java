package question4;

import java.util.Scanner;

public class tester {

	public static void main(String[] args) {
			
		//Declaring and creating instance of the scanner class
		Scanner input = new Scanner(System.in);
			
		//Outputting name of program to Console for user
		System.out.println("Exponentiation by Squaring Algorithm Test\n");
			
		//Creating an object of RepeatedSquaring class//
		RepeatedSquaring rs = new RepeatedSquaring();

		//Output to prompt user
		System.out.println("\nFor (X ^ N) - Enter X: ");
		int x = input.nextInt(); //setting n to user input
			
		//Output to prompt user
		System.out.println("\nFor (X ^ N) - Enter N: ");
		int n = input.nextInt(); //setting k to user input
			
		/*
		 * creating int variable result and setting it to the returned value of expBySquaring method
		 * calling expBySquaring method and passing values 'N' & 'K'
		 */
		int result = rs.expBySquaring(x, n);
			
		//Outputting result variable to console
		System.out.println("\nResult : " + result);
		
		input.close(); //Close input to avoid possible leak
			
	}//End main method
}//End class