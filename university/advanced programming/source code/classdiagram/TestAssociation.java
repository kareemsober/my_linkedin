package classdiagram;

public class TestAssociation {

	public static void main(String[] args) {
		
		Dept dept = new Dept("Development");
		Emp emp = new Emp("Ali");
		
		System.out.println(emp.getName() + " is employee of " + dept.getName());

	}

}
