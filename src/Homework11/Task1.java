package Homework11;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        List<Integer> positiveNums = new ArrayList<>();
        System.out.print("Введите целые положительные числа (завершите ввод  отрицательнмым числом): ");
        while (true) {
            if (scan.hasNextInt()) {
                int number = scan.nextInt();
                if (number < 0) {
                    break;
                } else {
                    positiveNums.add(number);
                }
            } else {
                System.out.println("Неверное значение числа");
                scan.next();
            }
        }
        int sum = 0;
        for (int number : positiveNums) {
            sum += number;
        }
        System.out.println("Сумма введенных целых положительных чисел: " + sum);
        scan.close();
    }
}
