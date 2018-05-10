package sandbox;

public class ArrayTest {

	static int myArray[];

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int myArraySize = 10;
		CreateArray(myArraySize + 5);

		for (int i = 0; i < myArraySize; ++i)
			InsertElementAtIndex(i, i * 5);

		Print();
		AdjustedInsert(5, 42);
		Print();
	}

	static void CreateArray(int size) {
		myArray = new int[size];
		System.out.println("Created an empty array of size " + size);
	}

	static void InsertElementAtIndex(int index, int value) {
		myArray[index] = value;
	}

	static void Print() {
		// System.out.println("Print Arrray: ");
		for (int i = 0; i < myArray.length; ++i)
			System.out.print(myArray[i] + " ");
		System.out.println();
	}

	static void AdjustedInsert(int index, int value) {
		for (int i = myArray.length - 1; i > index; --i)
			myArray[i] = myArray[i - 1];
		myArray[index] = value;
	}

	static void Delete(int index) {

	}
}
