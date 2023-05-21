package collection;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class FindDuplicate_List {
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(1);
		list.add(3);
		FindDuplicate_List dl = new FindDuplicate_List();
//		System.out.println(dl.findDuplicateNumber(list));
		System.out.println(dl.findDuplicates(list));
	}

	public int getSum(List<Integer> list) {
		int sum = 0;
		for (Integer num : list) {
			sum = sum + num;
		}
		return sum;
	}

	public int findDuplicateNumber(List<Integer> numbers) {
		int highest = numbers.size() - 1;
		int total = getSum(numbers);
		int duplicate = total - (highest * (highest + 1) / 2);
		return duplicate;
	}

	public Set<Integer> findDuplicates(List<Integer> listContainingDuplicates) {
		final Set<Integer> setToReturn = new HashSet();
		final Set<Integer> set1 = new HashSet();

		for (Integer yourInt : listContainingDuplicates) {
			if (!set1.add(yourInt)) {
				setToReturn.add(yourInt);
			}
		}
		return setToReturn;
	}
}
