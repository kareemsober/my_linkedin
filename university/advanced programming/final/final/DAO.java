package FA;

import java.util.Scanner;

public class DAO {
	public void studentInsert(Student std){
		Scanner input = new Scanner(System.in);

		int id= input.nextInt();
		String ArabicName = input.nextLine();
		String EnglishName = input.nextLine();
		String sex = input.nextLine();
		String mobile = input.nextLine();
		String birthdate = input.nextLine();
		String email = input.nextLine();
		String university = input.nextLine();
		String school = input.nextLine();
		String programme = input.nextLine();
		double finalAverage= input.nextDouble();
		double maximumAverage= input.nextDouble();
		double rate= input.nextDouble();
		String graduateYear = input.nextLine();
		String graduateSemester = input.nextLine();
		
		std.addAccount( id,  ArabicName,  EnglishName,  sex,  mobile,  birthdate,
				 email,  university,  school,  programme,  finalAverage,
				 maximumAverage,  rate,  graduateYear,  graduateSemester);
		
	}
	public void instructorInsert(Instructor inst){
		Scanner input = new Scanner(System.in);

		int id = input.nextInt(); 
		String name = input.nextLine(); 
		String name2 = input.nextLine(); 

		String pass = input.nextLine() ;
		inst.addAccount(id,  name, name2, pass);
	}
	public void adminInsert(Administrator admin){
		Scanner input = new Scanner(System.in);

		int id = input.nextInt(); 
		String name = input.nextLine(); 
		String pass = input.nextLine() ;
		admin.addAccount( id,  name,  pass);
	}
	public void updateStudent(Student std) {
		std.editAccount();
	}
	public void updateInstructor(Instructor inst) {
		inst.editAccount();
	}
	public void updateAdmin(Administrator admin) {
		admin.editAccount();
	}
	public void removeStudent(Student std) {
		std.removeAccount(std);
	}
	public void removeInstructor(Instructor inst) {
		inst.removeAccount(inst);
	}
	public void removeAdmin(Administrator admin) {
		admin.removeAccount(admin);
	}
	
	public void trackAdmin() {
		
		//add track, remove track and change track priority
	}
	

}
