package FA.factory;

public class Shaparry {
	public Shape createShape(String x) {
		if (x.equalsIgnoreCase("circle")) {
			return new Circle();

		}
		if (x.equalsIgnoreCase("square")) {
			return new Square();

		}		if (x.equalsIgnoreCase("Triangle")) {
			return new Triangle();

		}		if (x.equalsIgnoreCase("rectangle")) {
			return new Rectangle();

		}else {
			return null;
		}

	}

}
