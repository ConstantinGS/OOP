package OOP_Calculator.model;

import java.util.List;

public class MathOperationRac implements MathOperation {

    private Logs logs;

    public MathOperationRac(Logs logs) {
        this.logs = logs;
    }

    @Override
    public Float mulOperation(List<String> numbers) {
        Float answer = (float) 0.0;
        String operation = String.join(" * ", numbers);

        for (String string : numbers) {
            answer = answer * Float.parseFloat(string);
        }
        operation = operation + " = " + Float.toString(answer);

        logs.saveAllLines(operation + "\n");

        return answer;
    }

    @Override
    public String sumOperation(List<String> numbers) {
        Float answer = (float) 0.0;
        String operation = String.join(" + ", numbers);

        for (String string : numbers) {
            answer = answer + Float.parseFloat(string);
        }
        operation = operation + " = " + Float.toString(answer);

        logs.saveAllLines(operation + "\n");

        return Float.toString(answer);
    }

    @Override
    public Float dibOperation(List<String> numbers) {
        Float answer = (float) 0.0;
        String operation = String.join(" / ", numbers);

        for (String string : numbers) {
            answer = answer / Float.parseFloat(string);
        }
        operation = operation + " = " + Float.toString(answer);

        logs.saveAllLines(operation + "\n");

        return answer;
    }

    @Override
    public Float subOperation(List<String> numbers) {
        Float answer = (float) 0.0;
        String operation = String.join(" - ", numbers);

        for (String string : numbers) {
            answer = answer - Float.parseFloat(string);
        }
        operation = operation + " = " + Float.toString(answer);

        logs.saveAllLines(operation + "\n");

        return answer;
    }

}
