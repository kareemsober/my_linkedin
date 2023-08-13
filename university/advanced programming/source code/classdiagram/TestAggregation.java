package classdiagram;

public class TestAggregation {

	public static void main(String[] args) {
		
		Address address1 = new Address("Jordan", "Amman", "079.......");
		Address address2 = new Address("Jordan", "Irbid", "077.......");
		
		Employee e1 = new Employee(1, "Ali", 1000, address1);
		Employee e2 = new Employee(2, "Sami", 1200, address2);
		
		System.out.println(e1);
		System.out.println(e2);
		
	}

}
