package july16;

public class Practice {
    private static int screen;
    public static void main(String [] args){

        screen = 8;
        //Sting is immutable
        String a = "abc";
        String b = a;
        b = "DJ";
        System.out.println(b);
        System.out.println(a);

        // object is by ref
        Person A = new Person();
        A.setName("A");
        Person B = A;
        B.setName("B");
        System.out.println(A.getName());
    }
    public void modify(){
        screen = 8;
    }
}
