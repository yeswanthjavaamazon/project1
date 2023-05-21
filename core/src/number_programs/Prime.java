package number_programs;

public class Prime {
	public static boolean isPrimenumber(int number) {
		for (int i = 2; i <= number / 2; i++) {
			if (number % i == 0) {
				return false;
			}
		}
		return true;
	}

	public static void main(String[] args) {
		System.out.println("Is 17 prime number? " + isPrimenumber(5));
		System.out.println("Is 19 prime number? " + isPrimenumber(-10));
		System.out.println("Is 15 prime number? " + isPrimenumber(3));
	}
}
