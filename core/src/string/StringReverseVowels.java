package string;

public class StringReverseVowels {
	public static String reverseVOWELS(String string) {

		String vowels = "aeiouAEIOU";

		int lo = 0;
		int hi = string.length() - 1;
		char[] ch = string.toCharArray();

		while (lo < hi) {
			if (!vowels.contains(string.valueOf(string.charAt(lo)))) {
				lo++;
				continue;
			}
			if (!vowels.contains(string.valueOf(string.charAt(hi)))) {
				hi--;
				continue;
			}

			// swaping variables
			swap(ch,lo,hi);
			lo++;
			hi--;
		}
		return String.valueOf(ch);
	}

	private static void swap(char[] ch, int lo, int hi) {
		char temp = ch[lo];
		ch[lo] = ch[hi];
		ch[hi] = temp;
	}
	public static void main(String[] args) {
		System.out.println(reverseVOWELS("a1e2i3o"));
	}
}
