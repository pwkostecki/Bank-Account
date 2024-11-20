public class Test {
    public static void main(String[] args) {
        //bank acc
        BankAccount account = new BankAccount("123456", "fein fein", 1000.0, "fein123");

        //login
        account.login("password123");
        System.out.println("Logged in successfully.");

        //deposit
        account.deposit(500.0);
        System.out.println("Deposited $500. Current balance: " + account.getBalance());

        //withdraw
        account.withdraw(200.0);
        System.out.println("Withdrew $200. Current balance: " + account.getBalance());

        //logout
        account.logout();
        System.out.println("Logged out successfully.");
    }
}
