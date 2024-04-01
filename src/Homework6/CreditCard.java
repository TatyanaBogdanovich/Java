package Homework6;

public class CreditCard {
    public String accountNumber;
    public double accountAmount;
    public CreditCard(String accountNumber, double accountAmount) {
        this.accountNumber=accountNumber;
        this.accountAmount = accountAmount;
    }
    public void addSum(double sum) {
        this.accountAmount = this.accountAmount + sum;
    }
    public void withdrawSum(double sum) {
        this.accountAmount = this.accountAmount - sum;
    }
    public void printInformation() {
        System.out.println("Номер карты: " + this.getAccountNumber());
        System.out.println("Сумма на счете: " + this.accountAmount);
    }
    public String getAccountNumber() {
        return accountNumber;
    }
    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }
}
