//QUESTION 2
package july18;

public class Person {
    private String name;
    private  String surname;
    private String phone;
    public Person(){
        name = "";
        surname = "";
        phone = "";
    }
    public Person(String name, String surname, String phone){
        this.name = name;
        this.surname = surname;
        this.phone = phone;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name  +
                ", surname='" + surname  +
                ", phone='" + phone  +
                '}';
    }

    public boolean checkPhoneNum(){
        if(phone.length() == 9) {

            return true;
        }
        return false;
    }
}
