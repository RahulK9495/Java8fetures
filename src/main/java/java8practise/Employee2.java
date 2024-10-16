package java8practise;

public class Employee2 {
	
	private String name;
	private int salary;
	
	public Employee2() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Employee2(String name, int salary) {
		super();
		this.name = name;
		this.salary = salary;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee2 [name=" + name + ", salary=" + salary + "]";
	}
	
	

}
