import java.util.ArrayList;

public class Program {
    private String arabicName;
    private String id;
    private String englishName;
    private School school;
    private ArrayList<Track> tracks=new ArrayList<>();

    public ArrayList<Track> getTracks() {
        return tracks;
    }

    public String getId() {
        return id;
    }

    public String getEnglishName() {
        return englishName;
    }

    public String getArabicName() {
        return arabicName;
    }

    public School getSchool() {
        return school;
    }

    public void setArabicName(String arabicName) {
        this.arabicName = arabicName;
    }

    public void setEnglishName(String englishName) {
        this.englishName = englishName;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setSchool(School school) {
        this.school = school;
    }

    public Program(String arabicName, String id, String englishName, School school) {
        this.arabicName = arabicName;
        this.id = id;
        this.englishName = englishName;
        this.school = school;
    }
    public Program(){

    }
}
