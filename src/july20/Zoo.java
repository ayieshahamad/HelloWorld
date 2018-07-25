package july20;

public class Zoo {

    public static void main(String [] args){
        Animal animal;
        Dog dog = new Dog();
        animal = dog;
        animal.move();
        animal.eat();
        ((Dog) animal).bark();

        animal = new Gato();
        animal.eat();
        animal.move();
    }

}
