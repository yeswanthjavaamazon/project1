package array;

import java.util.Arrays;
import java.util.HashMap;

//Write a java program to count occurrences of each element in an array?
public class CountOccurrences {
	static void arrayElementCount(int inputArray[]) {
		// Creating a HashMap object with elements of inputArray as keys and their count
		// as values

		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();

		// checking every element of the inputArray

		for (int i : inputArray) {
			if (map.containsKey(i)) {
				// If element is present in elementCountMap, incrementing it's count by 1

				map.put(i, map.get(i) + 1);
			} else {
				// If element is not present in elementCountMap,
				// adding this element to elementCountMap with 1 as it's value

				map.put(i, 1);
			}
		}

		System.out.println("Input Array : " + Arrays.toString(inputArray));

		System.out.println("Element Count : " + map);

		System.out.println("=======================================");
	}

	public static void main(String[] args) {
		arrayElementCount(new int[] { 3, 5, 3, 5, 3, 7 });

		arrayElementCount(new int[] { 12, 9, 12, 9, 10, 9, 10, 11 });

		arrayElementCount(new int[] { 891, 187, 891, 187, 891, 476, 555, 741 });
	}
}
