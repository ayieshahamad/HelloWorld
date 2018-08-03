package aug1;

public class DerivedClass extends BaseClass {
    private int i ;
    public DerivedClass(int i){
        this.i = i;
    }
    public void print(){
        System.out.println(i);
    }
}
