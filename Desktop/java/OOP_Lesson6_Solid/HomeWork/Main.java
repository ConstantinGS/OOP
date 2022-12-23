import Model.Persister;
import Model.Persister1;
import Model.Persister2;
import Model.Reporter;
import Model.User;

public class Main {
	public static void main(String[] args) {

		Persister saver = new Persister1("HomeWork/File1.txt");
		Reporter reporter = new Reporter(saver.getFile());

		Persister saver2 = new Persister2("HomeWork/File2.txt");
		Reporter reporter2 = new Reporter(saver2.getFile());

		User user = new User("Bob");

		saver.save(user);
		reporter.report("Company");

		saver2.save(user);
		reporter2.report("Company");

	}
}