package FA;

import java.sql.Date;

public class UserData {
	private int id;
	private String ArabicName;
	private String EnglishName;
	private String sex;
	private String mobile;
	private Date birthdate;
	private String email;
	private String university;
	private String school;
	private String programme;
	private double finalAverage;
	private double maximumAverage;
	private double rate;
	private Date graduateYear;
	private Date graduateSemester;
	private int type;
	
	
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
	public Date getBirthdate() {
		return birthdate;
	}
	public void setBirthdate(Date birthdate) {
		this.birthdate = birthdate;
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
	public Date getGraduateYear() {
		return graduateYear;
	}
	public void setGraduateYear(Date graduateYear) {
		this.graduateYear = graduateYear;
	}
	public Date getGraduateSemester() {
		return graduateSemester;
	}
	public void setGraduateSemester(Date graduateSemester) {
		this.graduateSemester = graduateSemester;
	}
	public int getType() {
		return type;
	}
	public void setType(int type) {
		this.type = type;
	}
	
	


}
