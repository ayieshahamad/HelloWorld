package july27;

public class Sales {
    private Item []item;
    private Person person;

    public Sales(int itemArraySize){
        item = new Item[itemArraySize];
        person = new Person();
    }

    public Sales(Item[] item) {
        this.item = item;
    }

    public void setItem(Item[] item) {
        this.item = item;
    }

}