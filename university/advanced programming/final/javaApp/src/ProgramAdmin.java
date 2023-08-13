import java.util.ArrayList;

public class ProgramAdmin implements MarksChecker {
    private String id;
    private String arabicName;
    private String englishName;
    private School school;
    private ArrayList<Assessment> assessments;
    private MarksApprovalAction marksApprovalAction;
    public void setAssessments(ArrayList<Assessment> assessments) {
        this.assessments = assessments;
    }

    public ArrayList<Assessment> getAssessments() {
        return assessments;
    }

    public void setArabicName(String arabicName) {
        this.arabicName = arabicName;
    }

    public void setEnglishName(String englishName) {
        this.englishName = englishName;
    }

    public void setSchool(School school) {
        this.school = school;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }

    public String getArabicName() {
        return arabicName;
    }

    public String getEnglishName() {
        return englishName;
    }

    public School getSchool() {
        return school;
    }

    public ProgramAdmin(String id, String arabicName, String englishName, School school, ArrayList<Assessment> assessments,MarksApprovalAction marksApprovalAction) {
        this.id = id;
        this.arabicName = arabicName;
        this.englishName = englishName;
        this.school = school;
        this.assessments = assessments;
        this.marksApprovalAction=marksApprovalAction;
    }

    public ProgramAdmin(MarksApprovalAction marksApprovalAction) {
        this.marksApprovalAction = marksApprovalAction;
    }

    @Override
    public void setMarksApprovalAction(MarksApprovalAction marksApprovalAction) {
        this.marksApprovalAction=marksApprovalAction;
    }

    @Override
    public void approve(Assessment assessment,Student student) {
        marksApprovalAction.approveMark(assessment,student);
    }

}
