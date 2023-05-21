package collection;

import java.util.ArrayList;
import java.util.List;

public class ListToArray_String {
	public static void main(String[] args) {
		List<String> ls = new ArrayList<>();
		ls.add("K");
		ls.add("Yeswanth");
		ls.add("Reddy");
		
		String[] fin = ls.toArray(new String[ls.size()]);
		
		for(String s:fin){
			System.out.println(s);
		}
	}
}
