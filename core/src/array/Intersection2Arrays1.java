package array;

import java.util.Arrays;
import java.util.HashSet;

//Write a java program to find the intersection of two arrays?
//Using Iterative Method
public class Intersection2Arrays1 {
	public static void main(String[] args) {
		String[] inputArray1 = { "ONE", "TWO", "THREE", "FOUR", "FIVE", "FOUR" };

		String[] inputArray2 = { "THREE", "FOUR", "FIVE", "SIX", "SEVEN", "FOUR" };

		HashSet<String> set = new HashSet<String>();

		for (int i = 0; i < inputArray1.length; i++) {
			for (int j = 0; j < inputArray2.length; j++) {
				if (inputArray1[i].equals(inputArray2[j])) {
					set.add(inputArray1[i]);
				}
			}
		}

		System.out.println("First Array : " + Arrays.toString(inputArray1));

		System.out.println("Second Array : " + Arrays.toString(inputArray2));

		System.out.println("Common Elements : " + set);
	}
}
