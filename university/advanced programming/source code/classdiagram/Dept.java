package classdiagram;

public class Dept {

	private String name;

	public Dept(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Dept [name=" + name + "]";
	}

}
