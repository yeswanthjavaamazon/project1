package array;

public class LargestIndex {
	public static void main(String[] args) {
		int array[] = { 10, 3, 12, 0, -1 };
		int largest = array[0];
		int secLargest = array[0];
		int smallest = array[0];
		int large_Index = 0;
		int sec_large_Index = 0;
		int small_Index = 0;

		for (int i = 0; i < array.length; i++) {
			if (array[i] > largest) {
				largest = array[i];
				large_Index = i;
			} else if (array[i] < smallest) {
				smallest = array[i];
				small_Index = i;
			} else if (array[i] > secLargest && array[i] != largest) {
				secLargest = array[i];
				sec_large_Index = i;
			}
		}
		System.out.println(large_Index + " " + largest);
		System.out.println(sec_large_Index + " " + secLargest);
		System.out.println(small_Index + " " + smallest);
	}
}
