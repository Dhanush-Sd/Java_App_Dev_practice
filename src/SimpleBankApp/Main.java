package SimpleBankApp;


public class Main {
    public static void main(String[] args) {
        Account DhanushAccount = new Account("12345",0.0,"Dhanush","xyz@gmail.com","123456789");
        DhanushAccount.DepositMoney(100);
        DhanushAccount.DepositMoney(150);
        DhanushAccount.WithDrawMoney(200);

    }
}