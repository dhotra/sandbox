package com.arrayPackage;

public class InsertingElementsInArrays {

	public static void main(String[] args) {

		// declare an array

		int[] myIntArray;

		// allocate memory using new keyword

		myIntArray = new int[10];

		// a variable is defined to store the results

		int insertedValue = 0;

		for (int arrayindexLocation = 0; arrayindexLocation < myIntArray.length; arrayindexLocation++) {

			// At the first step: inserted value is 0 and arrayIndexLocation is
			// also 0.
			myIntArray[insertedValue] = arrayindexLocation;

			insertedValue++;			// inserted value is 1 first time in the loop.

			System.out.println(
					"Added values in array at index location " + arrayindexLocation + " is : " + insertedValue);

		}

	}

}
