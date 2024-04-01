package Homework2;
import java.util.Scanner;

public class Task1 {

    private static int Integer;
    private static Object cout;

    public static void main(String[] args) {
        exercise1();
        exercise2();
        exercise3();
        exercise4();
        exercise5();}
    public static void exercise1() {
        Scanner Console = new Scanner(System.in);
        System.out.println("Введите месяц числом: ");
        int num = Console.nextInt();
        switch (num) {
            case 12, 1, 2:
                System.out.println("Зима");
                break;
            case 3, 4, 5:
                System.out.println("Весна");
                break;
            case 6, 7, 8:
                System.out.println("Лето");
                break;
            case 9, 10, 11:
                break;
            default:
                System.out.println("Введите правильно номер месяца!");
        }
    }
    public static void exercise2() {
        {
            Scanner Console = new Scanner(System.in);
            System.out.println("Введите месяц числом: ");
            int num = Console.nextInt();
            if (num / 3 == 1)
                System.out.println("Весна");
            else if (num / 3 == 2) {
                System.out.println("Лето");
            } else if (num / 3 == 3)
                System.out.println("Осень");
            else {
                System.out.println("Зима");
            }
        }
    }
    public static void exercise3() {
        System.out.println("Введите число: ");
        Scanner console = new Scanner(System.in);
        int a = java.lang.Integer.parseInt(console.nextLine());
        if (a % 2 == 0) {
            System.out.println("Четные");
        } else {
            System.out.println("Нечетные");

        }
    }

    public static void exercise4() {
        Scanner console = new Scanner(System.in);
        System.out.println("Введите температуру: ");
        int a = console.nextInt();
        if (a > (-5)) {
            System.out.println("Тепло");
        } else if ( a > (-20)) {
            System.out.println("Нормально");
        } else {
            System.out.println("Холодно");
        }
    }

    public static void exercise5() {
        Scanner Console = new Scanner(System.in);
        System.out.println("Введите число: ");
        int num = Console.nextInt();
        switch (num) {
            case 1:
                System.out.println("Красный");
                break;
            case 2:
                System.out.println("Оранжевый");
                break;
            case 3:
                System.out.println("Жёлтый");
                break;
            case 4:
                System.out.println("Зелёный");
                break;
            case 5:
                System.out.println("Голубой");
                break;
            case 6:
                System.out.println("Синий");
                break;
            case 7:
                System.out.println("Фиолетовый");
                break;
            default:
                System.out.println("Введено неверное значение. Повторите ввод!");
        }
    }
}