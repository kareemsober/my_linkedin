public class University extends EducationInstitution {
    private String website;

    public String getWebsite() {
        return website;
    }

    public void setWebsite(String website) {
        this.website = website;
    }

    public University(String id, String englishName, String arabicName, String website) {
        super(id, englishName, arabicName);
        this.website = website;
    }

  public University(){

  }
}
