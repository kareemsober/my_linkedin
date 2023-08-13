package advprog;

public class CircleAssignment {

	private int radius;
	public static final double PI = 3.14;

	public CircleAssignment() {

	}

	public CircleAssignment(int radius) {
		this.radius = radius;
	}

	public double getArea() {
		return  PI * radius * radius;
	}

	public double getRound() {
		return 2 * PI * radius;
	}

	public int getRadius() {
		return radius;
	}

	public void setRadius(int radius) {
		this.radius = radius;
	}

	@Override
	public String toString() {
		return "Circle [radius=" + radius + " Area:" + getArea() + " round:" + getRound() + "]";
	}

	@Override
	public boolean equals(Object obj) {
		if (obj instanceof CircleAssignment) {
			CircleAssignment that = (CircleAssignment) obj;
			return this.radius == that.getRadius();
		}
		return false;
	}

}
