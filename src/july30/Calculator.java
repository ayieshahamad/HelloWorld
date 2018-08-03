package july30;

public class Calculator {
    int x;
    int y;
    public Calculator(int x ,int y){
        this.x=x;
        this.y =y;
    }
    public int divide(OperationCode opertionCode){
        int res =0;
        opertionCode.setValue(0);
        if(y != 0)
            res =  x/ y;
        else
           opertionCode.setValue(1);


        return res;
    }
    public int divideFunction (int x , int y ) throws ArithmeticException
    {
        if(y == 0) throw  new ArithmeticException();

        return x/y;
    }
}
