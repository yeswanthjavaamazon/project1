package collection;

import java.util.Comparator;
import java.util.TreeSet;

public class ComparatorExample {
	public static void main(String[] args) {
		TreeSet<Integer> t = new TreeSet<>(new MyComparator());
		t.add(10);
		t.add(0);
		t.add(20);
		t.add(0);
		t.add(0);

		System.out.println(t);
	}
}

class MyComparator implements Comparator {

	@Override
	public int compare(Object obj1, Object obj2) {
		Integer i1 = (Integer) obj1;
		Integer i2 = (Integer) obj2;

		if (i1 < i2) {
			return +1;
		} else if (i1 > i2) {
			return -1;
		} else {
			return 0;
		}
	}
}
