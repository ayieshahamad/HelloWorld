package july18interface;

public class Circle implements Measureable{
    private double radius;

    public Circle(){
        radius = 5;
    }
    public Circle(int radius){
        this.radius = radius;
    }
    @Override
    public double calculateArea() {
        return (radius*3.14);
    }

    @Override
    public double calculateCircumference() {
        return (2*3.14*radius);
    }
}
