public class ObjectManagement{
    AssessmentFactory assessmentFactory=new AssessmentFactory();
    EducationalInstituionFactory educationalInstituionFactory=new EducationalInstituionFactory();
    ProgramFactory programFactory=new ProgramFactory();
    TrackFactory trackFactory=new TrackFactory();
    public Assessment createAssessment(ProgramAdmin programAdmin){
        System.out.println("Assessment Created");
     return assessmentFactory.createAssessment(programAdmin);

    }
    public Assessment createAssessment(ProgramAdmin programAdmin,String name, double mark){
        System.out.println("Assessment Created");
      return assessmentFactory.createAssessment(programAdmin,name,mark);

    }
    public School createSchool(){
        System.out.println("School Created");

        return educationalInstituionFactory.createSchool();

    }
    public School createSchool(String id, String englishName, String arabicName){
        System.out.println("School Created");
     return educationalInstituionFactory.createSchool(id,englishName,arabicName);
    }

    public University createUni(){
        System.out.println("University Created");

        return  educationalInstituionFactory.createUni();

    }
    public University createUni(String id, String englishName, String arabicName, String website){
        System.out.println("University Created");
        return educationalInstituionFactory.createUni(id,englishName,arabicName,website);

    }
    public Program createProgram(){
        System.out.println("Program Created");
        return programFactory.createProgram();

    }
    public Program createProgram(String arabicName, String id, String englishName, School school){
        System.out.println("Program Created");

        return programFactory.createProgram(arabicName,id,englishName,school);

    }   public Track createTrack(){
        System.out.println("Track Created");
        return trackFactory.createTrack();

    }
    public Track createTrack(String id, String englishName, String arabicName, int maxNumberOfStudents, String briefDescription, String detailedDescription,Instructor instructor){
        System.out.println("Track Created");

        return trackFactory.createTrack(id,englishName,arabicName,maxNumberOfStudents,briefDescription,detailedDescription,instructor);
    }
}
