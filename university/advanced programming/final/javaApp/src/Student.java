import java.util.ArrayList;

public class Student extends User {

  private String sex;
  private double phoneNumber;
  private String birthDate;
  private University university;
  private School school;
  private Program program;
  private String email;
  private double finalAverage;
    private double maxAverage;
    private double rate;
    private String graduateSemester;
    private int graduateYear;
    public HTMLTrackPrinting htmlTrackPrinting=new HTMLTrackPrinting();


    private boolean interviewConducted;

    public double calculateGPA(){
        int sum=0;
        for (Track track:program.getTracks()
             ) {
            for (Assessment assessment:track.getDoneAssessments()
                 ) {
                sum+=assessment.getMark();

            }

        }
        finalAverage=sum;

        return sum/20.0;
    }
    public void setInterviewConducted(boolean interviewConducted) {
        this.interviewConducted = interviewConducted;
    }

    public boolean isInterviewConducted() {
        return interviewConducted;
    }





    public String getEmail() {
        return email;
    }
    public double getFinalAverage() {
        return finalAverage;
    }

    public double getMaxAverage() {
        return maxAverage;
    }

    public double getPhoneNumber() {
        return phoneNumber;
    }

    public double getRate() {
        return rate;
    }

    public Program getProgram() {
        return program;
    }

    public int getGraduateYear() {
        return graduateYear;
    }

    public School getSchool() {
        return school;
    }

    public String getBirthDate() {
        return birthDate;
    }

    public String getGraduateSemester() {
        return graduateSemester;
    }

    public String getSex() {
        return sex;
    }

    public University getUniversity() {
        return university;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setFinalAverage(double finalAverage) {
        this.finalAverage = finalAverage;
    }

    public void setBirthDate(String birthDate) {
        this.birthDate = birthDate;
    }

    public void setMaxAverage(double maxAverage) {
        this.maxAverage = maxAverage;
    }

    public void setGraduateSemester(String graduateSemester) {
        this.graduateSemester = graduateSemester;
    }

    public void setGraduateYear(int graduateYear) {
        this.graduateYear = graduateYear;
    }

    public void setProgram(Program program) {
        this.program = program;
    }

    public void setRate(double rate) {
        this.rate = rate;
    }

    public void setSchool(School school) {
        this.school = school;
    }

    public void setPhoneNumber(double phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public void setUniversity(University university) {
        this.university = university;
    }

    public Student(String id, String arabicName, String englishName) {
        super(id, arabicName, englishName);
        maxAverage=5;
    }
    public Student(){
        maxAverage=5;
    }
}
