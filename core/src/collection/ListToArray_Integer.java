package collection;

import java.util.ArrayList;
import java.util.List;

public class ListToArray_Integer {
	public static void main(String[] args) {
		List<Integer> li = new ArrayList<>();
		li.add(1);
		li.add(2);
		li.add(3);
		System.out.println(li);
		
		Object[] integers = li.toArray();
		int[] intarray = new int[integers.length];
		int i = 0;
		for(Object n : integers){
			intarray[i++] = (Integer) n;
			System.out.println(i);
		}
	}
}
