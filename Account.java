public class Account {
    private String accountNumber;
    private String name;
    private double balance;

    public Account(String accNumber, String Name, double Balance) {
        accountNumber = accNumber;
        name = Name;
        balance = Balance;
    }

    public void deposit(double amount){
        if (amount > 0) {
            balance += amount;
        }
    }
    public boolean withdraw(double amount){
        if (amount > 0 && amount <= balance){
            balance -= amount;
            return true;
        }
        return false;
    }
    public double getBalance(){
        return balance;
    }
    public String getDetails() {
        return accountNumber + " - " + name + " - Balance: E£ " + balance;
    }
}
