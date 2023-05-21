package java8;

import java.util.Arrays;
import java.util.function.Supplier;
import java.util.stream.Stream;

public class StreamResuse {
	public static void main(String[] args) {
		String[] inputArray = {"Amit", "ball","call","Amit","egg"};
//		Stream<String> inputStream = Arrays.asList(inputArray).stream();
//		inputStream.forEach(k->System.out.println(k));
//		//Here we are trying to reuse the streams [But not correct]
//		long count = inputStream.filter(x->"Amit".equals(x)).count();
//		System.out.println(count);
		
		//Solution
		Supplier<Stream<String>> inputStream = ()->Stream.of(inputArray);
		inputStream.get().forEach(k->System.out.println(k));
		long count = inputStream.get().filter(x->"Amit".equals(x)).count();
		System.out.println(count);
	}
}
