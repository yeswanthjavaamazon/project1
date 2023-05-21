package array;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Remove_Duplicates_Int_Set {
	public static void main(String[] args) {
		Integer array[] = { 1, 2, 1, 3 };

		List<Integer> list = Arrays.asList(array);
		Set<Integer> set = new HashSet<>(list);

		Integer i[] = new Integer[set.size()];
		set.toArray(i);

		for (Integer a : i) {
			System.out.print(a + " ");
		}
	}
}