package farhan.experiments;

public class Bank {
    static Long accountNumber = 62310100119L;
    Long accNo;
    String accountName;
    Double balance;

    public Bank(String accountName, Double balance) {
        accountNumber++;
        accNo = accountNumber;
        this.accountName = accountName;
        this.balance = balance;
    }

    public void printNumber() {
        System.out.println(accountNumber);
    }

    public void addAccount() {
        System.out.println("Account No: " + accNo);
        System.out.println("Account Name: " + accountName);
        System.out.println("Account Balance: " + balance);
    }
}
