package number_programs;

public class Prime_Range {
	public static void main(String[] args) {

		int low = 0, high = 12;

		while (low < high) {
			boolean isPrime = true;

			for (int j = 2; j <= low / 2; ++j) {
				// condition for nonprime number
				if (low % j == 0) {
					isPrime = false;
					break;
				}
			}

			if (isPrime)
				System.out.print(low + " ");

			++low;
		}
	}
}