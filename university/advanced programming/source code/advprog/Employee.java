package advprog;

public class Employee {

	private int id;
	private String name;
	private double salary;
	
	public Employee() {
		id = 99; // Open connection, select max(empno) + 1 from emp, Close connection
		name="Please enter name"; // Calling web service
		salary = 500; // Open connection, calling get_min_salary(), Close connection
	}
	
	public Employee(int id, String name, double salary) {
		this.id = id;
		this.name = name;
		this.salary = salary;
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

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + "]";
	}
	
	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Employee) {
			Employee that = (Employee) obj;
			return this.id == that.getId();
		}
		return false;
		
	}

}
