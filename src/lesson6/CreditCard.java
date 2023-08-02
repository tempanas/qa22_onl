package lesson6;

public class CreditCard {
    String accountNumber;
    double balance;

    CreditCard(double balance, String accountNumber) {
        this.balance = 0.00;
        this.accountNumber = "BY74ALF30140000000000000000";
    }

    double BalanceRefill(double cashIn) {
        balance = balance + cashIn;
        return balance;
    }

    double BalanceWithdroawal(double cashOut) {
        balance = balance - cashOut;
        return balance;
    }

    void CardInfo() {
        System.out.println("Card " + accountNumber + " balance is " + balance);
    }
}
