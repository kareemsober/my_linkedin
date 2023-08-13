package FA;

public class Notification {
	private String note = null;
	private int y;
	private int h;

	public void studentNote(String x) {

		this.note = x;

	}

	public void adminChecker(int x) {
		if (x == 1) {

			 y = 1;

		} else {
			 y = 0;
		}

	}

	public void instChecker(int y) {
		if (y == 1) {

			 this.h = 1;

		} else {
			 this.h = 0;
		}

	}

	public int ifAllowe() {

		if (this.h==1 && this.y ==1) {
			
			return 1;
			
		}else {
			return 0;
		}
	}

	public String getNote() {
		return note;
	}

	public int getY() {
		return y;
	}

	public int getH() {
		return h;
	}
	
}
