package array;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Remove_Duplicates_String_Set {
	public static void main(String[] args) {
		String array[] = {"a","a","b"};
		
		List<String> list = Arrays.asList(array);
		Set<String> set = new HashSet<>(list);
		
		String s[] = new String[set.size()];
		set.toArray(s);
		
		for(String ss : s){
			System.out.print(ss);
		}
	}
}
