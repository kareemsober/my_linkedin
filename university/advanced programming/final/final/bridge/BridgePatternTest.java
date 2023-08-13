package FA.bridge;

import FA.bridge.GreenColor;
import FA.bridge.Pentagon;
import FA.bridge.RedColor;
import FA.bridge.Shape;
import FA.bridge.Triangle;

public class BridgePatternTest {

	public static void main(String[] args) {
		Shape tri = new Triangle(new RedColor());
		tri.applyColor();
		
		Shape pent = new Pentagon(new GreenColor());
		pent.applyColor();
	}

}