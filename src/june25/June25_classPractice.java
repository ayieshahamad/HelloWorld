package june25;

public class June25_classPractice {

    public static void main(String[] args) {

        calculator();
    }
    private static void que1(){
        //1- even odd num
        int num = 10;
        if(num % 2 == 0)
            System.out.println("Even");
        else
            System.out.println("Odd");
    }
    private static void que2(){
        //2- print Hello
        for (int i =0; i<10;i++){
            System.out.println("Hello");
        }
    }
    private static void calculator()
    {
        /*int sq = square(17);
        System.out.println("Square of 17 is " + sq);
        int remainder = modulus(589,45);
        System.out.println("the remainder of 589 / 45 is " + remainder);
        int sum = add(49,34);
        System.out.println("49 + 34 = "+ sum);*/

        System.out.println("Square of 17 is " + square(17));
        System.out.println("the remainder of 589 / 45 is " + modulus(589,45));
        System.out.println("49 + 34 = "+ add(49,34));
    }
    public static int add(int x, int y)
    {
        return (x+y);
    }
    public static int modulus(int x,int y)
    {
        return x%y;
    }
    public static int square(int x)
    {
        return  (x*x);
    }
}
