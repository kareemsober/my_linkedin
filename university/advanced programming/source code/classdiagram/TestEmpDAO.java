package classdiagram;

public class TestEmpDAO {

	public static void main(String[] args) {
		
		EmpDAO dao = new EmpDAO();
		Emp emp = new Emp(2, "Jazi", 1500);
		
		dao.insert(emp);
	}

}
