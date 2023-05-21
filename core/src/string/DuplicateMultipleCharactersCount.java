package string;

import java.util.Arrays;

public class DuplicateMultipleCharactersCount {

	public static void main(String[] args) {
//    String string = "check duplicate characters in string";
		String str = "yeswanthReddy";
		str = str.toLowerCase();
		char[] charAr = str.toCharArray();
		Arrays.sort(charAr); // addeehnrstwyy
		for (int i = 1; i < charAr.length - 1;) {
			int count = recursiveMethod(charAr, i, 1);
			if (count > 1) {
				System.out.println("'" + charAr[i] + "' comes " + count + " times");
				i = i + count;
			} else
				i++;

		}
	}

	public static int recursiveMethod(char[] charAr, int i, int count) {
		if (ifEquals(charAr[i - 1], charAr[i])) {
			count = count + recursiveMethod(charAr, ++i, count);
		}
		return count;
	}

	public static boolean ifEquals(char a, char b) {
		return a == b;
	}

}