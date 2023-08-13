package advprog;

public class Bicycle implements Vehicle {

	int speed;
	int gear;

	@Override
	public void changeGear(int newGear) {
		this.gear = newGear;
	}

	@Override
	public void speedUp(int increment) {
		speed = speed + increment;

	}

	@Override
	public void applyBrakes(int decrement) {
		speed = speed - decrement;

	}

	public void printStates() {
		System.out.println("Bicycle -> Speed: " + speed + " Gear: " + gear + "\n");
	}

}
