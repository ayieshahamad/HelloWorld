package july30;

public class MainDivideProgram {
    public static void main(String [] args){
        Calculator calculator = new Calculator(10,0);
        OperationCode operationCode = new OperationCode();
        int result =0;
        /*int result = calculator.divide( operationCode);

        if(operationCode.getValue() == 0)
            System.out.println(" result = " + result);
        else if(operationCode.getValue() == 1)
            System.out.println("Arithematic Error");*/
        try {
            result = calculator.divideFunction(1, 0);
        }
        catch (ArithmeticException e){
            System.out.println(e.getStackTrace());
        }


    }
}
