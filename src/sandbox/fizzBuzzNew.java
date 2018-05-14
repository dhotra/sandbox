package sandbox;

public class fizzBuzzNew {
	
	/*
	 * 
	 */

	static int myArray[];

	public static void main(String[] args) {
		CreateAndPopulate(10, 15);
		FizzBuzz();
	}

	static public void CreateAndPopulate(int size, int multipier) {
		// TODO Auto-generated method stub
		myArray = new int[size];
		for (int i = 0; i < myArray.length; i++) {
			myArray[i] = i * multipier;
		}
	}

	static public void FizzBuzz() {
		// TODO Auto-generated method stub
		for (int i = 0; i < myArray.length; i++) {
			if (myArray[i] == 0)
				System.out.println(myArray[i] + " Nothing");
			else if (myArray[i] % 3 == 0 && myArray[i] % 5 == 0)
				System.out.println(myArray[i] + " FizzBuzz");
			else if (myArray[i] % 3 == 0)
				System.out.println(myArray[i] + " Fizz");
			else if (myArray[i] % 5 == 0)
				System.out.println(myArray[i] + " Buzz");

		}
	}
}
