package july20;

public class Gato implements Animal {
    @Override
    public void move() {
        System.out.println("Gato moving");
    }

    @Override
    public void eat() {
        System.out.println("Gato eating");
    }
}
