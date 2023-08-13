public class MarksApprovalByAdmin implements MarksApprovalAction{
    @Override
    public void approveMark(Assessment assessment, Student student) {
        boolean approved=false;
        for (Track track:student.getProgram().getTracks()
             ) {
            if(track.getAllAssessments().contains(assessment)){
                track.getDoneAssessments().add(assessment);
                System.out.println("Mark Approved By Admin ");
                approved=true;
                break;
            }
        }
        if(approved==false)
            System.out.println("Mark can not be approved by admin");

    }
}
