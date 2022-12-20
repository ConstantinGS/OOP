package OOP_Calculator.model;

import java.util.List;

public class MathOperationCom implements MathOperation {

    private Logs logs;

    public MathOperationCom(Logs logs) {
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
        Float racPart = (float) 0.0;
        Float comPart = (float) 0.0;
        String operation = numbers.get(0) + " + " + numbers.get(1);

        for (String iterN : numbers) {
            String numb1 = "";
            String numb2 = "";
            int count = 0;
            if (iterN.charAt(0) == '-') {
                numb1 += "-";
                count++;
            }
            while ((count < iterN.length()) && ((iterN.charAt(count)) != '-') && (iterN.charAt(count) != '+')) {
                numb1 += iterN.charAt(count);
                count++;
            }
            while (count < iterN.length() - 1 && iterN.charAt(count) != 'j') {
                numb2 += iterN.charAt(count);
                count++;
            }
            racPart += Float.parseFloat(numb1);
            comPart += Float.parseFloat(numb2);

        }
        String answer = Float.toString(racPart) + " + " + Float.toString(comPart) + "j";
        logs.saveAllLines(operation + " = " + answer + "\n");

        return answer;

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
    public String subOperation(List<String> numbers) {
        Float racPart = (float) 0.0;
        Float comPart = (float) 0.0;
        String operation = numbers.get(0) + " - " + numbers.get(1);

        for (String iterN : numbers) {
            String numb1 = "";
            String numb2 = "";
            int count = 0;
            if (iterN.charAt(0) == '-') {
                numb1 += "-";
                count++;
            }
            while ((count < iterN.length()) && ((iterN.charAt(count)) != '-') && (iterN.charAt(count) != '+')) {
                numb1 += iterN.charAt(count);
                count++;
            }
            while (count < iterN.length() - 1 && iterN.charAt(count) != 'j') {
                numb2 += iterN.charAt(count);
                count++;
            }
            racPart += Float.parseFloat(numb1);
            comPart += Float.parseFloat(numb2);

        }
        String answer = Float.toString(racPart) + " - " + Float.toString(comPart) + "j";
        logs.saveAllLines(operation + " = " + answer + "\n");

        return answer;

    }

}
