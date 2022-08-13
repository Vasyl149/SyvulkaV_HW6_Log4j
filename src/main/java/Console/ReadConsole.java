package Console;

import PrintMessage.Messages;

import java.util.Scanner;

public class ReadConsole extends Console {
    private static Scanner scanner = new Scanner(System.in);

    @Override
    public int getInt() {
        Messages.enterNumberMessage();
        return scanner.nextInt();
    }

    @Override
    public char getOperator() {
        Messages.enterOperatorMessage();
        return scanner.next().charAt(0);
    }

}
