package printMessage;

import exceptions.LargeNumberException;

public class Messages {
    public static void enterNumberMessage() {
        System.out.println("Enter integer:");
    }

    public static void enterOperatorMessage() {
        System.out.println("Enter operator(+,-,* or /): ");
    }

    public static void incorrectOperatorMessage(){
        System.out.println("Incorrect operator!!!");
    }

    public static void printResult(float result) throws LargeNumberException {
        if(result>100){
            throw new LargeNumberException("Result is > 100");
        }
        System.out.println("\nResult: " + result);
    }
}
