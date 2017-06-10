package question2;

import java.util.Scanner; //selecting and bringing in the scanner utility

public class QuickSort {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in); //Declaring and creating instance of the scanner class
		
		int size;
		
		//Output to console to prompt user
		System.out.println("Sorting Program using QuickSort!");
		System.out.println("Please enter the size of the Array to sort: ");
		size = input.nextInt(); //setting user input to variable 'size'
		
		int A[] = new int[size]; //creating array of size 'size'

		populateA(A); // method to populate the Array

		System.out.println("Before sorting: ");
		printA(A); // method to print the array A
		
		quickSort(A); //calling quickSort method and passing A as argument
		
		System.out.println("\n\nAfter Sorting: ");
		printA(A); //method to print the array A
		
		input.close(); //closing scanner to avoid possible leak
	}

	public static void quickSort(int array[]) {
		
		quickSort(array, 0, array.length - 1); // quicksort all the elements in the array
	}


	public static void quickSort(int array[], int start, int end){
	
	        int i = start; // setting 'i' to start (index 0)
	        int k = end; // setting 'k' to end (final index)

	        if (end - start >= 1){ // check that there are at least two elements to sort
	        
	                int pivot = array[start]; // set the pivot as the first element

	                while (k > i) { // while the k & i pointers have not met,
	                	
	                        while (array[i] <= pivot && i <= end && k > i) { 
	                                i++;                                     
	                        //from the left, look for the first element greater than the pivot
	                        }
	                        while (array[k] > pivot && k >= start && k >= i) {
	                            k--;                                        
	                        // from the right, look for the first element not greater than the pivot
	                        }
	                        
	                        if (k > i) {                                      
	                                swap(array, i, k);                      
	                        // if the left pointer is still smaller than the right index, swap the corresponding elements
	                        }
	                }
	                
	                swap(array, start, k); // swap the last element in the partition with the pivot 
	                
	                quickSort(array, start, k - 1); // quicksort the left partition
	                quickSort(array, k + 1, end);   // quicksort the right partition
	        }
	        
	        else // if there is only one element in the partition, do not do any sorting
	        {
	                return; // the array is sorted, so exit
	        }
	}

	public static void swap(int array[], int index1, int index2){ 
		
		int temp = array[index1];           // store the first value in a temp
		array[index1] = array[index2];      // copy the value of the second into the first
		array[index2] = temp;               // copy the value of the temp into the second
	}
	
	
	
	// method to print the Array
	public static void printA(int[] B) {
		
		//Creating for loop to traverse the Array
		for (int i = 0; i < B.length; i++) {
				System.out.print(B[i] + " "); //Printing out value at index 'i'
		}
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

