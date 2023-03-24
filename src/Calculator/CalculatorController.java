package Calculator;

public class CalculatorController {
    public static void runCalculator(){
        // Instance of an UserInput Class
        UserInput userInput = new ComandLineUserInput();

        // Getting Inputs from Command Line Interface
        int a = userInput.GetDoubleInput("Enter the First Number :");
        int b = userInput.GetDoubleInput("Enter the Second Number :");
        String operator = userInput.GetOperatorType("Enter the Type of Operator :");

        // Instance of Operations Object
        Operations operations = Operator.selectOperation(operator);
        // The Actual Calculation
        double result = operations.perform(a,b);

        System.out.println("Result is -> "+ result);
    }
}
