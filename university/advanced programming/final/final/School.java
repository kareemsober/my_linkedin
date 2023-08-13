package FA;

public class School extends University{

	private int id;
	private String ArabicName;
	private String EnglishName;

	public School() {}
	public School(int id, String arabicName, String englishName) {
		super();
		this.id = id;
		ArabicName = arabicName;
		EnglishName = englishName;
	}

	public void add(int id, String arabicName, String englishName) {
		this.id = id;
		ArabicName = arabicName;
		EnglishName = englishName;
	}

	public void edit(int id, String arabicName, String englishName) {
		toString();
		this.id = id;
		ArabicName = arabicName;
		EnglishName = englishName;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getArabicName() {
		return ArabicName;
	}

	public void setArabicName(String arabicName) {
		ArabicName = arabicName;
	}

	public String getEnglishName() {
		return EnglishName;
	}

	public void setEnglishName(String englishName) {
		EnglishName = englishName;
	}

	@Override
	public String toString() {
		return "school [id=" + id + ", ArabicName=" + ArabicName + ", EnglishName=" + EnglishName + "]";
	}

}
