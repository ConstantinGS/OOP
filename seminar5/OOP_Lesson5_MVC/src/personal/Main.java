package personal;

import personal.controllers.UserController;
import personal.model.FileOperation;
import personal.model.FileOperationImpl;
import personal.model.FileOperationImplOld;
import personal.model.Repository;
import personal.model.RepositoryFile;
import personal.model.UserMapper;
import personal.model.UserMapperNew;
import personal.model.UserMapperOld;
import personal.views.ViewUser;

public class Main {
    public static void main(String[] args) {

        FileOperation fileOperation = new FileOperationImplOld("user_old.txt");
        UserMapper mapper = new UserMapperOld();

        Repository repository = new RepositoryFile(fileOperation, mapper);
        UserController controller = new UserController(repository);
        ViewUser view = new ViewUser(controller);
        view.run();
    }
}
