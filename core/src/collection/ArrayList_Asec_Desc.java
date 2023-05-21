package collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;

public class ArrayList_Asec_Desc {
	public static void main(String[] args) {
		ArrayList<Integer> al = new ArrayList<>();
		al.add(1);
		al.add(3);
		al.add(2);
		Comparator desc = Collections.reverseOrder();
		Collections.sort(al,desc);
		Iterator itr = al.iterator();
		while(itr.hasNext()){
			System.out.println(itr.next());
		}
		
	}
}
