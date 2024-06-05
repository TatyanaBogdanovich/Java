package Homework11;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        List<Integer> numbers = new ArrayList<>();
        System.out.print("Введите целые положительные числа (завершите вводом =)");
        while (true) {
            if (scan.hasNextInt()) {
                int num = scan.nextInt();
                numbers.add(num);
            } else {
                String input = scan.next();
                if (input.equals ("=")); {
                    break;
                }
            }
        }
        System.out.println(numbers);
        List<Integer> uniqueNums = new ArrayList<>();
        for (int num : numbers) {
            if (numbers.indexOf(num) == numbers.lastIndexOf(num)) {
                uniqueNums.add(num);
            }
        }
        System.out.println(uniqueNums);
    }
}