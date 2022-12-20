package OOP_Calculator.views;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import OOP_Calculator.controllers.UserController;

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

                    case SUM:
                        System.out.println(userController.sum(inNumbers()));
                        break;

                    case MUL:
                        System.out.println(userController.mul(inNumbers()));
                        break;

                    case DIV:
                        System.out.println(userController.dib(inNumbers()));
                        break;

                    case SUB:
                        System.out.println(userController.sub(inNumbers()));
                        break;

                    case LOG:
                        for (String str : userController.readLog()) {
                            System.out.println(str);
                        }
                        break;

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

    private List<String> inNumbers() {
        String fSumNumber = prompt("Введите первое число  ");
        String sSumNumber = prompt("Введите второе число  ");

        List<String> string = new ArrayList<String>();
        string.add(fSumNumber);
        string.add(sSumNumber);

        return string;

    }
}
