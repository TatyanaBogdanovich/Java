package Homework1;

import java.util.Scanner;
public class Task2 {
    public static void main(String[] args)
    {
        Scanner console = new Scanner(System.in);
        System.out.println("Введите первое число: ");
        int a =  Integer.parseInt(console.nextLine());
        System.out.println("Введите второе число: ");
        int b =  Integer.parseInt(console.nextLine());
        System.out.println("Введите третье число: ");
        int c = Integer.parseInt(console.nextLine());
        int result=a*b*c;
        System.out.println("Результат умножения: "+result);

    }
}