package FA;

import java.util.Scanner;

public class Programm extends School {

	private int id;

	private String arabicName;
	private String englishName;
	private School ss= new School();
	private String school = ss.getEnglishName();

	public Programm() {
		super();
		this.id = 1;
		this.arabicName = "البرنامج";
		this.englishName = "programme";
		
	}

	public String schoolChoice() {
		Scanner input = new Scanner(System.in);
		int a;

		System.out.println("IT = 1 or ENG = 2 ");
		a = input.nextInt();

		if (a == 1) {
			return "IT";

		}
		if (a == 2) {
			return "ENG";

		} else {
			System.out.println("incorrect input");
			return null;
		}
		

	}

	public int getId() {
		return id;
	}

	public String getArabicName() {
		return arabicName;
	}

	public String getEnglishName() {
		return englishName;
	}

	public String getSchool() {
		return school;
	}

	@Override
	public String toString() {
		return "Programm [id=" + id + ", arabicName=" + arabicName + ", englishName=" + englishName + ", school="
				+ school + "]";
	}
	
	
	
	
}
