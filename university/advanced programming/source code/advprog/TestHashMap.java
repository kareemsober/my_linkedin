package advprog;

import java.util.HashMap;

public class TestHashMap {

	public static void main(String[] args) {
		
		HashMap<String, String> capitalCities = new HashMap<String, String>();
		HashMap<Integer, Employee> emps = new HashMap<Integer, Employee>();
		
		capitalCities.put("Jordan", "Amman");
		capitalCities.put("Palistine", "Al-Qudes");
		capitalCities.put("Iraq", "Baghdad");
		System.out.println(capitalCities);
		System.out.println(capitalCities.get("Jordan"));
		
		emps.put(1, new Employee(1, "Ali", 1000));
		emps.put(2, new Employee(2, "Sami", 750));
		System.out.println(emps);
		System.out.println(emps.get(1).getName());
	}
}
