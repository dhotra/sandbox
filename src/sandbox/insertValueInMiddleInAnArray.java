package sandbox;

public class insertValueInMiddleInAnArray {

	public static void main(String[] args) {

		int[] myIntArray;

		myIntArray = new int[6];

		int indexname = 2;
		int incrementValue= 3;
		int insertedValue = 0;

		for (int i = 0; i < myIntArray.length - 1; i++) {

			myIntArray[insertedValue] = insertedValue;

			insertedValue++;

			System.out.println("inserted value at array index  " + i + " is :" + insertedValue);

		}

		for (int j = incrementValue; j < myIntArray.length; j++) {

			myIntArray[j] = myIntArray[j - 1];
		}
System.out.println("***************************");
		myIntArray[indexname] = 30;
		for (int j = 0; j <myIntArray.length; j++) {
			System.out.println("inserted value at array index " + j + " is :" + myIntArray[j]);
	}

}}
