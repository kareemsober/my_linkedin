package FA;

import java.io.FileWriter;
import java.io.Writer;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;



public class main {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Student std = new Student();
		Administrator admin = new Administrator();
		Instructor inst = new Instructor();
		Notification note = new Notification();
		Track track = new Track();

		Map<String, Object> maperStd = new HashMap<>();
		Map<String, Object> maperInst = new HashMap<>();
		Map<String, Object> maperAdmin = new HashMap<>();

		std = new Student(1, "عزة", "aeza", "male", "0789266566", "22-2-1999", "aweza@aeza.com", "HTU", "tech", "ENG",
				98, 99, 69, "1-11-2023", "2nd");
		maperStd.put(std.getEnglishName(), std);

		std = new Student(2, "محمد", "mohamad", "male", "07892661536", "22-2-1988", "aweza@aeza.com", "HTU", "tech", "IT",
				98, 99, 69, "1-11-2023", "2nd");
		maperStd.put(std.getEnglishName(), std);
		std = new Student(3, "احمد", "ahmad", "male", "0789234566", "22-2-1990", "aweza@aeza.com", "HTU", "tech", "ENG",
				98, 99, 69, "1-11-2023", "2nd");
		maperStd.put(std.getEnglishName(), std);
		std = new Student(4, "خالد", "khaled", "male", "0789456566", "22-2-1991", "aweza@aeza.com", "HTU", "tech", "IT",
				98, 99, 69, "1-11-2023", "2nd");
		maperStd.put(std.getEnglishName(), std);
		std = new Student(5, "مراد", "murad", "male", "566789125", "22-2-1945", "aweza@aeza.com", "HTU", "tech", "ENG",
				98, 99, 69, "1-11-2023", "2nd");
		maperStd.put(std.getEnglishName(), std);
		std = new Student(6, "رائد", "raeed", "male", "07897656566", "22-2-1977", "aweza@aeza.com", "HTU", "tech", "IT",
				98, 99, 69, "1-11-5555", "2nd");
		maperStd.put(std.getEnglishName(), std);
		std = new Student(7, "عوني", "awnee", "male", "0789766566", "22-2-1988", "aweza@aeza.com", "HTU", "tech", "ENG",
				98, 99, 69, "1-11-2023", "2nd");
		maperStd.put(std.getEnglishName(), std);
		std = new Student(8, "عزيز", "azez", "male", "0789266766", "22-2-2000", "aweza@aeza.com", "HTU", "tech", "IT",
				98, 99, 69, "1-11-2023", "2nd");
		maperStd.put(std.getEnglishName(), std);
		std = new Student(9, "ممدوح", "mmammdoh", "male", "0789676566", "22-2-1923", "aweza@aeza.com", "HTU", "tech", "ENG",
				98, 99, 69, "1-11-3333", "2nd");
		maperStd.put(std.getEnglishName(), std);
		std = new Student(10, "حلمي", "helme", "male", "0786766566", "22-2-1889", "aweza@aeza.com", "HTU", "tech", "IT",
				98, 99, 69, "1-11-2222", "2nd");
		maperStd.put(std.getEnglishName(), std);

		inst = new Instructor(1, "اكرم", "akram", "1234");
		maperInst.put(inst.getEnglishName(), inst);
		inst = new Instructor(2, "علي", "ali", "1234");
		maperInst.put(inst.getEnglishName(), inst);

		admin = new Administrator(1, "admin", "1234");

