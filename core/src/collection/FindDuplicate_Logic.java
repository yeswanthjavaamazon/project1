package collection;

import java.util.ArrayList;
import java.util.List;

public class FindDuplicate_Logic {
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();
		for(int i = 1;i<3;i++){
			list.add(i);
		}
		System.out.println(list);
		list.add(1);
		System.out.println(findDuplicateNumber(list));
	}
	
	public static int getSum(List<Integer> numbers){
		int sum = 0;
		for(int num : numbers){
			sum = sum+ num;
		}
		return sum;
	}
	
	public static int findDuplicateNumber(List<Integer> numbers){
		int highest = numbers.size()-1;
		int total = getSum(numbers);
		int duplicate = total - (highest*(highest+1)/2);
		return duplicate;
	}
}
