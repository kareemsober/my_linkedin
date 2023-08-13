public class EducationInstitution {
    private String id;
    private String englishName;
    private String arabicName;

    public void setId(String id) {
        this.id = id;
    }

    public void setEnglishName(String englishName) {
        this.englishName = englishName;
    }

    public void setArabicName(String arabicName) {
        this.arabicName = arabicName;
    }

    public String getEnglishName() {
        return englishName;
    }

    public String getArabicName() {
        return arabicName;
    }

    public String getId() {
        return id;
    }

    public EducationInstitution(String id, String englishName, String arabicName) {
        this.id = id;
        this.englishName = englishName;
        this.arabicName = arabicName;
    }
    public EducationInstitution(){

    }
}
