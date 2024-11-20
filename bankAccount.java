public class BankAccount {
    private String accountNumber;
    private String accountHolderName;
    private double balance;
    private boolean loggedIn;
    private String password;

    public BankAccount(String accountNumber, String accountHolderName, double initialBalance, String password) {
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        this.balance = initialBalance;
        this.loggedIn = false;
        this.password = password;
    }

    public double getBalance() {
        if (loggedIn) {
            return balance;
        } else {
            throw new IllegalStateException("You must be logged in to view the balance.");
        }
    }

    public void deposit(double amount) {
        if (loggedIn) {
            if (amount > 0) {
                balance += amount;
            } else {
                throw new IllegalArgumentException("Deposit amount must be positive.");
            }
        } else {
            throw new IllegalStateException("You must be logged in to deposit money.");
        }
    }

    public void withdraw(double amount) {
        if (loggedIn) {
            if (amount > 0 && amount <= balance) {
                balance -= amount;
            } else {
                throw new IllegalArgumentException("Invalid withdraw amount.");
            }
        } else {
            throw new IllegalStateException("You must be logged in to withdraw money.");
        }
    }

    public void login(String password) {
        if (this.password.equals(password)) {
            loggedIn = true;
        } else {
            throw new IllegalArgumentException("Invalid password.");
        }
    }

    public void logout() {
        loggedIn = false;
    }

    @Override
    public String toString() {
        return "BankAccount{" +
                "accountNumber='" + accountNumber + '\'' +
                ", accountHolderName='" + accountHolderName + '\'' +
                ", balance=" + balance +
                ", loggedIn=" + loggedIn +
                '}';
    }
}

