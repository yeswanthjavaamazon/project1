package java8;

public class Employees {
	private String name;
	private String id;
	private long salary;
	private String city;
	private int age;

	public Employees(String name, String id, long salary, String city, int age) {
		super();
		this.name = name;
		this.id = id;
		this.salary = salary;
		this.city = city;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public long getSalary() {
		return salary;
	}

	public void setSalary(long salary) {
		this.salary = salary;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "Employees [name=" + name + ", id=" + id + ", salary=" + salary + ", city=" + city + ", age=" + age
				+ "]";
	}

}
