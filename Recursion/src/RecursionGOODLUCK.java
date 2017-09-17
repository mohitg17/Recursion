
public class RecursionGOODLUCK {

	public static int Summation(int n) {
		// Base Case: We are at the end
		if (n <= 0) {
			return 0; // additive identity property
		} 
		// Recursive Case: Keep going
		else {
			return n + Summation(n-1);
		}
	}
	
	
	public static int Factorial(int n) {
		// Base Case
		if (n <= 1) {
			return 1;
		}
		// Recursive Case
		else {
			return n * Factorial(n-1);
		}
	}
	
	
	public static int Exponentiation(int n, int p) {
		// Base Case
		if (p <= 0) { // multiplicative identity
			return 1;
		}
		// Recursive Case
		else { 
			return n * Exponentiation(n, p-1);
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(Summation(3));
		System.out.println(Factorial(4));
		System.out.println(Exponentiation(5, 3));
	}

}
