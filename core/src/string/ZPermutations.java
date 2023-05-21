package string;

public class ZPermutations {
	static public void stringPermutation(String str) {
		stringPermutation("", str);
	}

	private static void stringPermutation(String permutation, String str) {
		if (str.length() == 0) {
			System.out.println(permutation);
		} else {
			for (int i = 0; i < str.length(); i++) {
				stringPermutation(permutation + str.charAt(i),
						str.substring(0, i) + str.substring(i + 1, str.length()));
			}
		}
	}

	public static void main(String[] args) {
		stringPermutation("JSP");
	}
}
