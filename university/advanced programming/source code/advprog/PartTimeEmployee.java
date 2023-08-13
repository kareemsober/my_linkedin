package advprog;

public class PartTimeEmployee extends Employee {
	
	public PartTimeEmployee() {
		super(99, "???", 1000.0);
	}
	
	private int hour;

	public int getHour() {
		return hour;
	}

	public void setHour(int hour) {
		this.hour = hour;
	}

}
