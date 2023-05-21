package collection;

import java.util.ArrayList;
import java.util.List;

public class ArrayList_Duplicates_Logic_Single {
	public static void main(String[] args) {
		ArrayList<Integer> al = new ArrayList<>();
		al.add(3);
		al.add(2);
		al.add(3);
		List<Integer> uniqueList = new ArrayList<>();

		for (int i = 0; i < al.size(); i++) {
			if (!uniqueList.contains(al.get(i))) {
				uniqueList.add(al.get(i));
			}
		}
		System.out.println(uniqueList);
	}
}