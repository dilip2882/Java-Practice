package in.dilip.challenge78;

public class Customer {
    public static void main(String[] args) {
        BankAccount account = new BankAccount("001", "Dilip Patel");
        account.depositMoney(100);
        System.out.println(account.withdrawalMoney(200));
        account.depositMoney(-40);
        account.withdrawalMoney(-39);
    }
}
