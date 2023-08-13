package FA;

import java.util.Scanner;

public class Student extends DAO implements Account {

	private int id;
	private String ArabicName;
	private String EnglishName;
	private String sex;
	private String mobile;
	private String birthdate;
	private String email;
	private String university;
	private String school;
	private String programme;
	private double finalAverage;
	private double maximumAverage;
	private double rate;
	private String graduateYear;
	private String graduateSemester;


	public Student() {
	}

	public Student(int id, String arabicName, String englishName, String sex, String mobile, String birthdate,
			String email, String university, String school, String programme, double finalAverage,
			double maximumAverage, double rate, String graduateYear, String graduateSemester) {
		super();
		this.id = id;
		ArabicName = arabicName;
		EnglishName = englishName;
		this.sex = sex;
		this.mobile = mobile;
		this.birthdate = birthdate;
		this.email = email;
		this.university = university;
		this.school = school;
		this.programme = programme;
		this.finalAverage = finalAverage;
		this.maximumAverage = maximumAverage;
		this.rate = rate;
		this.graduateYear = graduateYear;
		this.graduateSemester = graduateSemester;
	}

	public void addAccount(int id, String arabicName, String englishName, String sex, String mobile, String birthString,
			String email, String university, String school, String programme, double finalAverage,
			double maximumAverage, double rate, String graduateYear, String graduateSemester) {
		this.id = id;
		ArabicName = arabicName;
		EnglishName = englishName;
		this.sex = sex;
		this.mobile = mobile;
		this.birthdate = birthString;
		this.email = email;
		Programm uni = new Programm();
		this.university = uni.ggetEnglishName();
//		uni.getSchool();
		this.school = uni.getSchool();
		this.programme = uni.schoolChoice();
		this.finalAverage = finalAverage;
		this.maximumAverage = maximumAverage;
		this.rate = rate;
		this.graduateYear = graduateYear;
		this.graduateSemester = graduateSemester;
	}

	public void edit(int id, String arabicName, String englishName, String sex, String mobile, String birthString,
			String email, String university, String school, String programme, double finalAverage,
			double maximumAverage, double rate, String graduateYear, String graduateSemester) {

	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getArabicName() {
		return ArabicName;
	}

	public void setArabicName(String arabicName) {
		ArabicName = arabicName;
	}

	public String getEnglishName() {
		return EnglishName;
	}

	public void setEnglishName(String englishName) {
		EnglishName = englishName;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public String getBirthString() {
		return birthdate;
	}

	public void setBirthString(String birthString) {
		this.birthdate = birthString;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getUniversity() {
		return university;
	}

	public void setUniversity(String university) {
		this.university = university;
	}

	public String getSchool() {
		return school;
	}

	public void setSchool(String school) {
		this.school = school;
	}

	public String getProgramme() {
		return programme;
	}

	public void setProgramme(String programme) {
		this.programme = programme;
	}

	public double getFinalAverage() {
		return finalAverage;
	}

	public void setFinalAverage(double finalAverage) {
		this.finalAverage = finalAverage;
	}

	public double getMaximumAverage() {
		return maximumAverage;
	}

	public void setMaximumAverage(double maximumAverage) {
		this.maximumAverage = maximumAverage;
	}

	public double getRate() {
		return rate;
	}

	public void setRate(double rate) {
		this.rate = rate;
	}

	public String getGraduateYear() {
		return graduateYear;
	}

	public void setGraduateYear(String graduateYear) {
		this.graduateYear = graduateYear;
	}

	public String getGraduateSemester() {
		return graduateSemester;
	}

	public void setGraduateSemester(String graduateSemester) {
		this.graduateSemester = graduateSemester;
	}

	@Override
	public String toString() {
		return "student [id=" + id + ", ArabicName=" + ArabicName + ", EnglishName=" + EnglishName + ", sex=" + sex
				+ ", mobile=" + mobile + ", birthString=" + birthdate + ", email=" + email + ", university="
				+ university + ", school=" + school + ", programme=" + programme + ", finalAverage=" + finalAverage
				+ ", maximumAverage=" + maximumAverage + ", rate=" + rate + ", graduateYear=" + graduateYear
				+ ", graduateSemester=" + graduateSemester + "]";
	}

	@Override
	public void editAccount() {
		Scanner input = new Scanner(System.in);
		System.out.println("what would you like to edit");

		System.out.println(" ArabicName= 1" + ", EnglishName= 2" + ", sex= 3" + ", mobile= 3" + ", birthString= 4"
				+ ", email= 5 " + ", university= 6" + ", school= 7" + ", programme= 8" + ", finalAverage= 9"
				+ ", maximumAverage= 10" + ", rate= 11" + ", graduateYear= 12" + ", graduateSemester= 13");

		int x = input.nextInt();
		switch (x) {
		case 1:
			System.out.println("right now = " + this.ArabicName);
			System.out.println("enter the new");
			this.ArabicName = input.nextLine();
			System.out.println("Done");

			break;
		case 2:
			System.out.println("right now = " + this.EnglishName);
			System.out.println("enter the new");
			this.EnglishName = input.nextLine();
			System.out.println("Done");

			break;
		case 3:
			System.out.println("right now = " + this.sex);
			System.out.println("enter the new");
			this.sex = input.nextLine();
			System.out.println("Done");

			break;
		case 4:
			System.out.println("right now = " + this.mobile);
			System.out.println("enter the new");
			this.mobile = input.nextLine();
			System.out.println("Done");

			break;
		case 5:
			System.out.println("right now = " + this.birthdate);
			System.out.println("enter the new");
			this.birthdate = input.nextLine();
			System.out.println("Done");

			break;
		case 6:
			System.out.println("right now = " + this.email);
			System.out.println("enter the new");
			this.email = input.nextLine();
			System.out.println("Done");

			break;
		case 7:
			System.out.println("right now = " + this.university);
			System.out.println("enter the new");
			this.university = input.nextLine();
			System.out.println("Done");

			break;
		case 8:
			System.out.println("right now = " + this.school);
			System.out.println("enter the new");
			this.school = input.nextLine();
			System.out.println("Done");

			break;
		case 9:
			System.out.println("right now = " + this.programme);
			System.out.println("enter the new");
			this.programme = input.nextLine();
			System.out.println("Done");

			break;
		case 10:
			System.out.println("right now = " + this.finalAverage);
			System.out.println("enter the new");
			this.finalAverage = input.nextDouble();
			System.out.println("Done");

			break;
		case 11:
			System.out.println("right now = " + this.graduateSemester);
			System.out.println("enter the new");
			this.graduateSemester = input.nextLine();
			System.out.println("Done");

			break;
		case 12:
			System.out.println("right now = " + this.graduateYear);
			System.out.println("enter the new");
			this.graduateYear = input.nextLine();
			System.out.println("Done");

			break;
		case 13:
			System.out.println("right now = " + this.maximumAverage);
			System.out.println("enter the new");
			this.maximumAverage = input.nextDouble();
			System.out.println("Done");

			break;

		default:
			System.out.println("you entered incorrect number");

		}

	}

	@Override
	public void removeAccount(Object obj) {
		obj = null;
	}

}
