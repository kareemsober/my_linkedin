package FA;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;


public class Track {

	private int id;
	private String englishName;
	private Map<Integer, String> mapper = new HashMap<Integer, String>();
//	private Map<String, String> mapper1 = new HashMap<>();
	private int indecator;
	private String list[] = { "java", "python", "C++", "C#", "Flater" };
	private int q;
	private double mark;

	public void add(int id, String name) {
		Scanner input = new Scanner(System.in);
//
//		System.out.println("please enter the id for the student");
		this.id = id;
		this.englishName = name;
		int x;
		System.out.println("add the minimum of 2 subjects");
		System.out.println(list);
		System.out.println("make your choise accorrding to the most imortant one first");
		for (int i = 0; i < list.length; i++) {
			q = i;
			System.out.println("enter try number = " + (q + 1));
			x = input.nextInt();
			mapper.put(q + 1, list[x]);

		}

	}

	public void remove(int x) {
		mapper.entrySet();
		mapper.remove(x);

	}

	public void change() {
		Scanner input = new Scanner(System.in);
		System.out.println("replace ");

		int x = input.nextInt();
		String z = mapper.get(x);
		System.out.println("with");

		int y = input.nextInt();
		mapper.replace(x, mapper.get(y));
		mapper.replace(y, z);
	}
//	private void notefication() {
//		
//		
//		
//		
//	}
	

	public Map<Integer, String> getMapper() {
		mapper.entrySet();
		return mapper;
	}

	public int getId() {
		return id;
	}

	public String getEnglishName() {
		return englishName;
	}

	public int getIndecator() {
		return indecator;
	}

	public String[] getList() {
		return list;
	}

	public int getQ() {
		return q;
	}

	public double getMark() {
		return mark;
	}

	public void setMark(double mark) {
		this.mark = mark;
	}

	@Override
	public String toString() {
		return "Track [id=" + id + ", englishName=" + englishName + ", mapper=" + mapper + ", indecator=" + indecator
				+ ", list=" + Arrays.toString(list) + ", q=" + q + ", mark=" + mark + "]";
	}

}
