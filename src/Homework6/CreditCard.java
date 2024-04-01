package Homework6;
public class CreditCard {
    private final String accountNumber;
    private double accountAmount;
    public CreditCard(String accountNumber, double accountAmount) {
        this.accountNumber=accountNumber;
        this.accountAmount = accountAmount;
            }
    public void addSum(double sum) {
        this.accountAmount = this.accountAmount + sum;
        System.out.println("Номер карты: " + accountNumber);
        System.out.println("Сумма на счете: " + accountAmount);
    }

    public void withdrawSum(double sum) {
        if (accountAmount >= sum){
            accountAmount -= sum;
        System.out.println("Номер карты: " + accountNumber);
        System.out.println("Сумма на счете: " + accountAmount);
    }
        else
    {
        System.out.println("Недостаточно средств");
        System.out.println("Номер карты: " + accountNumber);
        System.out.println("Сумма на счете: " + accountAmount);
    }
}
}



