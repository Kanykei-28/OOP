package Week6;
public class Account {
    public static void main(String[] args) {
        Account a = new Account(888888, 10);
        System.out.println(a.toString());
        a.debit(1000);
        System.out.println(a.toString());
    }

    private int accountNumber;
    private double balance;

    public Account(int accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;

    }

    public Account() {
        this.balance=0.0;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void credit(double amount){
        balance = balance + amount;

    }

    public void debit(double amount){

        if (amount > balance) {
            System.out.println("amount withdrawn exceeds the current balance!" );
        } else {
            balance = balance - amount;
        }
    }

    @Override
    public String toString() {
        return String.format("A/C no: %d Balance=%.2f",getAccountNumber(), getBalance());
    }

    public void print(){
        System.out.println(this.toString());
    }
}
