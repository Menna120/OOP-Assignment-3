public class BankAccount {

    private String accountID;
    private double balance;

    public BankAccount(double initialBalance) {
        if (initialBalance < 0) {
            System.out.println("Warning: Initial balance cannot be negative. Setting to 0.");
            this.balance = 0;
        } else {
            this.balance = initialBalance;
        }
        this.accountID = null;
    }

    public BankAccount() {
        this.balance = 0.0;
        this.accountID = null;
    }

    public String getAccountID() {
        return accountID;
    }

    public void setAccountID(String accountID) {
        this.accountID = accountID;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        if (balance < 0) {
            System.out.println("Warning: Balance cannot be set to a negative value. Balance remains unchanged.");
        } else {
            this.balance = balance;
        }
    }

    public boolean withdraw(double amount) {
        if (amount <= 0) {
            System.out.println("Withdrawal failed: Amount must be positive.");
            return false;
        }
        if (balance >= amount) {
            balance -= amount;
            System.out.println("Withdrew $" + amount + ". New balance: $" + balance);
            return true;
        } else {
            System.out.println("Withdrawal failed: Insufficient funds. Current balance: $" + balance);
            return false;
        }
    }

    public boolean deposit(double amount) {
        if (amount <= 0) {
            System.out.println("Deposit failed: Amount must be positive.");
            return false;
        }
        balance += amount;
        System.out.println("Deposited $" + amount + ". New balance: $" + balance);
        return true;
    }
}
