package advprog;

import java.util.ArrayList;
import java.util.List;

public class TestArrayList {

	public static void main(String[] args) {
		
		List<Employee> e = new ArrayList<Employee>();
		List<String> s = new ArrayList<String>();
		
		Employee e1 = new Employee(1, "Ahmed", 2000);
		Employee e2 = new Employee(2, "Ali", 1000);
		e.add(e1);
		e.add(e2);
		System.out.println(e);
		
		s.add("Hamzeh");
		s.add("Asefan");
		
		System.out.println(s);

	}

}
