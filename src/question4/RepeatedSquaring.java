package question4;

public class RepeatedSquaring {
	
	//creating expBySquaring method
	public int expBySquaring(int x, int n) {
			
		//creating if statement if n is less than 0
		if (n < 0){
			return expBySquaring(1 / x, -n);
		}
			
		//creating else if statement (if n is 0 then return 1)
		else if (n == 0){
			return 1;
		}
			
		//creating else if statement (if n is 1 then return value of x)
		else if (n == 1){
			return x;
		}
			
		//creating else if statement (if the remainder of (x modulus 2 is 0) - i.e. if n is even
		else if (n % 2 == 0){
			return expBySquaring(x * x, n / 2);
		}
			
		//creating else statement if n is odd
		else {
			return x * expBySquaring(x * x, (n - 1) / 2);
		}
	}
}//End class