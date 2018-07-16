package july9;

public class Bicycle {
    private int speed;
    private String color;
    private int maximumSpeed;
    //contructors
    public  Bicycle(){
        speed = 0;
        maximumSpeed = 25;
        color = "white";
    }
    public Bicycle(int speed, String color, int maximumSpeed){
        this.speed = speed;
        this.color = color;
        this.maximumSpeed = maximumSpeed;
    }
    //setters
    public void setSpeed(int speed){
        this.speed = speed;
    }
    public void setColor(String color){
        this.color = color;
    }
    public void setMaximumSpeed(int maximumSpeed){
        this.maximumSpeed = maximumSpeed;
    }
    //getters
    public int getSpeed(){
        return speed;
    }
    public int getMaximumSpeed() {
        return maximumSpeed;
    }
    public String getColor() {
        return color;
    }
    //functions
    public void accelerate(int amount){
        if( (speed + amount) > maximumSpeed)
            speed = maximumSpeed;
        else
            speed = speed + amount;
    }

    public void brake(int amount){
        //decrecase speed by amount , down to 0
        if((speed-amount) < 0)
            speed = 0;
        else
            speed = speed - amount;
    }
    public String toString(){
        return "Speed = "+speed+
                " Color = "+color+
                " Maximum Speed = "+maximumSpeed;
    }
}
