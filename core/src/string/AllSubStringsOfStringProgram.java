package string;

public class AllSubStringsOfStringProgram {

	public static void main(String[] args) {
		String inputString = "java";
		for (int i = 0; i < inputString.length(); i++) {
			for (int j = i + 1; j <= inputString.length(); j++) {
				System.out.println(inputString.substring(i, j));
			}
		}
	}
}
