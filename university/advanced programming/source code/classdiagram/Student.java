package classdiagram;

import java.util.ArrayList;
import java.util.List;

public class Student {

	private String id;
	private String name;
	private List<StudentCourse> studentCourses = new ArrayList<StudentCourse>();

	public Student() {

	}

	public Student(String id, String name) {
		this.id = id;
		this.name = name;
	}

	// Var Args
	public void addCourses(StudentCourse... courses) {
		for (int i = 0; i < courses.length; i++) {
			studentCourses.add(courses[i]);
		}
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public List<StudentCourse> getStudentCourses() {
		return studentCourses;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + " Registered courses: " + studentCourses + "]";
	}

}
