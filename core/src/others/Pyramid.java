package others;

public class Pyramid {
	public static void main(String[] args) {
		int n = 10;

		for (int i = 1; i < n; i++) {
			for (int j = 1; j <= n - 1; j++) {
				System.out.print(" ");
			}

			for (int k = 1; k <= i; k++) {
				System.out.print("" + k + " ");
			}

			for (int l = i - 1; l > 0; l--) {
				System.out.print("" + l + " ");
			}
			System.out.println();
		}
	}
}
