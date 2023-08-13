package classdiagram;

import java.util.List;
import java.util.Vector;

public class TestComposition {

	public static void main(String[] args) {
		
		Major major1 = new Major(1, "CS");
		Major major2 = new Major(2, "CIS");
		Major major3 = new Major(3, "Security");
		
		List<Major> majors = new Vector<Major>();
		majors.add(major1);
		majors.add(major2);
		majors.add(major3);
		
		Faculty faculty = new Faculty(1, "IT", majors);
		
		System.out.println(faculty);

	}

}
