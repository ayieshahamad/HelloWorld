//QUESTION 2
package july18;

public class Account {
    String accountNumber;
    int balance;
    Person owner;

    public Account() {
    }

    public Account(String accountNumber, int balance, Person owner) {
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.owner = owner;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public Person getOwner() {
        return owner;
    }

    public void setOwner(Person owner) {
        this.owner = owner;
    }

    public boolean checkBalance(){
        if(balance < 0)
            return false;
        return true;
    }
    public void transaction(int amount, int transactionType){//1 deposite //withdraw
        if(transactionType == 1)
            balance = balance + amount;
        else
            balance = balance - amount;
        //chaeck balance here
        System.out.println("transaction type: "+ ((transactionType == 1) ? "deposite":"withdraw") +" amount: "+ amount);
    }
    @Override
    public String toString() {
        return "Account{" +
                "accountNumber='" + accountNumber +
                ", balance=" + balance +
                ", owner=" + owner +
                '}';
    }
}
