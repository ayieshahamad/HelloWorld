package july18interface;

public class Rectangle implements Measureable {
    double height ;
    double width;
    public Rectangle(){
        height = 5;
        width = 5;
    }
    public Rectangle(double height,double width){
        this.height = height;
        this.width = width;
    }
    @Override
    public double calculateArea() {
        return (height*width);
    }

    @Override
    public double calculateCircumference() {
        return (height+width)*2;
    }
}
