package aug1;

public class SubsRestaurant {
    //Meat types 1-5
    Meat []meat;
    //salad types 1-5
    //bread single type

    //base price
    private double basePrice ;
    private double totalPrice;
    public SubsRestaurant(){

        basePrice = 1.0;
        totalPrice = basePrice;
        meat = new Meat[5];
        for(int i=0;i<5;i++)
            meat[i] = new Meat("type"+(i+1));
    }

    public double getTotalPrice() {
        return totalPrice;
    }

    public void addMeat(int type, int quantity){
        int count = 0;
        while (count < quantity) {
            totalPrice += meat[type].getPrice();
            meat[type].add();
            count++;
        }
    }


}
