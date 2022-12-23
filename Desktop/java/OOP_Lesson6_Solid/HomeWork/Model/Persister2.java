package Model;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Persister2 implements Persister {

	private String fileName;

	public Persister2(String fileName) {
		this.fileName = fileName;
	}

	@Override
	public void fileOperation(String fileName) {
		this.fileName = fileName;
		try (FileWriter writer = new FileWriter(fileName, true)) {
			writer.flush();
		} catch (IOException ex) {
			System.out.println(ex.getMessage());
		}
	}

	@Override
	public void save(User user) {

		try (FileWriter writer = new FileWriter(fileName, true)) {

			writer.write(user.toString() + "; \n ----------- \n ");
			writer.flush();

		} catch (IOException ex) {
			System.out.println(ex.getMessage());
		}

	}

	@Override
	public String getFile() {
		return fileName;
	}

}