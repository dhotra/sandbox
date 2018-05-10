package sandbox;

public class insertRandomElementsInArray {

	public static void main(String[] args) {
		// declare an array

				int[] myIntArray;

				// allocate memory using new keyword

				myIntArray = new int[10];

				// a variable is defined to store the results

				int insertedValue = 1;

				for (int arrayindexLocation = 0; arrayindexLocation < myIntArray.length; arrayindexLocation++) {

					// At the first step: inserted value is 0 and arrayIndexLocation is
					// also 0.
					myIntArray[arrayindexLocation] = insertedValue;

					insertedValue *= 5;	
					
					System.out.println(
							"Added values in array at index location " + arrayindexLocation + " is : " + insertedValue);

	}
	}
}
