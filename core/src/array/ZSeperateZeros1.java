package array;

import java.util.Arrays;

//Write a java program to separate zeros from non-zeros in an integer array?
//Moving Zeros To End Of An Array :
public class ZSeperateZeros1 {
	static void moveZerosToEnd(int inputArray[]) {
		System.out.println("Input Array : " + Arrays.toString(inputArray));

		// Initializing counter to 0

		int counter = 0;

		// Traversing inputArray from left to right

		for (int i = 0; i < inputArray.length; i++) {
			// If inputArray[i] is non-zero

			if (inputArray[i] != 0) {
				// Assigning inputArray[i] to inputArray[counter]

				inputArray[counter] = inputArray[i];

				// Incrementing the counter by 1

				counter++;
			}
		}

		// Assigning zero to remaining elements

		while (counter < inputArray.length) {
			inputArray[counter] = 0;

			counter++;
		}

		System.out.println("Input Array After moving zeros to end :");

		System.out.println(Arrays.toString(inputArray));

		System.out.println("======================================");
	}

	public static void main(String[] args) {
		moveZerosToEnd(new int[] { 12, 0, 7, 0, 8, 0, 3 });

		moveZerosToEnd(new int[] { 1, -5, 0, 0, 8, 0, 1 });

		moveZerosToEnd(new int[] { 0, 1, 0, 1, -5, 0, 4 });

		moveZerosToEnd(new int[] { -4, 1, 0, 0, 2, 21, 4 });
	}
}
