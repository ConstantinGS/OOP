package Desktop.java.seminar3;

public class User {
	
	@Override
	public String toString() {
		return "User [nameUser=" + nameUser + "]";
	}
	public User(String nameUser) {
		this.nameUser = nameUser;
	}
	
	String nameUser;
	User nextUser;
	
}
