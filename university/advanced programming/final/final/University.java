package FA;

public class University {

	
	private int id;
	private String arabicName;  
	private String englishName;
	public University() {
		
		this.id = 1;
		this.arabicName = "جامعة الحسين التقنية";  
		this.englishName ="Al Hussein Technical University";
		
	}
	public int ggetId() {
		return id;
	}
	public String ggetArabicName() {
		return arabicName;
	}
	public String ggetEnglishName() {
		return englishName;
	}
	
	
}
