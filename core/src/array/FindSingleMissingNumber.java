package array;

import java.util.Arrays;

//Write a java program to find a missing number in an integer array?
public class FindSingleMissingNumber {
	
	// Method to calculate sum of 'n' numbers
	static int sumOfNnumbers(int n) {
		int sum = (n * (n + 1)) / 2;
		return sum;
	}

	// Method to calculate sum of all elements of array
	static int sumOfElements(int[] array) {
		int sum = 0;
		for (int i = 0; i < array.length; i++) {
			sum = sum + array[i];
		}
		return sum;
	}
	// Below method also will work
//	static int sumOfElements(int[] array) {
//		int sum = 0;
//		for(int i : array) {
//			sum += i;
//		}
//		return sum;
//	}

	public static void main(String[] args) {
//		int[] a = { 1, 4, 5, 3, 2, 8, 6 };
		int[] a = {1,2,3,5,6};
		int n = a.length+1;
		System.out.println(n);
		int sumOfNnumbers = sumOfNnumbers(n);
		int sumOfElements = sumOfElements(a);
		int missingNumber = sumOfNnumbers - sumOfElements;
		System.out.println("Input Array : " + Arrays.toString(a));
		System.out.println("Missing Number is = " + missingNumber);
	}
}
