import java.util.HashMap;
public class Bank {
    private HashMap<String, Account> accounts = new HashMap<>();
    public boolean createAccount(String acc, String name, double dep) {
    if (accounts.containsKey(acc)) {
        return false; // Account already exists
    }
    accounts.put(acc, new Account(acc, name, dep));
    return true; // Account created successfully
}
    public Account getAccount(String accNum) {
        return accounts.get(accNum);
    }
    
}
