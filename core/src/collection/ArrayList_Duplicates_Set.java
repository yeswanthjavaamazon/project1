package collection;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class ArrayList_Duplicates_Set {
	public static void main(String[] args) {
		ArrayList<Integer> al = new ArrayList<>();
		al.add(3);
		al.add(2);
		al.add(3);
//		Set<Integer> set = new HashSet<>(al);
//		System.out.println(set);
		Set<Integer> set = new HashSet<>();
		set.addAll(al);
		al.clear();
		al.addAll(set);
		
		System.out.println(al);
	}
}
