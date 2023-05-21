
package array;

import java.util.Arrays;

public class CalculateMedianfromArray {
	public static void main(String arg[]) {
		int sequence[] = new int[] { 10, 30, 40, 20 };
//		sequence[0] = 10;
//		sequence[1] = 20;
//		sequence[2] = 30;
//		sequence[3] = 40;
//		sequence[4] = 50;

		System.out.println("Median :" + median(sequence));
	}

	private static double median(int[] sequence) {

		int arrayLength = sequence.length;

		// First we sort the array
		Arrays.sort(sequence);

		// check for even case
		if (arrayLength % 2 != 0)
			return (double) sequence[arrayLength / 2];

		return (double) (sequence[(arrayLength - 1) / 2] + sequence[arrayLength / 2]) / 2.0;
//        System.out.println((intArray[length/2] + intArray[(length-1)/2])/2);
	}
}