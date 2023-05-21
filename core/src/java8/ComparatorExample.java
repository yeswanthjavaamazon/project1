package java8;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class ComparatorExample {
	
	public static void main(String[] args) {
		List<Employees> empList = new ArrayList<>();
		createEmployeeList(empList);
		System.out.println("Employee List before sorting");
		empList.forEach(emp->System.out.println(emp));
		
		empList.sort(Comparator.comparing(Employees::getName));
		System.out.println("Employee List after sorting");
		empList.forEach(emp->System.out.println(emp));
		
		empList.sort(Comparator.comparing(Employees::getName).reversed());
		System.out.println("Employee List after reverse");
		empList.forEach(emp->System.out.println(emp));
		
		//Needs to compare by multiple fields
		Comparator<Employees> groupByComparator = Comparator.comparing(Employees::getCity).thenComparing(Employees::getAge)
																.thenComparing(Employees::getName);
		empList.sort(groupByComparator);
		System.out.println("Employee list after groupby sorting");
		empList.forEach(emp->System.out.println(emp));
	}

	private static void createEmployeeList(List<Employees> empList) {
		empList.add(new Employees("YASH", "671", 100000, "BANGALORE", 30));
		empList.add(new Employees("JAS", "67", 10000, "PUNE", 31));
		empList.add(new Employees("SRU", "61", 1000, "BANGALORE", 29));
		empList.add(new Employees("ASIF", "71", 100, "BANGALORE", 20));
		empList.add(new Employees("ANTONY", "16", 900, "HYD", 25));
	}
}
