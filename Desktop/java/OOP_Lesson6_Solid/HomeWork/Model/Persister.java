package Model;

import java.io.File;

public interface Persister {

	public void fileOperation(String fileName);

	public void save(User user);

	public String getFile();

}