package july27;

public class Item {
    private String name;
    private String description;
    private double value;

    public Item(String name, String description, double value) {
        this.name = name;
        this.description = description;
        this.value = value;
    }

    public double getValue() {
        return value;
    }

    public double calculateGST(){
        return value*0.08;
    }

    public double calculatePST() {
        return value*0.05;
    }

    public double calculateTotal() {
        return value+calculateGST()+calculatePST();
    }
}
