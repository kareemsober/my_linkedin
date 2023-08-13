public class Simulation {
    public static void main(String[] args) {
        FullControlCenter fullControlCenter = new FullControlCenter();
        Student student = new Student("1", "", "Ahmad");
        student.setInterviewConducted(true);
        Instructor instructor = new Instructor(new MarksApprovalByInstructor());
        ProgramAdmin programAdmin = new ProgramAdmin(new MarksApprovalByAdmin());
        School school = fullControlCenter.objectManagement.createSchool("1", "Iconic School", "");
        student.setSchool(school);

        University university = fullControlCenter.objectManagement.createUni("1", "Iconic University", "", "iconic.com");
        student.setUniversity(university);
        Program program = fullControlCenter.objectManagement.createProgram("", "1", "arabic course", school);
        student.setEmail("ahmad@gmail.com");
        student.setBirthDate("27/8/2001");
        student.setGraduateSemester("spring");
        student.setPhoneNumber(223232);
        student.setSex("male");
        student.setGraduateYear(2025);
        program.getTracks().add(fullControlCenter.objectManagement.createTrack("1", "Evening Lesson", "", 10, "In The Night", "Four Teachers included", instructor));
       program.getTracks().get(0).getAllAssessments().add(new Assessment("Quiz 1",100));
        student.setProgram(program);
        System.out.println("Now We Are going to add another Track");
        fullControlCenter.applicationManagement.addTrack(new Track("2","Morning Lesson","",50,"In The Morning","Four Teachers Included",instructor),student);
        System.out.println("Now We Are going to replace The Tracks");
        fullControlCenter.applicationManagement.selectPriority(0,1,student);
        System.out.println("Now we are going to make sure it is correct so we will print all the student info");
        student.htmlTrackPrinting.htmlRequired=false;
        student.htmlTrackPrinting.print(student);
        System.out.println("Now we are going to remove the second one");
        fullControlCenter.applicationManagement.removeTrack(student.getProgram().getTracks().get(1),student);
        System.out.println("Now we will print it again in html format");
        student.htmlTrackPrinting.htmlRequired=true;
        student.htmlTrackPrinting.print(student);
        System.out.println("Now we will prove the assessments by the instructor and the admin");
        System.out.println("And we will add another assessment because our assingment is already deleted");
        program.getTracks().get(0).getAllAssessments().add(new Assessment("Quiz 1",100));

        fullControlCenter.approvalManagement.approveFullAction(student.getProgram().getTracks().get(0).getAllAssessments().get(0),student);
        System.out.println("Now we will print it again");
        student.htmlTrackPrinting.htmlRequired=false;
        student.htmlTrackPrinting.print(student);
        System.out.println("Now we will get the average out of 5: "+student.calculateGPA());



    }

}
