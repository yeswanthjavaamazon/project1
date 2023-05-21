package string;

public class CheckIfStringContainsDigitsOnly {

	public static void main(String[] args) {
//		digitsOnlyString("111");
		digitsOnlyString("111a 1");
//		digitsOnlyString("111 222");
//		digitsOnlyString("111L");

	}

	@SuppressWarnings("unused")
	private static void digitsOnlyString(String inputString) {
		if (inputString.matches("\\d+"))
			System.out.println("Digit Only String ::" + inputString);

		try {
			long l = Long.parseLong(inputString);
			System.out.println("Digit Only String ::" + inputString);
		} catch (Exception e) {
			System.out.println("Non Digit Only String ::" + inputString);
		}

	}

}
