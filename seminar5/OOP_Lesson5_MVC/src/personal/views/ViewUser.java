package personal.views;

import personal.controllers.UserController;
import personal.model.User;

import java.util.Scanner;

public class ViewUser {

    private UserController userController;

    public ViewUser(UserController userController) {
        this.userController = userController;
    }

    public void run() {
        Commands com = Commands.NONE;

        while (true) {
            String command = prompt(" \n Введите команду: \n");
            try {
                com = Commands.valueOf(command);
            } catch (IllegalArgumentException e) {
                System.out.println("Неопознанная команда");
            }

            if (com == Commands.EXIT)
                return;
            try {
                switch (com) {

                    case CREATE:
                        userController.saveUser(setUser(false));
                        break;

                    case READ:
                        String id = prompt("Идентификатор пользователя: ");
                        User readeduser = userController.readUser(id);
                        System.out.println(readeduser);

                        break;

                    case LIST:

                        for (User iterable_element : userController.userList()) {
                            System.out.println(iterable_element);
                            System.out.println();
                        }
                        break;

                    case UPDATE:

                        User updatedUser = setUser(true);
                        userController.updatUser(updatedUser);

                    case DELETE:
                        String id_delUser = prompt("Идентификатор пользователя: ");
                        userController.deleteUser(id_delUser);
                        System.out.printf("Пользователь удален \n");

                }
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
    }

    private String prompt(String message) {
        Scanner in = new Scanner(System.in);
        System.out.print(message);
        return in.nextLine();
    }

    private User setUser(boolean forUpdate) {
        String userId = "";
        if (forUpdate) {
            userId = prompt("Идентификатор: ");
        }
        String firstName = prompt("Имя: ");
        String lastName = prompt("Фамилия: ");
        String phone = prompt("Номер телефона: ");

        if (forUpdate) {
            return new User(userId, firstName, lastName, phone);
        }
        return new User(firstName, lastName, phone);

    }

}
