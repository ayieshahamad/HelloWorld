package july20;

public class Dog implements Animal {

    public void bark(){
        System.out.println("Dog: barking  ");
    }
    @Override
    public void move() {
        System.out.println("Dog: moving");
    }

    @Override
    public void eat() {
        System.out.println("Dog eating");
    }
}
