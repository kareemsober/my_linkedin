package classdiagram;

public class TestAssociationClass {

	public static void main(String[] args) {

		Student student1 = new Student("200110613", "Hamzeh");

		Course course1 = new Course("0301", "Adv. Prog.");
		Course course2 = new Course("0302", "Database");
		Course course3 = new Course("0303", "AI");

		StudentCourse studentCourse1 = new StudentCourse(course1, 2021, "First", 1, 95);
		StudentCourse studentCourse2 = new StudentCourse(course2, 2021, "First", 2, 90);
		StudentCourse studentCourse3 = new StudentCourse(course3, 2021, "Second", 1, 94);
		
		student1.addCourses(studentCourse1, studentCourse2, studentCourse3);
		
		System.out.println(student1);

	}

}
