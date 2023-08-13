package FA;

import java.util.Scanner;

public class Instructor extends DAO implements Account {
	private int id;
	private String arabicName;
	private String englishName;
	private String password;

	public Instructor() {
		super();
	}

	public Instructor(int id, String arabicName, String englishName, String password) {
		super();
		this.id = id;
		this.arabicName = arabicName;
		this.englishName = englishName;
		this.password = password;
	}

	public void addAccount(int id, String arabicName, String englishName, String password) {

		this.id = id;
		this.arabicName = arabicName;
		this.englishName = englishName;
		this.password = password;
	}

	@Override
	public void editAccount() {
		Scanner input = new Scanner(System.in);
		System.out.println("what would you like to edit");
		System.out.println("		arabicName = 1\n" + "		englishName = 2\n" + "		password = 3");
		int x = input.nextInt();
		switch (x) {
		case 1:
			System.out.println("right now = " + this.arabicName);
			System.out.println("enter the new");
			this.arabicName = input.nextLine();
			System.out.println("Done");

			break;
		case 2:
			System.out.println("right now = " + this.englishName);
			System.out.println("enter the new");
			this.englishName = input.nextLine();
			System.out.println("Done");

			break;
		case 3:
			System.out.println("right now = " + this.password);
			System.out.println("enter the new");
			this.password = input.nextLine();
			System.out.println("Done");

			break;

		default:
			System.out.println("you entered incorrect number");

		}

	}

	@Override
	public void removeAccount(Object obj) {
		obj = null;
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

	public String getPassword() {
		return password;
	}

	@Override
	public String toString() {
		return "Instructor [id=" + id + ", arabicName=" + arabicName + ", englishName=" + englishName + ", password="
				+ password + "]";
	}

}
