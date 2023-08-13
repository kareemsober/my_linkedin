public class EducationalInstituionFactory {
    public School createSchool(){
        return new School();
    }
    public School createSchool(String id, String englishName, String arabicName){
        return new School(id,englishName,arabicName);
    }

    public University createUni(){
        return  new University();
    }
    public University createUni(String id, String englishName, String arabicName, String website){
        return  new University(id,englishName,arabicName,website);
    }


}
