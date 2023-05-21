package array;

import java.util.Arrays;

//Write a java program to reverse an array without using an additional array?
public class ReverseArray {
	static void reverseArray(int inputArray[]) {
		System.out.println("Array Before Reverse : " + Arrays.toString(inputArray));

		int temp;

		for (int i = 0; i < inputArray.length / 2; i++) {
			temp = inputArray[i];

			inputArray[i] = inputArray[inputArray.length - i - 1];

			inputArray[inputArray.length - i - 1] = temp;
		}

		System.out.println("Array After Reverse : " + Arrays.toString(inputArray));

		System.out.println("=========================================");
	}

	public static void main(String[] args) {
		reverseArray(new int[] { 4, 5, 8, 9, 10 });

		reverseArray(new int[] { 12, 9, 21, 17, 33, 7 });

		reverseArray(new int[] { 891, 569, 921, 187, 343, 476, 555 });
	}
}
