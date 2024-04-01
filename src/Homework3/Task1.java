package Homework3;
import java.util.Random;
import java.util.Scanner;

import static java.lang.Math.*;

public class Task1 {
    private static int Integer;
    private static Object cout;
    private static int mass;

    public static void main(String[] args) {
        exercise1();
        exercise2();
        exercise3();
        exercise4();
        exercise5();
    }

    public static void exercise1() {

        Scanner scan = new Scanner(System.in);
        System.out.print("Введите число: ");

        int a = scan.nextInt();
        int[] array1 = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        for (int i = 0; i < array1.length; i++) {
            if (array1[i] == a) {
                System.out.println("Число включено в массив.");
                return;
            }
        }
        System.out.println("Число не включено в массив.");
    }

    public static void exercise2() {

        Scanner scan = new Scanner(System.in);
        System.out.print("Введите число: ");
        int inputValueFromKeyboard = scan.nextInt();
        int[] array1 = new int[]{1, 4, 5, 8, 11, 66, 77, 88, 99};
        int[] array2;
        int removesValues = 0;
        for (int i = 0; i < array1.length; i++) {
            if (array1[i] == inputValueFromKeyboard) {
                removesValues++;
            }
        }
        if (removesValues == 0) {
            System.out.println("Число не включено в массив.");
        } else {
            System.out.print("Новый массив: ");
            array2 = new int[array1.length - removesValues];
            for (int i = 0, k = 0; i < array1.length; i++) {
                if (array1[i] != inputValueFromKeyboard) {
                    array2[k] = array1[i];
                    System.out.print(" " + array2[k]);
                    k++;
                }
            }
            System.out.println();
        }
    }

    public static void exercise3() {

        int n = 100;
        double[] array = new double[n];
        for (int i = 0; i < array.length; i++) {
            array[i] = random();
        }

        double max = array[0];
        double min = array[0];
        double avg = 0;
        for (int i = 0; i < array.length; i++) {
            if (max < array[i])
                max = array[i];
            if (min > array[i])
                min = array[i];
            avg += array[i] / array.length;
        }

        System.out.println("max = " + max);
        System.out.println("min = " + min);
        System.out.println("avg = " + avg);
    }

    public static void exercise4() {

        int[] array1 = new int[]{10, 20, 30, 40, 50};
        int[] array2 = new int[]{3, 6, 9, 12, 15};

        long sum1 = 0;
        long sum2 = 0;
        double arr1;
        double arr2;


        System.out.print("\nМассив 1: ");
        for (int i = 0; i < array1.length; i++) {
            sum1 += array1[i];
            System.out.print(" " + array1[i]);
        }

        System.out.print("\nМассив 2: ");
        for (int i = 0; i < array2.length; i++) {
            sum2 += array2[i];
            System.out.print(" " + array2[i]);
        }

        arr1 = (double) sum1 / array1.length;
        arr2 = (double) sum2 / array2.length;
        if (arr1 == arr2)
            System.out.println("\nМассив 1: + " + arr1 + "  = Массив 2: " + arr2);
        else if (arr1 > arr2)
            System.out.println("\nМассив 1: " + arr1 + "  > Массив 2: " + arr2);
        else if (arr1 < arr2)
            System.out.println("\nМассив 1: " + arr1 + "  < Массив 2: " + arr2);
    }

    public static void exercise5() {

        Scanner sc = new Scanner(System.in);
        Random r = new Random();
        int n = sc.nextInt();
        do {
            System.out.print("Введите размер массива array (5 < array ≤ 10)");
            while (!sc.hasNextInt()) {
                System.out.println("Ошибка ввода целого числа");
                sc.next();
            }
            if (n <= 5 || n > 10) {
                System.out.println("Неверный диапозон вводимых чисел");
                sc.next();
            }
        } while (n <= 5 || n > 10);
        int[] array1 = new int[n];
        for (int i = 0; i < array1.length; i++) {
            array1[i] = r.nextInt(20);
            System.out.print(array1[i] + " ");
        }
        int count = 0;
        for (int i = 0; i < array1.length; i++) {
            if (array1[i] % 2 == 0) {
                count++;
            }
        }
        System.out.println("\n Второй массив из четных чисел: " + " " + "\n");
        int[] array2 = new int[count];
        int index = 0;
        for (int i = 0; i < array1.length; i++) {
            if (array1[i] % 2 == 0) {
                array2[index] = array1[i];
                System.out.print(array2[index] + " ");
            } else {
                i = 1;
            }
        }
    }
}