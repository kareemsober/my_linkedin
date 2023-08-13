package advprog;

public class TestShape {

	public static void main(String[] args) {

		Rectangle rectangle = new Rectangle(5, 10);
		Circle circle = new Circle(7);

		rectangle.print("Rectangle");
		System.out.println("Rectangle: " + rectangle.calcArea() + "\n");
		
		circle.print("Circle");
		System.out.println("Circle:    " + circle.calcArea());
		

	}

}
