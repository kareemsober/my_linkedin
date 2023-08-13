package advprog;

public abstract class Shape {

	public abstract double calcArea();

	public void print(String shapeName) {
		System.out.println("Shape Name: " + shapeName);
	}

}
