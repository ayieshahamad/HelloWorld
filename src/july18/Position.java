package july18;

public class Position {
    int x;
    int y;
    public Position(){
        x=0;
        y=0;
    }
    public Position(int x, int y){
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public void increamentCoord(int incX, int incY, int decX, int decY){
        x = x + incX - decX;
        y = y + incY - decY;
    }
    public void setXY(int x, int Y){
        this.x = x;
        this.y = y;
    }

}
/*Question 1
Implement the class Position that represents a coordinate (x, y).
Each position is defined by two integer values ​​x and y.
Available operations are: · Default constructor, corresponds to the position (0,0).
· Constructor with initial values ​​of X and Y
· Methods for modifying and querying (set / get) the attributes of the class.
· Methods for increasing and decreasing the values ​​of each of the position coordinates (incX, incY, decX, decY).
· A method for setting coordinate values ​​(setXY)*/
