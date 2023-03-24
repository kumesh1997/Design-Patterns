package Calculator;

import java.util.Scanner;

public class ComandLineUserInput implements UserInput{

    Scanner scanner1 = new Scanner(System.in);
    Scanner scanner2 = new Scanner(System.in);
    @Override
    public int GetDoubleInput(String message) {
        System.out.println(message);
        return scanner1.nextInt();
    }

    @Override
    public String GetOperatorType(String message) {
        System.out.println(message);
        return scanner2.nextLine();
    }
}
