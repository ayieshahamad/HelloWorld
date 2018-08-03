package aug1;

public class Meat {
    private String name;
    private double price;
    public Meat(String name){
        this.name = name;
        price = 0.5;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getPrice() {
        return price;
    }
    public void add(){
        System.out.println(name + " added");
    }
}
