package Calculator;

public class SubOperations implements Operations{
    @Override
    public double perform(int a, int b) {
        if (a>b){
            return a-b;
        }else {
            return b-a;
        }
    }
}
