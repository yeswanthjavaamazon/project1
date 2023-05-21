package array;

import java.util.Arrays;
import java.util.List;

public class ArraysToList {
	public static void main(String[] args) {

//		int[] intArray = {1,2,3};
//		Integer[] what = Arrays.stream( intArray ).boxed().toArray( Integer[]::new );

		String[] str = { "A", "B", "C" };
		System.out.println(Arrays.toString(str));

		List<String> list = Arrays.asList(str);
		System.out.println(list);
	}
}
