package july18interface;

public class Triangle implements Measureable {
    double height ;
    double width;
    double diagonal;
    public Triangle(){
        height = 5;
        width = 5;
        diagonal = 5;
    }
    public Triangle(double height,double width,double diagonal){
        this.height = height;
        this.width = width;
        this.diagonal = diagonal;
    }
    @Override
    public double calculateArea() {
        return (height*width)/2;
    }

    @Override
    public double calculateCircumference() {
        return height + width + diagonal ;
    }
}
