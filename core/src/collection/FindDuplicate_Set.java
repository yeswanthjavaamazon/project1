package collection;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class FindDuplicate_Set {
	public static void main(String[] args) {
//		List<Integer> list = new LinkedList<>();
		List<Integer> list = new ArrayList<>();
		list.add(5);
		list.add(3);
		list.add(10);
		list.add(3);
		list.add(102);
		list.add(1);
		list.add(10);
		
		System.out.println(findDuplicate(list));
	}
	
	public static Set<Integer> findDuplicate(List<Integer> numbers){
		final Set<Integer> set1 = new HashSet<>();
		final Set<Integer> set2 = new HashSet<>();
		
		for(Integer fin : numbers){
			if(!set1.add(fin)){
				set2.add(fin);
			}
		}
		return set2;
	}
}
