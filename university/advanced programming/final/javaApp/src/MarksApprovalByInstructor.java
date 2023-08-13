public class MarksApprovalByInstructor implements MarksApprovalAction {
    private boolean approved=false;

    public boolean isApproved() {
        return approved;
    }

    @Override
    public void approveMark(Assessment assessment, Student student) {

        System.out.println("Mark Approved By Instructor");
        approved=true;
    }
}
