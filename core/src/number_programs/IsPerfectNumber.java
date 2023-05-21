package number_programs;

public class IsPerfectNumber {
	public boolean isPerfectNumber(int number) {
		int temp = 0;
		for (int i = 1; i <= number / 2; i++) {
			if (number % i == 0) {
				temp += i;
			}
		}
		if (temp == number) {
			System.out.println("It is a Perfect Number");
			return true;
		} else {
			System.out.println("It is not a Perfect Number");
			return false;
		}
	}

	public static void main(String args[]) {
		IsPerfectNumber ipn = new IsPerfectNumber();
		System.out.println("Is Perfect number : " + ipn.isPerfectNumber(28));
	}
}
