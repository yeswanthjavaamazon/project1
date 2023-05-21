package array;

import java.util.Arrays;

public class MissingNumber {
	public static void main(String[] args) {
		int array[] = { 1, 3, 5 };
		Arrays.sort(array);
		findMissingNumber(array);
	}

	public static void findMissingNumber(int[] n) {
		int k[] = new int[n[n.length - 1]];
		int m = 0;

		if (n[0] != 1) {
			for (int x = 1; x < n[0]; x++) {
				k[m] = x;
				m++;
			}
		}

		for (int i = 0; i < n.length - 1; i++) {
			int j = i + 1;
			int difference = n[j] - n[i];

			if (difference != 1) {
				for (int x = 1; x < difference; x++) {
					k[m] = n[i] + x;
					m++;
				}
			}
		}

		for (int l = 0; l < m; l++) {
			System.out.println(k[l]);
		}
	}
}
