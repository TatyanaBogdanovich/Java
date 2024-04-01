package Homework6;

public class Main {

    public static void main (String[] args){
        CreditCard MasterCard = new CreditCard("1212121212121212", 5550);
        CreditCard Visa = new CreditCard("1313131313131313", 10000);
        CreditCard BelCard = new CreditCard("1515151515151515", 20000);
        MasterCard.addSum(1500);
        Visa.withdrawSum(500);
        BelCard.printInformation();
        MasterCard.printInformation();
        Visa.printInformation();
    }
}