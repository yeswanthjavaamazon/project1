package java8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

//Input -> Hello how are you
//Output -> [Hello-how-are-you]
public class StringJoinerExample2 {
	public static void main(String[] args) {
		List<String> list = Arrays.asList("Hello", "How", "are", "you");
		String output = list.stream().collect(Collectors.joining("-", "[", "]"));
		System.out.println(output);
	}
}
