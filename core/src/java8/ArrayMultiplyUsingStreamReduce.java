package java8;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class ArrayMultiplyUsingStreamReduce {
	public static void main(String[] args) {
		Integer[] inputArray = { 1, 2, 3, 4, 5 };
		List<Integer> numberList = Arrays.asList(inputArray);
		Optional<Integer> output = numberList.stream().reduce((a, b) -> a * b);
		if (output.isPresent()) {
			System.out.println(output.get());
		} else {
			System.out.println("Empty Array");
		}
	}
}
