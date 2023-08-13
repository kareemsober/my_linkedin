import java.util.ArrayList;

public class Track {
    private String id;
    private String englishName;
    private String arabicName;
    private int maxNumberOfStudents;
    private String briefDescription;
    private String detailedDescription;
    private Instructor instructor;
    private ArrayList<Assessment> allAssessments=new ArrayList<>();
    private ArrayList<Assessment> doneAssessments=new ArrayList<>();

    public ArrayList<Assessment> getAllAssessments() {
        return allAssessments;
    }

    public ArrayList<Assessment> getDoneAssessments() {
        return doneAssessments;
    }
    private static ArrayList<Instructor> allAssignedInstructors=new ArrayList<>();

    public static ArrayList<Instructor> getAllAssignedInstructor() {
        return allAssignedInstructors;
    }

    private ArrayList<Student> allAppliedStudents=new ArrayList<>();

    public ArrayList<Student> getAllAppliedStudents() {
        return allAppliedStudents;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setInstructor(Instructor instructor) {
        this.instructor = instructor;
    }

    public Instructor getInstructor() {
        return instructor;
    }

    public void setEnglishName(String englishName) {
        this.englishName = englishName;
    }

    public void setBriefDescription(String briefDescription) {
        this.briefDescription = briefDescription;
    }

    public void setDetailedDescription(String detailedDescription) {
        this.detailedDescription = detailedDescription;
    }

    public void setMaxNumberOfStudents(int maxNumberOfStudents) {
        this.maxNumberOfStudents = maxNumberOfStudents;
    }

    public void setArabicName(String arabicName) {
        this.arabicName = arabicName;
    }

    public String getArabicName() {
        return arabicName;
    }

    public String getEnglishName() {
        return englishName;
    }

    public String getId() {
        return id;
    }

    public int getMaxNumberOfStudents() {
        return maxNumberOfStudents;
    }

    public String getBriefDescription() {
        return briefDescription;
    }

    public String getDetailedDescription() {
        return detailedDescription;
    }

    public Track(String id, String englishName, String arabicName, int maxNumberOfStudents, String briefDescription, String detailedDescription,Instructor instructor) {
        this.id = id;
        this.englishName = englishName;
        this.arabicName = arabicName;
        this.maxNumberOfStudents = maxNumberOfStudents;
        this.briefDescription = briefDescription;
        this.detailedDescription = detailedDescription;
        this.instructor=instructor;
    }
    public Track(){

    }


}
