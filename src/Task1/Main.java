package Task1;

public class Main {
    public static void main(String[] args) {

        Phone phoneOne = new Phone("375 29 111 11 11", "iPhone", "168g");
        Phone phoneTwo = new Phone("375 33 222 22 22", "Samsung", "130g");
        Phone phoneThree = new Phone("375 44 333 33 33", "Huawei", "121g");

        phoneOne.receiveCall("Tanya");
        System.out.println("Номер : " + phoneOne.getNumber());
        phoneTwo.receiveCall("Kira");
        System.out.println("Номер : " + phoneTwo.getNumber());
        phoneThree.receiveCall("Oleg");
        System.out.println("Номер : " + phoneThree.getNumber());

        phoneOne.receiveCall("Tanya", "375 29 111 11 11");
        phoneTwo.receiveCall("Kira", "375 33 222 22 22");
        phoneThree.receiveCall("Oleg", "375 44 333 33 33");

        phoneOne.sendMessage("375 29 111 11 11", "375 33 222 22 22", "375 44 333 33 33");
        System.out.println();
    }
}