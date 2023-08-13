package classdiagram;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

public class EmpDAO {
	
	public List<Emp> selectAll(){
		return null;
	}

	public void insert(Emp emp) {
		
		try {
			Connection c = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "scott", "tiger");
			PreparedStatement ps = c.prepareStatement("insert into emp(empno, ename, sal) values(?, ?, ?)");
			
			ps.setInt(1, emp.getId());
			ps.setString(2, emp.getName());
			ps.setDouble(3, emp.getSalary());
			
			ps.executeUpdate();
			
			
			c.close();
			
			System.out.println("Record inserted successfully");
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		
	}

	public void update(Emp emp) {
		System.out.println("Record updated successfully");
	}

}
