package sandbox;

public class ArrayPrimeNumber {

	// prime number: a number that is divisible only by itself and 1 (e.g.
	// 2, 3, 5, 7, 11).

	static int primearray[];

	public static void main(String[] args) {

		//createArray(10, 4);
		// primeNumberMethod();
		createPrimeArray(100);
		Print();
		
	}
	
	static void Print() {
		// System.out.println("Print Array: ");
		for (int i = 0; i < primearray.length; ++i)
			System.out.print(primearray[i] + " ");
		System.out.println();
	}
	static private void createPrimeArray(int n) {
		primearray = new int [n];
		int numPrimesFound = 0;
		for(int i=2; numPrimesFound<n; ++i){ //i denotes the natural number starting from 2 that we want to check whether it's prime or not
			boolean isPrime = true;
			for(int j=2; j<i; ++j){ //j denotes the divisor to divide i. it's value ranges from 2 to i-1
				if(i%j == 0){
					isPrime = false;
					break;
				}
			}
			if(isPrime == true){
				primearray[numPrimesFound] = i;
				++numPrimesFound;
			}
		}
	}


	private static void createArray(int size, int multipler) {
		primearray = new int[size];
		for (int i = 0; i < primearray.length; i++) {

			int value = i * multipler;

			if (value > 3) {
				for (int j = value - 1; j < value; j--) {
					if (j>3 && ((value) % (j) != 0)) {

						primearray[i] = value;
						
						System.out.println(primearray[i]);

					}
				}
			}
		}
	}
}

/**
 * private static void primeNumberMethod() {
 * 
 * for (int i = 0; i < primearray.length; i++) { if (primearray[i] == 0) {
 * System.out.println(primearray[i] + " nothing"); }
 * 
 * else if (primearray[i] % 1 == primearray[i] && primearray[i] % i == 1) {
 * 
 * System.out.println("number " + primearray[i] + "is a prime number");
 * 
 * } } }
 */
