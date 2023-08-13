package advprog;

import java.util.Vector;

public class TestVector {

	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static void main(String[] args) {
		
		Vector vs = new Vector();
		Vector vl = new Vector();
		Vector<String> vstring = new Vector<String>();
		Vector<Employee> ve = new Vector<Employee>();
		
		vs.addElement("Hamzeh");
		vs.addElement("Asefan");
		vl.addElement(1);
		vl.addElement(vs);
		vl.addElement(1000.90);
		System.out.println(vl);
		System.out.println("Element at pos 2 " + vl.elementAt(2));
		System.out.println("Element at pos 1 " + ((Vector)vl.elementAt(1)).elementAt(1));
		
		vstring.addElement("Hamzeh");
		vstring.addElement("Asefan");
		// vstring.addElement(100); The method addElement(String) in the type Vector<String> is not applicable for the arguments (int)
		
		Employee e1 = new Employee(1, "Ahmed", 2000);
		Employee e2 = new Employee(2, "Ali", 1000);
		ve.addElement(e1);
		ve.addElement(e2);

		System.out.println(ve);
		System.out.println(ve.elementAt(0).getName());
		
	}

}
