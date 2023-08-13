

public class Instructor extends User implements MarksChecker {
private Track track;
private String id;
private String arabicName;
private String englishName;
private MarksApprovalAction marksApprovalAction;
private boolean approved;

    public boolean isApproved() {
        return approved;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setEnglishName(String englishName) {
        this.englishName = englishName;
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

    public void setTrack(Track track) {
        if (Track.getAllAssignedInstructor().contains(this)) {
            System.out.println("Instructor Is already existed");

        }
        else{
            this.track = track;
        }

    }

    public Track getTrack() {
        return track;
    }
    public Instructor(MarksApprovalAction marksApprovalAction){
        this.marksApprovalAction=marksApprovalAction;
    }


    @Override
    public void setMarksApprovalAction(MarksApprovalAction marksApprovalAction) {
       this.marksApprovalAction=marksApprovalAction;
    }

    public void approve(Assessment assessment, Student student){
        marksApprovalAction.approveMark(assessment,student);
        approved=true;
    }
}
