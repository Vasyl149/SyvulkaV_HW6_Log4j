package MainFunctionality;

import PrintMessage.Messages;
import logging.Log;
import logging.LogLevels;

public class SimpleCalculator implements Calculator {
    private int number1, number2;
    private char operator;
    private float result;

    public SimpleCalculator(int number1, char operator, int number2) {
        this.number1 = number1;
        this.number2 = number2;
        this.operator = operator;

    }

    @Override
    public float calculate() throws ArithmeticException {

        switch (operator) {
            case '+':
                result = add();
                break;
            case '-':
                result = subtract();
                break;
            case '*':
                result = multiply();
                break;
            case '/':
                result = divide();
                break;
            default:
                Messages.incorrectOperatorMessage();
        }
        return result;
    }

    public float add() {
        Log.log(LogLevels.INFO, "Values are added");
        return number1 + number2;
    }

    public float subtract() {
        Log.log(LogLevels.INFO, "Values are subtracted");
        return number1 - number2;
    }

    public float multiply() {
        Log.log(LogLevels.INFO, "Values are multiplied");
        return number1 * number2;
    }

    public float divide() {
        float _result;
        if (number2 == 0) {
            throw new ArithmeticException("Don't divide by zero");
        } else {
            _result = (float) number1 / number2;
        }
        Log.log(LogLevels.INFO, "Values are divided ");
        return _result;
    }

}
