package java8;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class RemoveDuplicatesFromList {
	public static void main(String[] args) {
		// METHOD 1
		Integer[] arr1 = new Integer[] { 1, 2, 3, 4, 3, 2, 4, 2 };
		List<Integer> listWithDuplicates1 = Arrays.asList(arr1);
		Set<Integer> setWithoutDups = listWithDuplicates1.stream().collect(Collectors.toSet());
		setWithoutDups.forEach((i) -> System.out.print(" " + i));

		// METHOD 2
		Integer[] arr2 = new Integer[] { 1, 2, 3, 4, 3, 2, 4, 2 };
		List<Integer> listWithDuplicates2 = Arrays.asList(arr2);
		List<Integer> listWithoutDups = listWithDuplicates2.stream().distinct().collect(Collectors.toList());
		listWithoutDups.forEach((i) -> System.out.print(" " + i));
	}
}
