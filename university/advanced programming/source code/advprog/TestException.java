package advprog;

public class TestException {

	public static void main(String[] args) {
		
		try {
			int[] a = {1, 7, 3};
			System.out.println(a[4]);
		} catch (Exception e) {
			System.out.println("Please check your input");
		}
		
	}

}
