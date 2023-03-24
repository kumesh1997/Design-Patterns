package Calculator;

public class Operator {
    static  Operations operations = null;
    public static Operations selectOperation(String operator){
        if (operator.equals("add")){
            operations = new AddOperations();
        } else if (operator.equals("sub")) {
            operations = new SubOperations();
        } else if (operator.equals("mul")) {
            operations = new MulOperations();
        } else if (operator.equals("divide")) {
            operations = new DevideOperations();
        }else {
            System.out.println("Yay Yay Yay !!");
        }
        return operations;
    }
}
