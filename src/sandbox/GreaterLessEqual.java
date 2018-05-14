package sandbox;

public class GreaterLessEqual {

	// 0 12 34 2 56 56 14 35
	// 35- great; 14-less ; 56: eq; 56-great; 2-less;34-great;12-great; 0:less

	static int myNewArray[] = { 45, 20, 31, 14, 51, 61, 61, 61, 9 };

	public static void main(String[] args) {

		Print();
		createNumCheckArray();

	}

	static void Print() {
		// System.out.println("Print Array: ");
		for (int i = 0; i < myNewArray.length; ++i)
			System.out.print(myNewArray[i] + " ");
		System.out.println("");

	}

	static void createNumCheckArray() {

		System.out.println(myNewArray[0] + " :First element");

		for (int i = 1; i < myNewArray.length; i++) {

			if (myNewArray[i] < myNewArray[i - 1]) {
				System.out.println(myNewArray[i] + " :Less than the previous value");

			}

			else if (myNewArray[i] > myNewArray[i - 1]) {
				System.out.println(myNewArray[i] + " :Greater than the previous value");

			} else if (myNewArray[i] == myNewArray[i - 1]) {
				System.out.println(myNewArray[i] + " :Equal to the previous value");

			}

		}

	}

}
