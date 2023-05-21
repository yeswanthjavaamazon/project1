package string;

public class RemoveCharFromString {

	public static void main(String[] args) {

		removeCharFromString("abcbcdjfkd", 'c');
		removeCharFromString("Pankaj", 'a');

	}

	private static void removeCharFromString(String input, char c) {
		String result = input.replaceAll(String.valueOf(c), "");
		System.out.println(result);
	}

}
