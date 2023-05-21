package number_programs;

public class BubbleSort {
	public static void main(String[] args) {
		int array[] = { 4, 2, 5, 6, 9, 1 };

		for (int i = array.length; i > 0; i--) {
			for (int j = 0; j < array.length - 1; j++) {
				int k = j + 1;
				if (array[j] > array[k]) {
					int temp = array[j];
					array[j] = array[k];
					array[k] = temp;
				}
			}
			for (int z = 0; z < array.length; z++) {
				System.out.print(array[z] + ",");
			}
			System.out.println();
		}
	}
}