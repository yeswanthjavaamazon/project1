package collection;

import java.util.ArrayList;

public class ArrayList_Duplicates_Logic {
	public static void main(String[] args) {
		ArrayList<Integer> al = new ArrayList<>();
		al.add(3);
		al.add(2);
		al.add(3);

		for (int i = 0; i < al.size(); i++) {
			for (int j = i + 1; j < al.size(); j++) {
				if (al.get(i).equals(al.get(j))) {
					al.remove(j);
					j--;
				}
			}
		}
		System.out.println(al);
	}
}