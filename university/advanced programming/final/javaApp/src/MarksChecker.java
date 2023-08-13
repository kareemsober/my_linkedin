public interface MarksChecker {

    void setMarksApprovalAction(MarksApprovalAction marksApprovalAction);
    void approve(Assessment assessment,Student student);
}
