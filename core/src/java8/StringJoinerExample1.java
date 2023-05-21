package java8;

import java.util.StringJoiner;

//Input -> Hello how are you
//Output -> [Hello-how-are-you]
public class StringJoinerExample1 {
	public static void main(String[] args) {
		String input = "Hello How are you";
		String[] words = input.split(" ");
		StringJoiner joiner = new StringJoiner("-", "[", "]");
		for (String word : words) {
			joiner.add(word);
		}
		System.out.println(joiner);
	}
}
