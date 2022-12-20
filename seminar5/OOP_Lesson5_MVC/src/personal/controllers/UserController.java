package personal.controllers;

import personal.model.Repository;
import personal.model.User;

import java.util.List;

public class UserController {
    private final Repository repository;

    public UserController(Repository repository) {
        this.repository = repository;
    }

    public void saveUser(User user) throws Exception {
        validDateUser(user);
        repository.CreateUser(user);
    }

    public List<User> deleteUser(String userId) throws Exception {

        return repository.deleteUser(userId);

    }

    public User readUser(String userId) throws Exception {

        return repository.readUser(userId);

    }

    public List<User> userList() {
        return repository.getAllUsers();
    }

    public User updatUser(User user) throws Exception {
        validDateUser(user);
        return repository.updatUser(user);
    }

    private void validDateUser(User user) throws Exception {
        if (user.getFirstName().isEmpty()) {
            throw new Exception("Отсутствует имя");
        }
        if (user.getLastName().isEmpty()) {
            throw new Exception("Отсутствует фамилия");
        }
        if (user.getPhone().isEmpty()) {
            throw new Exception("Отсутствует телефон");
        }

    }

}
