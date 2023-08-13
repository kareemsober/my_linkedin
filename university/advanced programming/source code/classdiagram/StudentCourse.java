package classdiagram;

public class StudentCourse {
	
	private Course course;
	private int year;
	private String semester;
	private int section;
	private int grade;
	
	public StudentCourse() {
		
	}
	
	public StudentCourse(Course course, int year, String semester, int section, int grade) {
		super();
		this.course = course;
		this.year = year;
		this.semester = semester;
		this.section = section;
		this.grade = grade;
	}

	public Course getCourse() {
		return course;
	}

	public void setCourse(Course course) {
		this.course = course;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public String getSemester() {
		return semester;
	}

	public void setSemester(String semester) {
		this.semester = semester;
	}

	public int getSection() {
		return section;
	}

	public void setSection(int section) {
		this.section = section;
	}

	public int getGrade() {
		return grade;
	}

	public void setGrade(int grade) {
		this.grade = grade;
	}

	@Override
	public String toString() {
		return "\n\t StudentCourse [course=" + course + ", year=" + year + ", semester=" + semester + ", section=" + section
				+ ", grade=" + grade + "]";
	}

}
