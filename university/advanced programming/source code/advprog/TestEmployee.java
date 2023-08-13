package advprog;

public class TestEmployee {

	@SuppressWarnings("unlikely-arg-type")
	public static void main(String[] args) {
		Employee e1 = new Employee();
		Employee e2 = new Employee();
		Employee e3 = new Employee();
		Employee e4 = new Employee(4, "Ahmed", 2000);
		PartTimeEmployee e5 = new PartTimeEmployee();
		FullTimeEmployee e6 = new FullTimeEmployee();

		e1.setId(1);
		e1.setName("Ali");
		e1.setSalary(1000);

		e2.setId(2);
		e2.setName("Sami");
		e2.setSalary(1500);
		
		e5.setId(5);
		e5.setName("Hamzeh");
		e5.setSalary(1000);
		e5.setHour(15);
		
		e6.setId(6);
		e6.setName("XYZ");
		e6.setSalary(1500);
		e6.setVacation(30);

		System.out.println("Employee 1: " + e1.getId() + " " + e1.getName() + " " + e1.getSalary());
		System.out.println("Employee 2: " + e2.getId() + " " + e2.getName() + " " + e2.getSalary());
		System.out.println("Employee 3: " + e3.getId() + " " + e3.getName() + " " + e3.getSalary());
		System.out.println("Employee 4: " + e4.getId() + " " + e4.getName() + " " + e4.getSalary());
		System.out.println("Employee 5: " + e5.getId() + " " + e5.getName() + " " + e5.getSalary() + " " + e5.getHour());
		System.out.println("Employee 6: " + e6.getId() + " " + e6.getName() + " " + e6.getSalary() + " " + e6.getVacation());
		
		System.out.println(e1);
		System.out.println(e2.toString());
		
		if (e1.equals("ABCD")) {
			System.out.println("Equal");
		} else {
			System.out.println("Not equal");
		}
		
		// Ternary Operator
		System.out.println(e1.equals(e2)?"Equal":"Not equal");
		
	}

}
