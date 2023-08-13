package FA;

import java.util.Scanner;

public class Administrator extends DAO implements Account {

	private int id;
	private String name;
	private String password;

	public Administrator() {
	}

	public Administrator(int id, String name, String password) {
		super();
		this.id = id;
		this.name = name;
		this.password = password;
	}

	public void addAccount(int id, String name, String pass) {
		this.id = id;
		this.name = name;
		this.password = pass;

	}

	@Override
	public void editAccount() {
		Scanner input = new Scanner(System.in);
		System.out.println("what would you like to edit");
		System.out.println("		arabicName = 1\n" + "		englishName = 2\n" );
		int x = input.nextInt();
		switch (x) {
		case 1:
			System.out.println("right now = " + this.name);
			System.out.println("enter the new");
			this.name = input.nextLine();
			System.out.println("Done");

			break;
		case 2:
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

	public String getName() {
		return name;
	}

	public String getPassword() {
		return password;
	}

	@Override
	public String toString() {
		return "Administrator [id=" + id + ", name=" + name + ", password=" + password + "]";
	}

}
