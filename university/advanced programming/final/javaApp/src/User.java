public abstract class User {
    String id;
    String arabicName;
     String englishName;

    public User(String id, String arabicName, String englishName) {
        this.id = id;
        this.arabicName = arabicName;
        this.englishName = englishName;
    }

    public User() {
    }
}
