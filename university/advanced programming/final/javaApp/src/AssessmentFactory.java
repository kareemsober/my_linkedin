public class AssessmentFactory {
    public Assessment createAssessment(ProgramAdmin programAdmin){
        if(programAdmin!=null){
            Assessment assessment=new Assessment();
            System.out.println("Creation Success");
            return new Assessment();

        }
        System.out.println("Creation Failed");
        return null;

    }
    public Assessment createAssessment(ProgramAdmin programAdmin,String name, double mark){
        if(programAdmin!=null){
            Assessment assessment=new Assessment(name,mark);
            System.out.println("Creation Success");
            return assessment;
        }
        System.out.println("Creation Failed");
        return null;

    }

}
