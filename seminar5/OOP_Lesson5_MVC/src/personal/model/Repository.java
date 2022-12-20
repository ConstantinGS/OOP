package personal.model;

import java.util.List;

public interface Repository {

    List<User> getAllUsers();

    String CreateUser(User user);

    User updatUser(User user) throws Exception;

    User readUser(String userId) throws Exception;

    List<User> deleteUser(String userId) throws Exception;

}
