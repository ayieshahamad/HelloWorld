package july18interface;

public class MainProgram {
    public static void main(String [] args){

        Circle circle = new Circle();
        Rectangle rectangle = new Rectangle();
        Triangle triangle = new Triangle();

        System.out.println(triangle.calculateArea());
        System.out.println(triangle.calculateCircumference());

        System.out.println(areaComparison(rectangle,circle));
        System.out.println(circumferenceComparison(rectangle,triangle));

    }
    public static boolean areaComparison(Measureable shap1, Measureable shape2){
        return (shap1.calculateArea() > shape2.calculateArea());
    }
    public static boolean circumferenceComparison(Measureable shap1, Measureable shape2){
        return (shap1.calculateCircumference() > shape2.calculateCircumference());
    }


}
