package Homework1;
import java.util.Random;
import java.util.Scanner;

public class Task1 {

    public static void main(String[] args) {
        exercise1();
    }
    public static void exercise1() {
        {
            Scanner Console = new Scanner(System.in);
            System.out.println("Введите месяц числом: ");
            int num = Console.nextInt();
            if (num / 3 == 1)
                System.out.println("весна");
            else if (num / 3 == 2) {
                System.out.println("лето");
            } else if (num / 3 == 3)
                System.out.println("осень");
            else {
                System.out.println("зима");
            }
        }
    }
}

