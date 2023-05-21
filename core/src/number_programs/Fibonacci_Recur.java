package number_programs;

public class Fibonacci_Recur {
	public static void main(String[] args) {
		int n = 100;
		findFibonacci(0, 1, n);
	}

	public static void findFibonacci(int n1, int n2, int n) {
		if (n1 == 0) {
			System.out.print(n1 + " " + n2 + ", ");
		}
		int sum = n1 + n2;
		if (sum < n) {
			n1 = n2;
			n2 = sum;
			System.out.print(sum + ", ");
			findFibonacci(n1, n2, n);
		}
	}
}