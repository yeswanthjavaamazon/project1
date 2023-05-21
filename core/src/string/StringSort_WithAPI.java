package string;

import java.util.Arrays;

public class StringSort_WithAPI {
	public static void main(String[] args) {
		String str = "cab";
		char[] ch = str.toCharArray();
		Arrays.sort(ch);
		System.out.println(ch);
	}
}