		int userId;
		String pass;
		int q = 1;
		int y;
		while (q == 0) {

			int number = input.nextInt();
// 1 = admin / 2== instructor/ 3 useer
			try {
				System.out.println("strudent = 1\n instructor = 2 \n admin = 3 \n print = 4 \n shape = 5");
				switch (number) {
				case 1:
					maperAdmin.entrySet();
					System.out.println("please enter the user id and password");
					System.out.println("id = ");
					userId = input.nextInt();
					System.out.println("pass = ");
					pass = input.nextLine();
					maperAdmin.containsKey(userId);
					for (int i = 0; i < maperAdmin.size(); i++) {
						if (maperAdmin.containsKey(userId)) {
							admin = (Administrator) maperAdmin.get(userId);
							if (admin.getPassword() == pass) {
								System.out.println("you have entered");

							} else {
								System.out.println("input error for the user");
							}

						}

					}
					System.out.println("add = 1 \n edit = 2 \n remove = 3 \n check noteification = 4 \n tracks = 5");
					int x = input.nextInt();
					if (x == 1) {
						y = input.nextInt();
						switch (y) {
						case 1:
							std = new Student();
							std.studentInsert(std);
							maperStd.put(std.getEnglishName(), std);

							break;
						case 2:
							inst = new Instructor();
							inst.instructorInsert(inst);
							maperStd.put(inst.getEnglishName(), inst);
							break;
						case 3:
							admin = new Administrator();
							admin.adminInsert(admin);
							maperStd.put(admin.getName(), admin);
							break;

						default:
							System.out.println("wrong input");

							break;
						}

					}
					if (x == 2) {

						System.out.println("strudent = 1\n instructor = 2 \n admin = 3");
						y = input.nextInt();
						switch (y) {
						case 1:
							maperStd.values();
							System.out.println("enter which value");
							String z = input.nextLine();
							std = (Student) maperStd.get(z);
							std.updateStudent(std);
							maperStd.put(std.getEnglishName(), std);

							break;
						case 2:
							maperInst.values();
							System.out.println("enter which value");
							String z1 = input.nextLine();
							inst = (Instructor) maperInst.get(z1);
							inst.updateInstructor(inst);
							maperStd.put(inst.getEnglishName(), inst);
							break;
						case 3:
							maperAdmin.values();
							System.out.println("enter which value");
							String z2 = input.nextLine();
							admin = (Administrator) maperAdmin.get(z2);

							admin.updateAdmin(admin);
							maperStd.put(admin.getName(), admin);
							break;

						default:
							System.out.println("wrong input");

							break;
						}

					}
					if (x == 3) {

						System.out.println("strudent = 1\n instructor = 2 \n admin = 3");
						y = input.nextInt();
						switch (y) {
						case 1:
							maperStd.values();
							System.out.println("enter which value");
							String z = input.nextLine();
							std = (Student) maperStd.get(z);
							std.removeStudent(std);
							maperStd.put(std.getEnglishName(), std);

							break;
						case 2:
							maperInst.values();
							System.out.println("enter which value");
							String z1 = input.nextLine();
							inst = (Instructor) maperInst.get(z1);
							inst.removeInstructor(inst);
							maperStd.put(inst.getEnglishName(), inst);
							break;
						case 3:
							maperAdmin.values();
							System.out.println("enter which value");
							String z2 = input.nextLine();
							admin = (Administrator) maperAdmin.get(z2);

							admin.removeAdmin(admin);
							maperStd.put(admin.getName(), admin);
							break;

						default:
							System.out.println("wrong input");

							break;
						}

					}
					if (x == 4) {
						if (note.getNote() == null) {

							System.out.println("there are no notifications");

						} else {
							System.out.println("allow = 1/ stop = 2");
							int b = input.nextInt();
							switch (b) {
							case 1:
								note.adminChecker(1);

								break;

							case 2:
								note.adminChecker(0);

								break;

							default:
								System.out.println("wrong input");

								break;
							}
						}

					}
					if (x == 5) {

						System.out.println("add =1 \n change =2\n remove = 3\n");
//tracks
						int t = input.nextInt();

						switch (t) {

						case 1:
							track.add(std.getId(), std.getEnglishName());

							break;
						case 2:
							track.change();

							break;
						case 3:
							System.out.println("enter the id from map");
							track.getMapper();
							int g = input.nextInt();

							track.remove(g);

							break;

						default:
							System.out.println("wrong input");

							break;
						}

					} else {

					}
					break;

				case 2:
					maperInst.entrySet();
					System.out.println("please enter the user id and password");
					System.out.println("id = ");
					userId = input.nextInt();
					System.out.println("pass = ");
					pass = input.nextLine();
					maperInst.containsKey(userId);
					for (int i = 0; i < maperInst.size(); i++) {
						if (maperInst.containsKey(userId)) {
							inst = (Instructor) maperInst.get(userId);
							if (inst.getPassword() == pass) {
								System.out.println("you have entered");

							} else {
								System.out.println("input error for the user");
							}

						}

					}

					System.out.println("add = 1 \n edit = 2 \n remove = 3 \n check noteification = 4 \n tracks = 5");
					int x1 = input.nextInt();
					if (x1 == 1) {
						System.out.println("strudent = 1\n instructor = 2 \n ");
						y = input.nextInt();
						switch (y) {
						case 1:
							std = new Student();
							std.studentInsert(std);
							maperStd.put(std.getEnglishName(), std);

							break;
						case 2:
							inst = new Instructor();
							inst.instructorInsert(inst);
							maperStd.put(inst.getEnglishName(), inst);
							break;

						default:
							System.out.println("wrong input");

							break;
						}

					}
					if (x1 == 2) {

						System.out.println("strudent = 1\n instructor = 2 \n ");
						y = input.nextInt();
						switch (y) {
						case 1:
							maperStd.values();
							System.out.println("enter which value");
							String z = input.nextLine();
							std = (Student) maperStd.get(z);
							std.updateStudent(std);
							maperStd.put(std.getEnglishName(), std);

							break;
						case 2:
							maperInst.values();
							System.out.println("enter which value");
							String z1 = input.nextLine();
							inst = (Instructor) maperInst.get(z1);
							inst.updateInstructor(inst);
							maperStd.put(inst.getEnglishName(), inst);
							break;

						default:
							System.out.println("wrong input");

							break;
						}

					}
					if (x1 == 3) {

						System.out.println("strudent = 1\n instructor = 2 \n ");
						y = input.nextInt();
						switch (y) {
						case 1:
							maperStd.values();
							System.out.println("enter which value");
							String z = input.nextLine();
							std = (Student) maperStd.get(z);
							std.removeStudent(std);
							maperStd.put(std.getEnglishName(), std);

							break;
						case 2:
							maperInst.values();
							System.out.println("enter which value");
							String z1 = input.nextLine();
							inst = (Instructor) maperInst.get(z1);
							inst.removeInstructor(inst);
							maperStd.put(inst.getEnglishName(), inst);
							break;

						default:
							System.out.println("wrong input");

							break;
						}

					}
					if (x1 == 4) {
						if (note.getNote() == null) {

							System.out.println("there are no notifications");

						} else {
							System.out.println("allow = 1/ stop = 2");
							int b = input.nextInt();
							switch (b) {
							case 1:
								note.instChecker(1);

								break;

							case 2:
								note.instChecker(0);

								break;

							default:
								System.out.println("wrong input");

								break;
							}
						}

					}
					if (x1 == 5) {

						System.out.println("add =1 \n change =2\n remove = 3\n");
//tracks
						int t = input.nextInt();

						switch (t) {

						case 1:
							track.add(std.getId(), std.getEnglishName());

							break;
						case 2:
							track.change();

							break;
						case 3:
							System.out.println("enter the id from map");
							track.getMapper();
							int g = input.nextInt();

							track.remove(g);

							break;

						default:
							System.out.println("wrong input");

							break;
						}

					} else {

					}
					break;

				case 3:
					maperStd.entrySet();

					System.out.println("please enter the user id and password");
					System.out.println("id = ");
					userId = input.nextInt();
					System.out.println("pass = ");
					pass = input.nextLine();
					maperStd.containsKey(userId);
					for (int i = 0; i < maperStd.size(); i++) {
						if (maperStd.containsKey(userId)) {
							std = (Student) maperStd.get(userId);

						} else {
							System.out.println("input error for the user");
						}

					}

					System.out.println("add = 1 \n edit = 2 \n remove = 3 \n \n tracks = 4");
					int x11 = input.nextInt();
					if (x11 == 1) {
						System.out.println("strudent = 1\n");
						y = input.nextInt();

						std = new Student();
						std.studentInsert(std);
						maperStd.put(std.getEnglishName(), std);

					}
					if (x11 == 2) {

						System.out.println("strudent = 1\n");
						y = input.nextInt();
						switch (y) {
						case 1:
							maperStd.values();
							System.out.println("enter which value");
							String z = input.nextLine();
							std = (Student) maperStd.get(z);
							std.updateStudent(std);
							maperStd.put(std.getEnglishName(), std);

							break;

						default:
							System.out.println("wrong input");

							break;
						}

					}
					if (x11 == 3) {

						System.out.println("strudent = 1\n");
						y = input.nextInt();
						switch (y) {
						case 1:
							maperStd.values();
							System.out.println("enter which value");
							String z = input.nextLine();
							std = (Student) maperStd.get(z);
							std.removeStudent(std);
							maperStd.put(std.getEnglishName(), std);

							break;

						default:
							System.out.println("wrong input");

							break;
						}

					}
					if (x11 == 4) {
						System.out.println("add =1 \n change =2\n remove = 3\n");
//tracks
						int t = input.nextInt();

						switch (t) {

						case 1:
							track.add(std.getId(), std.getEnglishName());
							note.studentNote("waitting for approval");

							break;
						case 2:
							track.change();

							break;
						case 3:
							System.out.println("enter the id from map");
							track.getMapper();
							int g = input.nextInt();

							track.remove(g);

							break;

						default:
							System.out.println("wrong input");

							break;
						}

					} else {

					}
					break;

				case 4:
					Writer fw = null;
					Writer fwHTML = null;
					fw = new FileWriter("FA.txt");
					fwHTML = new FileWriter("FAHTML.txt");
					// print        ◦ Header: report title, student name, university name, school name, program name and current date.
//			        ◦ Content: track number, track name and priority.
//			        ◦ Footer: sum of marks.
					StringBuilder st = new StringBuilder("Student Report\n").append("name : ").append(std.getEnglishName()).append("\nUni : ").append(std.getUniversity()).append("\nschool : ").append(std.getSchool()).append("\nprogramme : ").append(std.getProgramme()).append("\nDate : ").append(LocalDate.now());
					StringBuilder stHTML = new StringBuilder("\"<html><head><title>Student Report</title></head><body>\n").append(" <h3><li>\n name : ").append(std.getEnglishName()).append("\nUni : ").append(std.getUniversity()).append("\nschool : ").append(std.getSchool()).append("\nprogramme : ").append(std.getProgramme()).append("\nDate : ").append(LocalDate.now()).append("</li></h3>");
					st.append("Conetent \n").append(track.toString());
					
					st.append("sum = ").append(std.getFinalAverage());
					System.out.println(st);
					fw.write(st.toString());
					fw.close();
					fwHTML.write(stHTML.toString());
					fwHTML.close();
					
					//had no time html here
					
					break;
				case 5:

					Shaparry shape = new Shaparry();

					Shape shaperc = shape.createShape("circle");
					shaperc.shapeMaker();
					Shape shapers = shape.createShape("Square");
					shapers.shapeMaker();
					Shape shaperT = shape.createShape("Triangle");
					shaperT.shapeMaker();
					Shape shaperR = shape.createShape("Rectangle");
					shaperR.shapeMaker();
					break;
				default:
					System.out.println("wrong input");

					break;
				}

			} catch (

			Exception e) {
				e.printStackTrace();
				System.out.println("wrong input");
			}

		}
	}
}
