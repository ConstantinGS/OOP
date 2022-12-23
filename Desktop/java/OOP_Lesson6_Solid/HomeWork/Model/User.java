package Model;

public class User {

	@Override
	public String toString() {
		return name;
	}

	private String name;

	public User(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

}