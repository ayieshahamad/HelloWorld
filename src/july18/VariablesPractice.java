package july18;

public class VariablesPractice {
    public static void main(String [] args){
        //STEP#2 // error - uninitialized variable
        System.out.println("STEP#2");
        int primitiveVariable = 0;
        System.out.println(primitiveVariable);

        //STEP#3 // error uninitialized object
        System.out.println("STEP#3");
        MyClass variableObject = new MyClass();
        System.out.println(variableObject);

        //STEP#4 //error initialization
        System.out.println("STEP#4");
        int [] myPrimitiveArray = new int [5];
        System.out.println(myPrimitiveArray.length);

        //Step#5
        System.out.println("STEP#5");
        System.out.println(myPrimitiveArray[0] +" "+myPrimitiveArray[4] );

        //Step#6 7
        System.out.println("STEP#6 7");
        MyClass []objectArray = new MyClass[5];
        for (int i = 0 ; i < 5 ; i++) {
            objectArray[i] = new MyClass();
            objectArray[i].print();
        }

    }
}
