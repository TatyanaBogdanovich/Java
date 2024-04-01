package Homework1;

import java.util.Scanner;
public class Task3 {

    public static void main(String[] args)
    {
        Scanner console = new Scanner(System.in);
        System.out.println("Введите первое число: ");
        int a =  Integer.parseInt(console.nextLine());
        System.out.println("Введите второе число: ");
        int b =  Integer.parseInt(console.nextLine());
        boolean result = a == b;
        System.out.println("Результат: a равно b? " +result);
    }

}