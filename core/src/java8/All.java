package java8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.OptionalInt;
import java.util.stream.Collectors;

class Employee {
	private String name;
	private int age;

	public Employee(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "Employee [name=" + name + ", age=" + age + "]";
	}

}

public class All {

	public static List<Employee> createEmployeeList() {
		List<Employee> employeeList = new ArrayList<>();

		Employee e1 = new Employee("John", 21);
		Employee e2 = new Employee("Martin", 19);
		Employee e3 = new Employee("Mary", 31);
		Employee e4 = new Employee("Stephan", 18);
		Employee e5 = new Employee("Gary", 26);

		employeeList.add(e1);
		employeeList.add(e2);
		employeeList.add(e3);
		employeeList.add(e4);
		employeeList.add(e5);

		return employeeList;
		
	}
	
	public static void main(String[] args) {
		List<Employee> employeesList = createEmployeeList();
		
		// 1. Print the list
		employeesList.forEach(System.out::println);
		
		// 2. Print NAMES where AGE > 20
		List<String> employeeNames = employeesList.stream()
				.filter(e->e.getAge()>20)
				.peek(e->System.out.println(e))
				.map(Employee::getName)
				.peek(System.out::println)
				.collect(Collectors.toList());
		employeeNames.forEach((name)->System.out.println(name));
		
		// 3. Employee count with AGE > 25
		long count = employeesList.stream()
				.filter(e->e.getAge()>25)
				.count();
		System.out.println(count);
		
		// 4. Find EMPLOYEE with NAME = "Mary"
		Optional<Employee> e1 = employeesList.stream().
				filter(e->e.getName().equalsIgnoreCase("Mary")).findAny();
		if(e1.isPresent())
			System.out.println(e1.get());
		

		// 5. Find MAX AGE of Employees
		OptionalInt max = employeesList.stream()
				.mapToInt(Employee::getAge).max();
		System.out.println(max.getAsInt());
		
		// 6. Sort by AGE
		employeesList.sort((emp1, emp2)->emp1.getAge()-emp2.getAge());
		employeesList.forEach(System.out::println);
		
		//7. Join all the Employee NAMES with ","
		List<String> employeeNamesList = employeesList.stream().map(Employee::getName).collect(Collectors.toList());
		String empNamesJoin = String.join(",", employeeNamesList);
		System.out.println(empNamesJoin);
		
		//8. Group by Employee NAMES
		Map<String, List<Employee>> map = employeesList.stream().collect(Collectors.groupingBy(Employee::getName));
		map.forEach((name, employeeListTemp)->System.out.println(name+" -> "+employeeListTemp));
		
		Map<String, List<Employee>> empList = employeesList.stream().collect(Collectors.groupingBy(Employee::getName));
		map.forEach((name, employeesNames)->System.out.println(name+" -> "+employeesNames));
		
	}
}
