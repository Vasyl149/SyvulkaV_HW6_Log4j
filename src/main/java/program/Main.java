package program;

import console.ReadConsole;
import exceptions.LargeNumberException;
import mainFunctionality.SimpleCalculator;
import printMessage.Messages;
import logging.Log;
import logging.LogLevels;


public class Main {

    public static void main(String[] args) {

        // Uncomment code below to run all log levels

//        Log.log(LogLevels.TRACE, "This is a trace message");
//        Log.log(LogLevels.DEBUG, "This is a debug message");
//        Log.log(LogLevels.INFO, "This is an info message");
//        Log.log(LogLevels.WARN, "This is a WARN message");
//        Log.log(LogLevels.ERROR, "This is an error message");
//        Log.log(LogLevels.FATAL, "This is FATAL message");
//        System.exit(0);

        ReadConsole readConsole = new ReadConsole();
        SimpleCalculator simpleCalculator = new SimpleCalculator(
                readConsole.getInt(),
                readConsole.getOperator(),
                readConsole.getInt()
        );

        try {
            Messages.printResult(simpleCalculator.calculate());
        } catch (ArithmeticException ex) {
            Log.log(LogLevels.ERROR, "Exception occurred: " + ex);
            System.out.println("Exception occurred: " + ex);
        } catch (LargeNumberException e) {
            Log.log(LogLevels.FATAL, "Exception occurred: " + e);
            System.out.println("Exception occurred: " + e);
        } finally {
            System.out.println("\nThank you for using our product!");
            Log.log(LogLevels.WARN, "Program finished");
        }

    }
}
