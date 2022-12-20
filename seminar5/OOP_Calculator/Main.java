package OOP_Calculator;

import OOP_Calculator.controllers.UserController;
import OOP_Calculator.model.Logs;
import OOP_Calculator.model.MathOperation;
import OOP_Calculator.model.MathOperationCom;
import OOP_Calculator.model.MathOperationRac;
import OOP_Calculator.views.ViewUser;

public class Main {

    public static void main(String[] args) {

        Logs logs = new Logs("OOP_Calculator/log.txt");
        MathOperation mathOperation = new MathOperationCom(logs);
        UserController controller = new UserController(mathOperation, logs);
        ViewUser view = new ViewUser(controller);
        view.run();

    }

}
