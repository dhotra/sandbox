package sandbox;

public class ArrayTraversal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// declares an array of integers
				int[] myintarray;
				// allocating memory for 5 integers
				myintarray = new int[5];
				// initialize the first element of an array
				myintarray[0] = 12;

				// initialize 2nd element of an array

				myintarray[1] = 34;

				// and so on..
				myintarray[2] = 8031;

				myintarray[3] = 324;
				myintarray[4] = 3089;

				// traversing through an array
				
				for(int arrayIndex=0; arrayIndex<myintarray.length;arrayIndex++){
					System.out.println("Element at index " + arrayIndex + ": " + myintarray[arrayIndex]);
				}

	}

}
