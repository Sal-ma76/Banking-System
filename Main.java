import java.util.Scanner;
public class Main{
      public static void main(String[] args) {
         Bank bank = new Bank();
         Scanner scanner = new Scanner(System.in);
         while (true) {
            System.out.println("Welcome\n 1. Create New Account\n 2. Deposit\n 3. Withdraw\n 4. View Balance\n 5. Exit");
            int choice = scanner.nextInt();

          // ...existing code...
if(choice==1){
    System.out.println("Enter Account Number:");
    String acc = scanner.next();
    System.out.println("Enter User Name:");
    String name = scanner.next();
    System.out.println("Enter Initial Deposit:");
    double dep = scanner.nextDouble();
    boolean success = bank.createAccount(acc, name, dep);
    if (success) {
        System.out.println("Account Created Successfully");
    } else {
        System.out.println("Account creation failed (maybe account already exists).");
    }
}

if(choice==2){
    System.out.println("Enter Account Number:");
    String acc = scanner.next();
    var account = bank.getAccount(acc);
    if (account != null) {
        System.out.println("Enter Amount to Deposit:");
        double Amount = scanner.nextDouble();
        account.deposit(Amount);
        System.out.println("Deposit Successful");
    } else {
        System.out.println("Account not found.");
    }
}

if(choice==3){
    System.out.println("Enter Account Number:");
    String acc= scanner.next();
    var account = bank.getAccount(acc);
    if (account != null) {
        System.out.println("Enter Amount to Withdraw:");
        double Amount = scanner.nextDouble();
        boolean success = account.withdraw(Amount);
        if (success) {
            System.out.println("Withdraw Successful");
        } else {
            System.out.println("Insufficient funds.");
        }
    } else {
        System.out.println("Account not found.");
    }
}

if(choice==4){
    System.out.println("Enter Account Number:");
    String acc=scanner.next();
    var account = bank.getAccount(acc);
    if (account != null) {
        System.out.println(account.getDetails());
    } else {
        System.out.println("Account not found.");
    }
}
 if(choice==5){
     System.out.println("Thank you for using the Banking System!");
        break;
    } 
}
  scanner.close();
      }
}