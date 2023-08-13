package FA.factory;

import FA.Shaparry;
import FA.Shape;

public class main {
public static void main(String[] args) {
	
	Shaparry shape = new Shaparry();

	Shape shaperc = shape.createShape("circle");
	shaperc.shapeMaker();
	Shape shapers = shape.createShape("Square");
	shapers.shapeMaker();
	Shape shaperT = shape.createShape("Triangle");
	shaperT.shapeMaker();
	Shape shaperR = shape.createShape("Rectangle");
	shaperR.shapeMaker();}
}
