package java8.techi.interview;

public class Employee {
	
	private int id;
	private String name;
	private String dep;
	private int salary;
	
	public Employee(int i, String name, String dep, int salary) {
		super();
		this.id = i;
		this.name = name;
		this.dep = dep;
		this.salary = salary;
	}

	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDep() {
		return dep;
	}

	public void setDep(String dep) {
		this.dep = dep;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", dep=" + dep + ", salary=" + salary + "]";
	}
	
	
	

}
