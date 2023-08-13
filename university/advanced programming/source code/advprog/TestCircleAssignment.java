package advprog;

public class TestCircleAssignment {

	public static void main(String[] args) {
		
		CircleAssignment c1 = new CircleAssignment();
		CircleAssignment c2 = new CircleAssignment(7);
		
		c1.setRadius(5);
		
		System.out.println(c1.getArea() + " " + c1.getRound());
		System.out.println(c2.getArea() + " " + c2.getRound());
		
		System.out.println(c1);
		System.out.println(c2);

	}

}
