package Homework2;
import java.io.Console;
import java.util.Scanner;

public class Task2 {

    private static int Integer;
    private static Object cout;

    public static void main(String[] args) {
        exercise1();
        exercise2();
        exercise3();
        exercise4();
    }

    public static void exercise1() {

        int i = 1;

        for (i = 1; i <= 99; i += 2) {
            if (i % 2 != 0) {

                System.out.print(i + " ");
            }
        }
    }
    public static void exercise2() {

        System.out.println();
        System.out.print("Введите число: ");
        Scanner console = new Scanner(System.in);
        int a = console.nextInt();
        int sum = 0;
        for (int i = 0; i <= a; i ++) {
            sum += i;
        }
        System.out.println();
        System.out.println(sum);
    }
    public static void exercise3() {
        int result;
        int i = 1;
        while (i <= 14) {
            result = 7 * i;

            System.out.print(result + " ");
            i++;
        }
        System.out.println();
    }
    public static void exercise4() {
        for (int i = 10; i < 21; i++) {
            System.out.print(i*i  + " ");
        }
    }
}