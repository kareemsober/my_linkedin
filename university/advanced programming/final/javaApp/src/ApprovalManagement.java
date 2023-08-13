public class ApprovalManagement {
    MarksApprovalByAdmin marksApprovalByAdmin=new MarksApprovalByAdmin();
    MarksApprovalByInstructor marksApprovalByInstructor=new MarksApprovalByInstructor();
   ProgramAdmin programAdmin=new ProgramAdmin(marksApprovalByAdmin);
    Instructor instructor=new Instructor(marksApprovalByInstructor);
    public void approveFullAction(Assessment assessment, Student student){
        instructor.approve(assessment,student);
        if(instructor.isApproved()==true){
            programAdmin.approve(assessment,student);
        }
    }
}
