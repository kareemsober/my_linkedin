public class TrackFactory {
    public Track createTrack(){
        return new Track();
    }
    public Track createTrack(String id, String englishName, String arabicName, int maxNumberOfStudents, String briefDescription, String detailedDescription,Instructor instructor){
        return new Track(id,englishName,arabicName,maxNumberOfStudents,briefDescription,detailedDescription,instructor);
    }
}
