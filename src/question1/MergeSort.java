package question1;

import java.util.Scanner; //selecting and bringing in the scanner utility

public class MergeSort {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in); //Declaring and creating instance of the scanner class
		
		//creating a variable 'size'
		int size;
		
		//Output to console to prompt user
		System.out.println("Sorting Program using MergeSort!");
		System.out.println("Please enter the size of the Array to sort: ");
		size = input.nextInt(); //setting user input to variable 'size'
		
		int A[] = new int[size]; //creating array of size 'size'

		populateA(A); // method to populate the Array

		System.out.println("Before sorting: ");
		printA(A); // method to print the array A

		A = mergeSort(A); // method to sort the Array 'A'

		System.out.println("\n\nAfter Sorting: ");
		printA(A); //method to print the array A
		
		input.close(); //closing scanner to avoid possible leak
	}

	// Method to break the Array 'A' up into individual elements
	public static int[] mergeSort(int[] B) {

		if (B.length <= 1) {
			return B; // to check if there is only one element in the array; if there is return as one element is always sorted
		}

		int midpoint = B.length / 2; // dividing the Array in half until single element
		
		//creating 2 sub arrays 1 left & 1 right
		int[] left = new int[midpoint]; //creating new array called left of size 'midpoint'
		int[] right; 

		if (B.length % 2 == 0) { //checking if the array of an even length
			right = new int[midpoint]; //if it is then midpoint can be used for right 
		}

		else {
			right = new int[midpoint + 1]; //if array is an odd length, makes an array of size midpoint + 1
		}

		int[] result = new int[B.length]; //creates an array of the full size to hold sorted result

		for (int i = 0; i < midpoint; i++) { //to populate left hand side Array with elements from 0 - midpoint
			left[i] = B[i];
		}

		int x = 0; //to start at x as it's after the midpoint
		for (int j = midpoint; j < B.length; j++) { 
									
			if (x < right.length) { //traverses until it finishes right array
				right[x] = B[j]; //to populate right array from index 0 to midpoint
				x++;
			} //end if statement
		} //end for loop

		left = mergeSort(left); 	// recursion to break left down to individual elements
		right = mergeSort(right); 	// recursion to break right down to individual elements
		result = merge(left, right); //brings the result of both left & right arrays together

		return result;
	}
	
	//merging method
	public static int[] merge(int[] left, int[] right) {

		// declaring variables
		int lengthResult = left.length + right.length; // getting size for the result Array
		//result = totals of left and right arrays combined												
		int[] result = new int[lengthResult]; // creating array of that size
		
		int indexL = 0;
		int indexR = 0;
		int indexRes = 0;
		
		//while loop to continue as long as there are still elements on the left or right														
		while (indexL < left.length || indexR < right.length) { 

			if (indexL < left.length && indexR < right.length) {
			//check to be sure that there are elements on both sides of the array for either then both
				if (left[indexL] <= right[indexR]) {
				//if left is less than right then put left first in the result index then update result array
					result[indexRes] = left[indexL];
					indexL++;
					indexRes++;
				} else {
					result[indexRes] = right[indexR]; //if right is bigger put right first then update result array
					indexR++;
					indexRes++;
				}
			} else if (indexL < left.length) { //for when one is finished we keep adding from other array
				result[indexRes] = left[indexL];
				indexL++;
				indexRes++;
			}

			else if (indexR < right.length) { //for when one is finished we keep adding from other array
				result[indexRes] = right[indexR];
				indexR++;
				indexRes++;
			}

		}
		return result; //return sorted array
	}

	// method to print the Array
	public static void printA(int[] B) {
		
		//for loop to traverse the array
		for (int i = 0; i < B.length; i++) {
			System.out.print(B[i] + " ");
		}//end for loop
	}

	// method to populate the Array 'A'
	public static int[] populateA(int[] B) {
		
		Scanner input2 = new Scanner(System.in); //Declaring and creating instance of the scanner class
		
		//Output to console to prompt user
		System.out.println("Please enter the numbers in your Array: ");
		
		//Creating for loop to populate the array
		for (int i = 0; i < B.length; i++) {
			
			//setting Array at index 'i' to user input
			B[i] = (int) (input2.nextInt());
		}
		input2.close(); //close input to avoid possible leak
		return B; //return populated array
	}
	
}//End class