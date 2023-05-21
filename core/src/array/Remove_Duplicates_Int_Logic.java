package array;
// Yeswanth this solution is not working foe below input
// int[] array = {10,20,10,20,30};
public class Remove_Duplicates_Int_Logic {
	public static void main(String[] args) {
		int array[] = { 1, 2, 1, 2, 3 };
		int length = array.length;

		for (int i = 0; i < length; i++) {
			for (int j = i + 1; j < length; j++) {
				if (array[i] == array[j]) {
					while (j < (length) - 1) {
						array[j] = array[j + 1];
						j++;
					}
					length--;
				}
			}
		}

		for (int k = 0; k < length; k++) {
			System.out.print(array[k]);
		}
	}
}