package in.dilip.challenge78;

public class BankAccount {
    private String accountNumber;
    private String accountHolderName;
    private double balance;

    public BankAccount(String accountNumber, String accountHolderName) {
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
    }

    public void depositMoney(double money) {
        if (money <= 0) {
            System.out.println("Invalid withdrawal");
        }
        balance += money;
    }

    public double withdrawalMoney(double money) {
        if (balance <= 0) {
            System.out.println("Invalid withdrawal");
        } else if (balance >= money) {
            balance -= money;
        } else {
            money = balance;
            balance = 0;
            System.out.printf("Only %s withdrawal and now your balance is %s", money, balance);
        }
        return money;
    }
}
