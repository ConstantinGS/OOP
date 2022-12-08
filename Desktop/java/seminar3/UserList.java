package Desktop.java.seminar3;
import java.io.*;
import java.util.Iterator;

public class UserList implements Iterable<User>{
	
	User iUser;
	
	public UserList addUser(UserList uList, String nameUser) {
		User newUser = new User(nameUser);
		
		if (uList.iUser == null) {
			uList.iUser = newUser;
		}
		
		else {
			User last = uList.iUser;
			while (last.nextUser!=null) {
				last = last.nextUser;
			}
			last.nextUser = newUser;
		}
		return uList;
		
	}

	// public void printList(User object)
	// {
	// 	User printedUser = object.iUser;
		
	// 	System.out.print("Linked list: ");
		
	// 	while (printedUser!=null) {
			
	// 		System.out.print(printedUser.nameUser + " \n");
	// 		printedUser = printedUser.nextUser;
	// 	}
		
		
	// }

	
	@Override
	public Iterator iterator() {
		
		return new UserIterator(iUser);
	}


	
	
	

}