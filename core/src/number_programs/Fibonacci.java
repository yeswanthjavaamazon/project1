package number_programs;

public class Fibonacci {
	public static void main(String[] args) {
		int n = 100;
		int n1 = 0;
		int n2 = 1;

		System.out.print(n1 + ", " + n2 + ", ");

		for (int i = 1; i <= n; i++) {
			int sum = n1 + n2;
			if (sum < n) {
				n1 = n2;
				n2 = sum;
				System.out.print(sum + ", ");
			}
		}
	}
}
