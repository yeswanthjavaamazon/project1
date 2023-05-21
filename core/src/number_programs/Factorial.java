package number_programs;

public class Factorial {
	public static void main(String[] args) {
		System.out.println(factorial(5));
		System.out.println(fact(5));
		System.out.println(findFact3(5));
	}

	public static int factorial(int number) {
		if (number == 0) {
			return 1;
		}
		return number * factorial(number - 1);
	}

	public static int fact(int number) {
		int result = 1;
		while (number != 0) {
			result = result * number;
			number--;
		}
		return result;
	}

	private static int findFact3(int n) {
		int fact = 1;
		for(int i = 1;i<=n;i++) {
			fact *= i;
		}
		return fact;
	}
}