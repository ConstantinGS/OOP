package OOP_Calculator.controllers;

import java.util.List;

import OOP_Calculator.model.Logs;
import OOP_Calculator.model.MathOperation;

public class UserController {

    private final MathOperation racMathOperation;
    private final Logs logs;

    public UserController(MathOperation racMathOperation, Logs logs) {
        this.racMathOperation = racMathOperation;
        this.logs = logs;
    }

    public String sum(List<String> numbers) {
        return racMathOperation.sumOperation(numbers);
    }

    public Float mul(List<String> numbers) {
        return racMathOperation.mulOperation(numbers);
    }

    public String sub(List<String> numbers) {
        return racMathOperation.subOperation(numbers);
    }

    public Float dib(List<String> numbers) {
        return racMathOperation.dibOperation(numbers);
    }

    public List<String> readLog() {
        return logs.readAllLines();
    }

}
