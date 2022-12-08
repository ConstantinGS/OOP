package Desktop.java.seminar3;
public class Main {
	
	public static void main(String[] args)
	{
		UserList uList = new UserList();
		uList.addUser(uList, "Dima");
		uList.addUser(uList, "Igor");
		uList.addUser(uList, "Egor");
		uList.addUser(uList, "Oleg");
		
		

		for (User object : uList) {
			System.out.println(object);
		}
		



	}

}