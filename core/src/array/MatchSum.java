package array;

import java.util.Arrays;

//Write a java program to find all pairs of elements in an integer array whose sum is equal to a given number?
public class MatchSum {
	static void findThePairs(int inputArray[], int inputNumber) {
		System.out.println("Input Array : " + Arrays.toString(inputArray));

		System.out.println("Input Number : " + inputNumber);

		System.out.println("Pairs of elements whose sum is " + inputNumber + " are : ");

		for (int i = 0; i < inputArray.length; i++) {
			for (int j = i + 1; j < inputArray.length; j++) {
				if (inputArray[i] + inputArray[j] == inputNumber) {
					System.out.println(inputArray[i] + " + " + inputArray[j] + " = " + inputNumber);
				}
			}
		}

		System.out.println("======================================");
	}

	public static void main(String[] args) {
		findThePairs(new int[] { 4, 6, 5, -10, 8, 5, 20 }, 10);
	}
}
